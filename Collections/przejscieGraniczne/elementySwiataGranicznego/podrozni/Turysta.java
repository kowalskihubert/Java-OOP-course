package przejscieGraniczne.elementySwiataGranicznego.podrozni;

import przejscieGraniczne.elementySwiataGranicznego.Towar;
import przejscieGraniczne.elementySwiataGranicznego.TrefnyTowar;


public class Turysta extends Podrozny {

    public Turysta() {
        super(random.nextInt(14, 61));
        int ilosc = random.nextInt(10, 21);
        for (int i = 0; i < ilosc; i++) {
            if(random.nextInt(0,10) == 0) {
                super.dodajTowar(new TrefnyTowar());
            } else {
                super.dodajTowar(new Towar());
            }
        }
    }
}
