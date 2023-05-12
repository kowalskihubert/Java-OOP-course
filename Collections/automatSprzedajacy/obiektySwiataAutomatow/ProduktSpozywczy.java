package automatSprzedajacy.obiektySwiataAutomatow;

import java.util.Random;

public abstract class ProduktSpozywczy implements Comparable<ProduktSpozywczy> {

    protected static Random random = new Random();
    protected double zawartoscCukruWMasie; // jako ułamek od 0.0 do 1.0

    protected ProduktSpozywczy(double zawartoscCukruWMasie) {
        this.zawartoscCukruWMasie = zawartoscCukruWMasie;
    }

    public abstract int getSugarContent();

    public int compareTo(ProduktSpozywczy o) {
        if(this.zawartoscCukruWMasie == o.zawartoscCukruWMasie)
            return 0;
        return this.zawartoscCukruWMasie < o.zawartoscCukruWMasie ? -1 : 1;
    }

    // Nie ma potrzeby nadpisywać equals(), bo zakładamy że 2 różne obiekty (w pamięci) są różne
}
