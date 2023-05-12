package pralnia.elementyPralni;

import pralnia.ubrania.Koszula;
import pralnia.ubrania.Kufajka;
import pralnia.ubrania.Plaszcz;
import pralnia.ubrania.Ubranie;
import pralnia.wyjatki.OdbezpieczonyGranatException;

import java.util.Set;

public class Klient {

    private Pralniowate pralniaKlienta;

    public Klient(Pralniowate pralniaKlienta) {
        this.pralniaKlienta = pralniaKlienta;
    }

    public void doJob() {
        Kufajka kufajka = new Kufajka();
        Koszula koszula = new Koszula();
        Plaszcz plaszcz = new Plaszcz();
        pralniaKlienta.putToWash(kufajka);
        pralniaKlienta.putToWash(koszula);
        pralniaKlienta.putToWash(plaszcz);
        try {
            pralniaKlienta.washAll();
            Set<Ubranie> wypraneUbrania = pralniaKlienta.pickUpWashedClothes();
            for(Ubranie ubranie : wypraneUbrania) {
                pralniaKlienta.getPocketStuffByClothes(ubranie);
            }
        } catch (OdbezpieczonyGranatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
