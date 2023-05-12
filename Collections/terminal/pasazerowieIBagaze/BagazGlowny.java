package terminal.pasazerowieIBagaze;

import java.util.HashSet;
import java.util.Set;


public class BagazGlowny extends Bagaz{

    private Set<PrzedmiotLegalny> przedmiotyWBagazu =  new HashSet<>();

    public BagazGlowny() {
        int ilosc = random.nextInt(2, 11);
        for(int i = 0; i < ilosc; i++) {
            this.przedmiotyWBagazu.add(new PrzedmiotLegalny());
        }
    }

    @Override
    public Set<PrzedmiotLegalny> pobierzPrzedmiotyZBagazu() {
        return this.przedmiotyWBagazu;
    }
}
