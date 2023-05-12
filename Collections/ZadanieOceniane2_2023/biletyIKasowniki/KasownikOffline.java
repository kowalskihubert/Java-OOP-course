package task2.biletyIKasowniki;

import task2.systemSprzedazy.PodmiotInformujacyOSprzedanychBiletach;
import task2.systemSprzedazy.SystemSprzedazyBiletow;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class KasownikOffline implements Kasownik {

    private List<Bilet> sprzedaneBilety = new LinkedList<>();
    private Set<Bilet> sprawdzoneBilety = new HashSet<>();
    private PodmiotInformujacyOSprzedanychBiletach systemSprzedazyBiletow;

    public KasownikOffline(PodmiotInformujacyOSprzedanychBiletach systemSprzedazyBiletow) {
        this.systemSprzedazyBiletow = systemSprzedazyBiletow;
    }

    public boolean walidujBilet(Bilet bilet) {
        if(sprzedaneBilety.contains(bilet)) {
            sprawdzoneBilety.add(bilet);
            sprzedaneBilety.remove(bilet);
            return true;
        }
        return false;
    }

    public void wgrajInfoOSprzedanychBiletach() {
        sprzedaneBilety.clear();
        sprzedaneBilety.addAll(systemSprzedazyBiletow.getSprzedaneBilety());
    }
}

