package terminal.swiatTerminalowy;

import terminal.pasazerowieIBagaze.*;

import java.util.*;

public class BramkaBezpieczenstwa implements BagazoSkanowalne {

    private Map<Pasazer, List<PrzedmiotNielegalny>> mapaPasazerPrzedmiotyNielegalne = new HashMap<>();

    public boolean skanujBagaz(Pasazer pasazer, Bagaz bagaz) throws UwagaKielbasaException {
        Set<? extends Przedmiot> przedmioty = bagaz.pobierzPrzedmiotyZBagazu();
        for(Przedmiot przedmiot : przedmioty) {
            if(przedmiot.getStopienNielegalnosci() > 0) {
                if(przedmiot instanceof Kielbasa) {
                    throw new UwagaKielbasaException();
                }
                wsadzDoMapy(pasazer, (PrzedmiotNielegalny) przedmiot);
                return false;
            }
        }
        return true;
    }

    public void wsadzDoMapy(Pasazer pasazer, PrzedmiotNielegalny przedmiotNielegalny) {
        if(mapaPasazerPrzedmiotyNielegalne.containsKey(pasazer)) {
            mapaPasazerPrzedmiotyNielegalne.get(pasazer).add(przedmiotNielegalny);
        }
        else {
            mapaPasazerPrzedmiotyNielegalne.put(pasazer, new ArrayList<>(Set.of(przedmiotNielegalny)));
        }
    }

    public Map<Pasazer, List<PrzedmiotNielegalny>> getMapa() {
        return this.mapaPasazerPrzedmiotyNielegalne;
    }
}
