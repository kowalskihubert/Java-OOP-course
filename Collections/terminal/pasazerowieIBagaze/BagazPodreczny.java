package terminal.pasazerowieIBagaze;

import java.util.LinkedHashSet;
import java.util.Set;


public class BagazPodreczny extends Bagaz{

    private Set<Przedmiot> przedmiotyWBagazu = new LinkedHashSet<>();


    public BagazPodreczny() {
        int ilosc = random.nextInt(2, 11);
        for(int i = 0; i < ilosc; i++) {
            int a = random.nextInt(10);
            if(a<7){
                this.przedmiotyWBagazu.add(new PrzedmiotLegalny());
            } else if(a == 7 || a == 8) {
                this.przedmiotyWBagazu.add(new PrzedmiotNielegalny());
            }
            else {
                this.przedmiotyWBagazu.add(new Kielbasa());
            }
        }
    }

    @Override
    public Set<Przedmiot> pobierzPrzedmiotyZBagazu() {
        return this.przedmiotyWBagazu;
    }


}
