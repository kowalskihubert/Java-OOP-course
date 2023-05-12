package dyskoteka.obiektyDyskoteki;

public class Student extends Studenci {

    public Student() {
        super(names.get(random.nextInt(0,5)), surnames.get(random.nextInt(0,5)));

    }
}
