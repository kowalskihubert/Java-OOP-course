package pralnia.elementyKieszeni;

import java.util.Objects;

public class Guzik extends ElementyKieszeni {

    private int id;
    private static int idCounter = 0;

    public Guzik() {
        id = idCounter++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guzik guzik = (Guzik) o;
        return id == guzik.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
