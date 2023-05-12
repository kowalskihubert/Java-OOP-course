package task2.systemSprzedazy;

import task2.biletyIKasowniki.Bilet;
import task2.biletyIKasowniki.Relacja;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Random;


public class SystemSprzedazyBiletow implements PodmiotSprzedajacyBilety, PodmiotWalidujacyBilet, PodmiotInformujacyOSprzedanychBiletach{

    private static Random random = new Random();
    private Set<Bilet> sprzedaneBilety = new LinkedHashSet<>();
    private Map<String, Integer> stoliki = Map.of("Stolik1", 1, "Stolik2", 2, "Stolik3",3,  "Stolik4", 4,  "Stolik5", 5,  "Stolik6", 6,  "Stolik7", 7, "Stolik8", 8);

    public Bilet sprzedajBilet(String imie, String nazwisko, Relacja relacjaPociagu) {
        String nazwaStolika = stoliki.keySet().toArray()[random.nextInt(stoliki.size())].toString();
        Bilet bilet = new Bilet(imie, nazwisko, relacjaPociagu, nazwaStolika);
        sprzedaneBilety.add(bilet);
        return bilet;
    }

    @Override
    public boolean zweryfikujBilet(Bilet bilet) {
        if(sprzedaneBilety.contains(bilet)) {
            bilet.skasuj();
            return true;
        }
        return false;
    }

    public Set<Bilet> getSprzedaneBilety() {
        return sprzedaneBilety;
    }

}
