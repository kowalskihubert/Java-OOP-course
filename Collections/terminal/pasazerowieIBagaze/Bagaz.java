package terminal.pasazerowieIBagaze;

import java.util.Objects;
import java.util.Random;
import java.util.Set;

public abstract class Bagaz implements Comparable<Bagaz> {

    private int id;
    private static int idCounter = 0;
    protected Random random = new Random();

    public Bagaz() {
        this.id = idCounter++;
    }

    // HIT!! To działa ! W końcu jakiś use-case
    public abstract Set<? extends Przedmiot> pobierzPrzedmiotyZBagazu();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bagaz bagaz = (Bagaz) o;
        return id == bagaz.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int compareTo(Bagaz bagaz) {
        return bagaz.id - this.id; // malejoco po id
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

