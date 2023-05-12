package task2.systemSprzedazy;

import task2.biletyIKasowniki.Bilet;
import task2.biletyIKasowniki.Relacja;

public interface PodmiotSprzedajacyBilety {
    Bilet sprzedajBilet(String imie, String nazwisko, Relacja relacjaPociagu);
}
