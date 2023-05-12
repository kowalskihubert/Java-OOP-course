package dyskoteka.obiektyDyskoteki;

import dyskoteka.wyjatki.ExceededCapacityException;

import java.util.Random;

public class OchroniarzMaly {

    private Sala malaSala;
    private Sala duzaSala;
    private Hol hol;

    public OchroniarzMaly(Sala malaSala, Sala duzaSala, Hol hol) {
        this.duzaSala = duzaSala;
        this.malaSala = malaSala;
        this.hol = hol;
    }

    public boolean check(Uczestnik uczesnikDyskoteki) {
        if(uczesnikDyskoteki == null) return false;
        if(uczesnikDyskoteki.getAge() >= 18 ) {
            Random random = new Random();
            try {
                if(random.nextBoolean()) {
                    malaSala.dodajUczestnika(uczesnikDyskoteki);
                }
                else {
                    duzaSala.dodajUczestnika(uczesnikDyskoteki);
                }
            }
            catch(ExceededCapacityException e) {
                System.out.println("Ochroniarz mówi, że " + e.getMessage());
                e.printStackTrace();
                return false;
            }
            return true; // Jeśli jesteśmy tu to nie bylo wyjątku
        }
        else return false; // Jeśli nie ma nawet 18 lat
    }



}
