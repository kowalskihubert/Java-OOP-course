package pralnia.elementyPralni;

import pralnia.elementyKieszeni.ElementyKieszeni;
import pralnia.ubrania.Ubranie;
import pralnia.wyjatki.OdbezpieczonyGranatException;

import java.util.List;
import java.util.Set;

public interface Pralniowate {

    void putToWash(Ubranie ubranie);
    void washAll() throws OdbezpieczonyGranatException;
    Set<Ubranie> pickUpWashedClothes();
    List<ElementyKieszeni> getPocketStuffByClothes(Ubranie ubranie);

}
