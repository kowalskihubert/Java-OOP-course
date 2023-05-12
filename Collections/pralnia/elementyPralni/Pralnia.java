package pralnia.elementyPralni;

import pralnia.elementyKieszeni.ElementyKieszeni;
import pralnia.elementyKieszeni.Granat;
import pralnia.ubrania.Ubranie;
import pralnia.wyjatki.OdbezpieczonyGranatException;

// IntelliJ wymusza zaimportowanie całego java.util ale wiem, że nie jest to potrzebne
import java.util.*;

public class Pralnia <T> implements Pralniowate {

    private Set<Ubranie> ubraniaDoPrania = new HashSet<>();
    private Set<Ubranie> ubraniaWyprane = new LinkedHashSet<>();
    private Map<Ubranie, List<ElementyKieszeni>>  mapaZawartosciKieszeni = new HashMap<>();
    private T certyfikat;

    public Pralnia(T certyfikat) {
        this.certyfikat = certyfikat;
    }

    @Override
    public void putToWash(Ubranie ubranie) {
        ubraniaDoPrania.add(ubranie);
    }

    @Override
    public void washAll() throws OdbezpieczonyGranatException{
        Iterator<Ubranie> iterator = ubraniaDoPrania.iterator();
        while(iterator.hasNext()) {
            Ubranie ubranie = iterator.next();
            iterator.remove(); // usuwa z ubraniaDoPrania

            List<ElementyKieszeni> zawartoscKieszeni = new LinkedList<>(ubranie.getKieszen());
            ubranie.getKieszen().clear();

            // Sprawdzamy czy jest tam granat
            for(ElementyKieszeni elementKieszeni : zawartoscKieszeni) {
                if(elementKieszeni instanceof Granat) {
                    if(((Granat)elementKieszeni).isOdbezpieczony()) {
                        throw new OdbezpieczonyGranatException();
                    }
                }
            }
            mapaZawartosciKieszeni.put(ubranie, zawartoscKieszeni);
            ubranie.setCzysty(true);
            ubraniaWyprane.add(ubranie);
        }
    }

    @Override
    public Set<Ubranie> pickUpWashedClothes() {
        Set<Ubranie> ubrania = new LinkedHashSet<>(ubraniaWyprane);
        ubraniaWyprane.clear();
        return ubrania;
    }

    @Override
    public List<ElementyKieszeni> getPocketStuffByClothes(Ubranie ubranie) {
        if(!mapaZawartosciKieszeni.containsKey(ubranie)) {
            System.out.println("Dla tego ubrania nie mamy przedmitów z kieszeni.");
            return new LinkedList<>(); // pusta lista
        }
        // Po zmianach w Klencie powyższa część nie jest potrzebna
        List<ElementyKieszeni> zawartoscKieszeni = new LinkedList<>(mapaZawartosciKieszeni.get(ubranie));
        mapaZawartosciKieszeni.remove(ubranie);
        return zawartoscKieszeni;
    }

    public T retrieveCertificat() {
        System.out.println("Certyfikat: " + certyfikat);
        return certyfikat;
    }
}
