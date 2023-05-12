package automatSprzedajacy.swiat;

import automatSprzedajacy.obiektySwiataAutomatow.*;

import java.util.LinkedHashSet;
import java.util.Set;

public class Swiat {

    public void goLive() {
        AutomatSprzedajacy<Guma> automatSprzedajacy = new AutomatSprzedajacy();
        Set<Czlowiek> listaLudzi = new LinkedHashSet<>();
        listaLudzi.add(new Serwisant(automatSprzedajacy));
        for(int i=0; i<10; i++) {
            listaLudzi.add(new Kupiec(automatSprzedajacy));
        }

        for(Czlowiek czlowiek : listaLudzi) {
            System.out.println(czlowiek);
        }
        for(Czlowiek czlowiek : listaLudzi) {
            czlowiek.doJob();
        }

    }

}
