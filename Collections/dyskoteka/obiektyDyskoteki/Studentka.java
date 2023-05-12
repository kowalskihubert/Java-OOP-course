package dyskoteka.obiektyDyskoteki;

public class Studentka extends Studenci{

    public Studentka() {
        super(names.get(random.nextInt(5,10)), surnames.get(random.nextInt(5,10)));

    }
}
