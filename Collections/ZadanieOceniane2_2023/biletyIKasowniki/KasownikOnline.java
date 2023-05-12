package task2.biletyIKasowniki;

import task2.systemSprzedazy.PodmiotSprzedajacyBilety;
import task2.systemSprzedazy.PodmiotWalidujacyBilet;
import task2.wyjatki.ProblemyZPolaczeniemException;

import java.util.Random;

public class KasownikOnline <T> implements  Kasownik {

    private PodmiotWalidujacyBilet systemSprzedazyBiletow;
    private T obiektGenerujacyKomunikat;

    public KasownikOnline(PodmiotWalidujacyBilet systemSprzedazyBiletow, T obiektGenerujacyKomunikat) {
        this.systemSprzedazyBiletow = systemSprzedazyBiletow;
        this.obiektGenerujacyKomunikat = obiektGenerujacyKomunikat;
    }

    public boolean walidujBilet(Bilet bilet) throws ProblemyZPolaczeniemException {
        Random random = new Random();
        if(random.nextInt(100) < 2) {
            throw new ProblemyZPolaczeniemException();
        }
        boolean walidacja = systemSprzedazyBiletow.zweryfikujBilet(bilet);
        if(!walidacja) {
            System.out.println(obiektGenerujacyKomunikat);
        }
        return walidacja;
    }

}
