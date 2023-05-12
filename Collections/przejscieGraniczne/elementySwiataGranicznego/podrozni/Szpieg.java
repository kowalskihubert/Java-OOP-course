package przejscieGraniczne.elementySwiataGranicznego.podrozni;

import przejscieGraniczne.elementySwiataGranicznego.Towar;

public class Szpieg extends Nikczemnik {

    public Szpieg() {
        super();
        int ilosc = random.nextInt(2, 4);
        for (int i = 0; i < ilosc; i++) {
            super.dodajTowar(new Towar());
        }
    }
}
