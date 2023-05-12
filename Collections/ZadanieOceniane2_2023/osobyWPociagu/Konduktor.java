package task2.osobyWPociagu;

import task2.biletyIKasowniki.Bilet;
import task2.biletyIKasowniki.Kasownik;
import task2.wagon.Wagon;
import task2.wyjatki.ProblemyZPolaczeniemException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Konduktor {

    private static Map<String, Integer> stoliki = Map.of("Stolik1", 1, "Stolik2", 2, "Stolik3",3,  "Stolik4", 4,  "Stolik5", 5,  "Stolik6", 6,  "Stolik7", 7, "Stolik8", 8);
    private Kasownik kasownikDoBiletow;
    private Map<Podrozny, Bilet> niewazneBilety = new HashMap<>();
    private Wagon wagonKonduktora;

    public Konduktor(Wagon wagon, Kasownik kasownik) {
        this.wagonKonduktora = wagon;
        this.kasownikDoBiletow = kasownik;
    }

    public void go() {
        boolean walidacja = true;
        for(String stolik : stoliki.keySet()) {
            Set<Podrozny> podrozniPrzyStoliku = wagonKonduktora.getPodrozniPrzyStoliku(stolik);
            Iterator<Podrozny> iterator = podrozniPrzyStoliku.iterator();
            while(iterator.hasNext()) {
                Podrozny podrozny = iterator.next();
                Bilet bilet = podrozny.getBilet();
                try {
                    walidacja = kasownikDoBiletow.walidujBilet(bilet);
                } catch (ProblemyZPolaczeniemException e){
                    System.out.println(e.getMessage());
                }
                if(!walidacja) {
                    System.out.println("Podróżny złapany bez biletu!");
                    iterator.remove();
                    niewazneBilety.put(podrozny, bilet);
                }
            }
        }
        System.out.println("Liczba nieważnych biletów: " + niewazneBilety.size());
    }


}
