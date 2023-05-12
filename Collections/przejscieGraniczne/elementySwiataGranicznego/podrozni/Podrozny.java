package przejscieGraniczne.elementySwiataGranicznego.podrozni;

import przejscieGraniczne.elementySwiataGranicznego.Towar;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public abstract class Podrozny {

    protected static Random random = new Random();
    private static int idCounter = 0;
    private int id;
    private int age;
    private Set<Towar> towary = new LinkedHashSet<>(); // bo chcemy zachować kolejność i szybko pytać czy contains

    public Podrozny(int age) {
        this.age = age;
        this.id = idCounter++;
    }

    protected void dodajTowar(Towar towar) {
        this.towary.add(towar);
    }

    public Set<Towar> getTowary() {
        return towary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Podrozny podrozny = (Podrozny) o;
        return id == podrozny.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() { // na potrzeby demonstracji
        return "Podrozny{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
