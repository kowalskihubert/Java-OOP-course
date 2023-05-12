package automatSprzedajacy.obiektySwiataAutomatow;

public abstract class Slodycz extends ProduktSpozywczy {

    private int masa;

    public Slodycz(double zawartosc) {
        super(zawartosc);
        this.masa = random.nextInt(20, 51) ;
    }

    public int getMasa() {
        return masa;
    }

    @Override
    public int getSugarContent() {
        return (int) (masa * zawartoscCukruWMasie);
    }

}
