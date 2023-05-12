package przejscieGraniczne.elementySwiataGranicznego.podrozni;

import przejscieGraniczne.elementySwiataGranicznego.Towar;
import przejscieGraniczne.elementySwiataGranicznego.TrefnyTowar;

public class Przemytnik extends Nikczemnik {

    public Przemytnik() {
        super();
        int ilosc = random.nextInt(31);
        for (int i = 0; i < ilosc; i++) {
            if(random.nextInt(0,10) < 4) {
                super.dodajTowar(new TrefnyTowar());
            }
            else {
                super.dodajTowar(new Towar());
            }
        }

    }
}
