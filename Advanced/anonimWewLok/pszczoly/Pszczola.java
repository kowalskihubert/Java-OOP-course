package anonimWewLok.pszczoly;

public abstract class Pszczola implements Runnable {

    protected String imie;
    protected int silaAtaku;
    protected int wiek;

    public Pszczola(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public Pszczola() {}

    @Override
    public String toString() {
        return imie + " " + "(atak: " + silaAtaku + "), żyję " + wiek + "dni";
    }

    public String getImie() {
        return imie;
    }

    public int getSilaAtaku() {
        return silaAtaku;
    }
}
