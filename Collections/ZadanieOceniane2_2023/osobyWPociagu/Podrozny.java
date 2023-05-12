package task2.osobyWPociagu;

import task2.biletyIKasowniki.Bilet;
import task2.biletyIKasowniki.Relacja;
import task2.systemSprzedazy.PodmiotSprzedajacyBilety;

import java.util.List;
import java.util.Random;

public class Podrozny implements Comparable<Podrozny> {

    protected static Random random = new Random();
    private static List<String> imiona = List.of("Jan", "Anna", "Piotr", "Zofia", "Krzysztof", "Maria", "Stanisław", "Barbara", "Tomasz", "Katarzyna");
    private static List<String> nazwiska = List.of("Nowak", "Kowalski", "Wiśniewski", "Wójcik", "Kowalczyk", "Kamiński", "Lewandowski", "Zieliński", "Szymański", "Woźniak");
    private String imie;
    private String nazwisko;
    private Bilet bilet;
    private int stopienWyglodzenia;
    private PodmiotSprzedajacyBilety systemSprzedazyBiletow;

    public Podrozny(PodmiotSprzedajacyBilety systemSprzedazyBiletow) {
        this.imie = imiona.get(random.nextInt(imiona.size()));
        this.nazwisko = nazwiska.get(random.nextInt(nazwiska.size()));
        this.stopienWyglodzenia = random.nextInt(1, 11);
        this.systemSprzedazyBiletow = systemSprzedazyBiletow;
        this.bilet = systemSprzedazyBiletow.sprzedajBilet(imie, nazwisko, Relacja.losujRelacje());
    }

    public Bilet getBilet() {
        return bilet;
    }

    @Override
    public int compareTo(Podrozny o) {
        return o.stopienWyglodzenia - this.stopienWyglodzenia;
    }


}

