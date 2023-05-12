package dyskoteka.obiektyDyskoteki;

import dyskoteka.wyjatki.ExceededCapacityException;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sala {

    private int maxCapacity;
    private Set<Uczestnik> uczestnicyNaSali;

    public Sala() {
        uczestnicyNaSali = new LinkedHashSet<>();
    }

    public Sala(Collection<Uczestnik> c, int maxCapacity) throws ExceededCapacityException {
        if(c.size() > maxCapacity) throw new ExceededCapacityException("Za dużo uczestników");
        this.maxCapacity = maxCapacity;
        uczestnicyNaSali = new LinkedHashSet<>(c);
    }

    public void dodajUczestnika(Uczestnik uczestnik) throws ExceededCapacityException {
        if(uczestnicyNaSali.size()+1 > maxCapacity) throw new ExceededCapacityException("Za dużo uczestników");
        else uczestnicyNaSali.add(uczestnik);
    }

    public void ustawPojemnoscSali(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Set<Uczestnik> getUczestnicyNaSali() {
        return uczestnicyNaSali;
    }

    public void printUczestnicy() {
        String txt = "Uczestnicy na sali: [";
        for(Uczestnik uczestnik : uczestnicyNaSali) {
            txt += uczestnik + "\n";
        }
        txt += "]";
        System.out.println(txt);
    }

}
