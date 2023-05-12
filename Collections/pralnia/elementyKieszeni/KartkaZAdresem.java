package pralnia.elementyKieszeni;


import java.util.Objects;
import java.util.Random;

public class KartkaZAdresem extends ElementyKieszeni{

    private int nrDomu;
    private String ulica;

    public KartkaZAdresem(String ulica) {
        nrDomu = random.nextInt(1,223);
        this.ulica = ulica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KartkaZAdresem that = (KartkaZAdresem) o;
        return nrDomu == that.nrDomu && Objects.equals(ulica, that.ulica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrDomu, ulica);
    }
}
