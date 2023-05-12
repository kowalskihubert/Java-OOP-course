package task2.wagon;

import task2.biletyIKasowniki.Bilet;
import task2.osobyWPociagu.Podrozny;

import java.util.*;

public class Wagon {

    private static int iloscStolow = 8;
    private Map<String, Set<Podrozny>> podrozniPrzyStoliku = new HashMap<>();

    public Wagon(Set<Podrozny> podrozni) {
        for(Podrozny podrozny : podrozni) {
            Bilet bilet = podrozny.getBilet();
            if(podrozniPrzyStoliku.containsKey(bilet.getNazwaStolika())) {
                podrozniPrzyStoliku.get(bilet.getNazwaStolika()).add(podrozny);
            } else {
                podrozniPrzyStoliku.put(bilet.getNazwaStolika(), new TreeSet<>(Set.of(podrozny)));
            }
        }

    }

    public Set<Podrozny> getPodrozniPrzyStoliku(String nazwaStolika) {
        return podrozniPrzyStoliku.get(nazwaStolika);
    }

}
