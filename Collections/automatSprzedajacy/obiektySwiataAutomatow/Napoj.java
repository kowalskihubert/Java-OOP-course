package automatSprzedajacy.obiektySwiataAutomatow;

import javax.print.attribute.standard.MediaSize;

public class Napoj extends ProduktSpozywczy {

    private int objetosc;
    private static final double GESTOSC = 0.95;

    public Napoj() {
        super(random.nextInt(8,13)/100.0);
        this.objetosc = random.nextInt(100, 251);
    }

    @Override
    public int getSugarContent() {
        return (int) (objetosc * GESTOSC * zawartoscCukruWMasie);
    }
}
