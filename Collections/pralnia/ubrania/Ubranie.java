package pralnia.ubrania;

import pralnia.elementyKieszeni.ElementyKieszeni;
import pralnia.elementyKieszeni.Granat;
import pralnia.elementyKieszeni.Guzik;
import pralnia.elementyKieszeni.KartkaZAdresem;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public abstract class Ubranie {

    protected static Random random = new Random();
    private boolean czysty = false;
    private List<ElementyKieszeni> kieszen = new LinkedList<>(); // bo częste usuwanie

    public Ubranie() {
        int iloscPrzedmiotow = random.nextInt(1,4);
        for(int i=0; i<iloscPrzedmiotow; i++) {
            switch(random.nextInt(3)) {
                case 0:
                    kieszen.add(new Guzik());
                    break;
                case 1:
                    kieszen.add(new Granat());
                    break;
                case 2:
                    // Wszystkie kartki z adresem są na ulicę Kolorową
                    kieszen.add(new KartkaZAdresem("Kolorowa"));
                    break;
            }
        }
    }

    public List<ElementyKieszeni> getKieszen() {
        return kieszen;
    }

    // UWAGA zamiast tego można dać:
    public List<ElementyKieszeni> oproznijKieszen() {
        List<ElementyKieszeni> kopia = new LinkedList<>(kieszen);
        kieszen.clear();
        return kopia;
    }

    public void setCzysty(boolean czysty) {
        this.czysty = czysty;
    }
}
