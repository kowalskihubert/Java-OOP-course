package anonimWewLok.pszczoly;

public class KrolowaMatka extends Pszczola {

    protected int iloscJaj = 0;

    public KrolowaMatka(String imie, int wiek) {
        this.imie = imie;
        this.silaAtaku = 100;
        this.wiek = wiek;
    }

    public void zaplodnienie() {
        this.iloscJaj += 1000;
    }

    @Override
    public String toString() {
        return "Krolowa " + imie + " " + "(atak: " + silaAtaku + "), żyję " + wiek + "dni i będę matką dla " + iloscJaj + " pszczółek";
    }

    @Override
    public void run() {
        System.out.println("Lot godowy...");
    }
}
