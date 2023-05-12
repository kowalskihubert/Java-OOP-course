package dyskoteka.obiektyDyskoteki;

public abstract class Studenci extends Uczestnik {

    private String surname;

    public Studenci(String name, String surname) {
        super(name, random.nextInt(18, 27));
        this.surname = surname;

    }
}
