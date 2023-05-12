package dyskoteka.obiektyDyskoteki;

import java.util.*;

public class RejestrObcych {

    private Map<String, Set<CzlowiekZewnetrzny>> mapaDanych;

    public RejestrObcych() {
        mapaDanych = new HashMap<>();
    }

    public boolean czyJestWRejestrze(CzlowiekZewnetrzny czlowiek) {
        if(mapaDanych.containsKey(czlowiek.getName()) == false) {
            return false;
        } else {
            return mapaDanych.get(czlowiek.getName()).contains(czlowiek);
        }
    }

    public Map<String, Set<CzlowiekZewnetrzny>> getRejestr() {
        return mapaDanych;
    }

}
