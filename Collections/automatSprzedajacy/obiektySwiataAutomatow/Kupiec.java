package automatSprzedajacy.obiektySwiataAutomatow;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Kupiec extends Czlowiek {

    private int id;
    private static int idCounter = 0;
    private Automatopodobne automatKupca;

    public Kupiec(Automatopodobne automatKupca) {
        this.id = idCounter++;
        this.automatKupca = automatKupca;
    }

    public void doJob() {
        Random random = new Random();
        int ileRazy = random.nextInt(5, 11);
        for(int i = 0; i < ileRazy; i++) {
            automatKupca.randomOrder();
        }
        List<ProduktSpozywczy> produkty = automatKupca.getAll();
        int masaLaczna = 0;
        for(ProduktSpozywczy p : produkty) {
            // Albo witytator - wykorzystuje przeciążanie metod parametrami
            if(p instanceof Slodycz) {
                masaLaczna += ((Slodycz) p).getMasa();
            }
        }
        System.out.println("Łączna masa pobranych Rogali i Batonów: " + masaLaczna);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kupiec kupiec = (Kupiec) o;
        return id == kupiec.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Kupiec{" +
                "id=" + id +
                '}';
    }
}
