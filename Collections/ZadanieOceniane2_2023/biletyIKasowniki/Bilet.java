package task2.biletyIKasowniki;

import java.util.Objects;

public class Bilet {

    private String imieNabywcy;
    private String nazwiskoNabywcy;
    private Relacja relacjaPociagu;
    private String nazwaStolika;
    private boolean skasowany;
    private int kodBezpieczenstwa;

    public Bilet(String imie, String nazwisko, Relacja relacjaPociagu, String nazwaStolika) {
        this.imieNabywcy = imie;
        this.nazwiskoNabywcy = nazwisko;
        this.relacjaPociagu = relacjaPociagu;
        this.nazwaStolika = nazwaStolika;
        this.skasowany = false;
        this.kodBezpieczenstwa = Objects.hash(imie, nazwisko);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bilet bilet = (Bilet) o;
        return Objects.equals(relacjaPociagu, bilet.relacjaPociagu) && Objects.equals(nazwaStolika, bilet.nazwaStolika);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relacjaPociagu, nazwaStolika);
    }

    public String getNazwaStolika() {
        return nazwaStolika;
    }

    public void skasuj() {
        skasowany = true;
    }
}
