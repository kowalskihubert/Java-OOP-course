package dyskoteka.obiektyDyskoteki;

import java.util.HashSet;
import java.util.Set;

public class OchroniarzDuzy extends OchroniarzMaly {

    private RejestrObcych rejestrObcych;

    public OchroniarzDuzy(Sala malaSala, Sala duzaSala, Hol hol, RejestrObcych rejestrObcych) {
        super(malaSala, duzaSala, hol);
        this.rejestrObcych = rejestrObcych;
    }

    @Override
    public boolean check(Uczestnik uczestnikDyskoteki) {
        boolean isIn = super.check(uczestnikDyskoteki);
        if(isIn && uczestnikDyskoteki instanceof CzlowiekZewnetrzny) {
            CzlowiekZewnetrzny czlowiekZewnetrzny = (CzlowiekZewnetrzny) uczestnikDyskoteki;
            if(rejestrObcych.czyJestWRejestrze(czlowiekZewnetrzny) == false) {
                if(rejestrObcych.getRejestr().containsKey(czlowiekZewnetrzny.getName())) {
                    rejestrObcych.getRejestr().merge(czlowiekZewnetrzny.getName(), new HashSet<>(Set.of(czlowiekZewnetrzny)),
                            (oldSet, newSet) -> {
                                newSet.addAll(oldSet);
                                return newSet;
                            });
                }
                else {
                    rejestrObcych.getRejestr().put(czlowiekZewnetrzny.getName(), new HashSet<>(Set.of(czlowiekZewnetrzny)));
                }
                // Uwaga:
                // Sprawdzanie, czy rejestr zawiera klucz imię jest zbędne
                // Metoda merge() jeśli klucza jeszcze nie ma w mapie, dodaje go wraz z wartością newValue
            }
        }
        return isIn;
    }

    public void printStrangers() {
        // Przy wypisywaniu pomijamy mapowanie - informacja o imieniu i tak jest w repr tekstowej CzlowiekaZewnetrznego
        String txt = "Lista obcych: \n{ ";
        for(String name : rejestrObcych.getRejestr().keySet()) {
            for(CzlowiekZewnetrzny czlowiekZewnetrzny : rejestrObcych.getRejestr().get(name)) {
                txt += (czlowiekZewnetrzny + "\n");
            }
        }
        txt += "}";
        System.out.println(txt);
    }


}
