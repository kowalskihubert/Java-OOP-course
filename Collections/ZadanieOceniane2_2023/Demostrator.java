package task2;

import task2.biletyIKasowniki.KasownikOffline;
import task2.biletyIKasowniki.Stoliki;
import task2.osobyWPociagu.Konduktor;
import task2.osobyWPociagu.Podrozny;
import task2.systemSprzedazy.PodmiotInformujacyOSprzedanychBiletach;
import task2.systemSprzedazy.SystemSprzedazyBiletow;
import task2.wagon.Wagon;

import java.util.HashSet;
import java.util.Set;

public class Demostrator {

        public static void main(String[] args) {
            SystemSprzedazyBiletow system = new SystemSprzedazyBiletow();
            KasownikOffline kasownik = new KasownikOffline(system);
            Set<Podrozny> pasazerowie = new HashSet<>();
            for(int i=0;i<50;i++) {
                pasazerowie.add(new Podrozny(system));
            }
            Wagon wagon = new Wagon(pasazerowie);
            kasownik.wgrajInfoOSprzedanychBiletach();
            Konduktor konduktor = new Konduktor(wagon, kasownik);
            konduktor.go();

        }
}
