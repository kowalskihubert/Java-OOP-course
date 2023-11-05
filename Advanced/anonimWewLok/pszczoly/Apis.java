package anonimWewLok.pszczoly;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Apis {

    private static List<Pszczola> listaPszczol = new ArrayList<>();

    public Apis(){
        listaPszczol.add(new KrolowaMatka("Anna", 25));
        listaPszczol.add(new Robotnica("Maja", 5));
        listaPszczol.add(new Truten("Jan", 8));
        listaPszczol.add(new Truten("Piotr", 9));
        listaPszczol.add(new Truten("Krzysztof", 10));
        listaPszczol.add(new Robotnica("Agnieszka", 6));
        listaPszczol.add(new Robotnica("Kasia", 7));
        Truten.setListaPszczol(listaPszczol);
    }

    public void sortujWgSilyiImienia() {
        Comparator<Pszczola> comparator = new Comparator<>() {
            @Override
            public int compare(Pszczola o1, Pszczola o2) {
                if(o1.silaAtaku == o2.silaAtaku) {
                    return o1.imie.compareTo(o2.imie);
                }
                return o1.silaAtaku - o2.silaAtaku;
            }
        };
        listaPszczol.sort(comparator); // użycie klasy anonimowej dla komparatora !!!
    }

    public void watkiPszczol() {
        for(Pszczola pszczola : listaPszczol) {
            pszczola.run();
        }
    }

    public void zyciePszczol() {
        int iloscT = 0;
        int iloscR = 0;
        for(Pszczola pszczola : listaPszczol) {
            if(iloscT <= 2 & pszczola instanceof Truten & ((Truten) pszczola).isPrzydatny()){
                for(Pszczola pszczola1 : listaPszczol) {
                    if(pszczola1 instanceof KrolowaMatka) {
                        ((Truten) pszczola).zaplodnienie((KrolowaMatka) pszczola1);
                        iloscT++;
                    }
                }
            }
            if(iloscR <= 3 & pszczola instanceof Robotnica) {
                ((Robotnica) pszczola).zbierajNektar(new Random().nextInt(0,20));
                iloscR++;
            }
        }
    }

    public void sortujWgPorownaniaSily(){
        listaPszczol.sort(new PorownanieSily());
    }

    public void dodajPszczole(String imie, int wiek) {
        Random random = new Random();
        int losowa = random.nextInt(0, 2);
        switch (losowa) {
            case 0 -> listaPszczol.add(new Truten(imie, wiek));
            case 1 -> listaPszczol.add(new Robotnica(imie, wiek));
            case 2 -> listaPszczol.add(new KrolowaMatka(imie, wiek));
        }
    }

    public Zwierz.Kot wypiszZwierzaKota() {
        Zwierz.Kot kot = new Zwierz.Kot("Filemon", 5);
        return kot;
    }

    public void dodajZolnierza(String imie, int wiek) {
        Pszczola zolenierz = new Pszczola(imie, wiek) {
            @Override
            public String toString() {
                return "Żołnierz " + imie + " " + "(atak: " + silaAtaku + "), żyję " + wiek + "dni i potrafię żądlić!";
            }

            @Override
            public void run() {
                System.out.println("Walka to moje życie!!!");
            }
        };
        listaPszczol.add(zolenierz);
    }

    public List<Pszczola> getListaPszczol() {
        return listaPszczol;
    }

    private static class PorownanieSily implements Comparator<Pszczola> {
        @Override
        public int compare(Pszczola o1, Pszczola o2) {
            return o1.silaAtaku - o2.silaAtaku;
        }
    }

    // TO CO PONIŻEJ STANOWI TEST, NIE OBOWIĄZKOWĄ CZĘŚĆ ZADANIA

    public static abstract class Zwierz {
        protected String imie;
        protected int wiek;

        public static class Kot extends Zwierz{
            protected boolean czyDrapie = true;

            public Kot(String imie, int wiek) {
                this.imie = imie;
                this.wiek = wiek;
            }

            public String toString() {
                return "imie: " + imie + ", wiek: " + wiek + ", drapie:  " + czyDrapie;
            }
        }

    }

}
