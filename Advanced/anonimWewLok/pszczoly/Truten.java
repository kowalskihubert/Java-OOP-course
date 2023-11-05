package anonimWewLok.pszczoly;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;

public class Truten extends Pszczola {

    private boolean przydatny = true;
    private static List<Pszczola> listaPszczol;

    public Truten(String imie, int wiek) {
        this.imie = imie;
        this.silaAtaku = 0;
        this.wiek = wiek;
    }

    public void zaplodnienie(KrolowaMatka krolowa) {
        if (przydatny) {
            krolowa.zaplodnienie();
            przydatny = false;
            System.out.println(imie + " - byłem z Królową! Można umierać...");
        }
        else System.out.println("Nie jestem już przydatny");
    }

    public static void setListaPszczol(List<Pszczola> lista){
        listaPszczol = lista;
    }

    public boolean isPrzydatny() {
        return przydatny;
    }

    @Override
    public String toString() {
        if(przydatny)  return "Truten " + imie + " " + "(atak: " + silaAtaku + "), żyję " + wiek + "dni";
        else return "Truten " + imie + " " + "(atak: " + silaAtaku + "), spełniłem swoje zadanie i umarłem";
    }

    @Override
    public void run() {
        Random random = new Random();
        if(random.nextBoolean()) {
            for (Pszczola pszczola : listaPszczol) {
                if (pszczola instanceof KrolowaMatka) {
                    zaplodnienie((KrolowaMatka) pszczola);
                }
            }
        }
        else System.out.println("nie robię nic");
    }
}
