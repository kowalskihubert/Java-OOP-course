package dyskoteka.obiektyDyskoteki;

import java.util.*;
import java.util.Arrays;
public abstract class Uczestnik {

    protected static Random random = new Random();
    protected static final List<String> names = new ArrayList<>(Arrays.asList("Paweł", "Piotr", "Maciej", "Krzysztof", "Jan", "Monika", "Bożena", "Ala", "Jola", "Helena"));
    protected static final List<String> surnames = new ArrayList<>(Arrays.asList("Kowalski", "Nowak", "Wiśniewski", "Nowakowski", "Bednarz", "Kowalska", "Nowak", "Lipska", "Bralczyk", "Kowalczyk"));
    private static int counter = 0;
    private int idUczestnika;
    private String name;
    private int age;

    public Uczestnik(String name, int age) {
        this.name = name;
        this.age = age;
        this.idUczestnika = counter++;

    }

    public int getIdUczestnika() { return idUczestnika; }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnik uczestnik = (Uczestnik) o;
        return idUczestnika == uczestnik.idUczestnika; // Ma dostęp
        // return this.idUczestnika == uczesnik.getIdUczestnika();
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUczestnika);
    }

    @Override
    public String toString() {
        return "Uczestnik{" +
                "idUczestnika=" + idUczestnika +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
