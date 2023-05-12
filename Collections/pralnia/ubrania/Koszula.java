package pralnia.ubrania;

import pralnia.elementyKieszeni.Guzik;

import java.util.LinkedHashSet;
import java.util.Set;

public class Koszula extends UbranieZRozmiarem{

    private Set<Guzik> guziki = new LinkedHashSet<>();

    public Koszula() {
        for(int i =0; i<6; i++) {
            guziki.add(new Guzik());
        }
    }
}
