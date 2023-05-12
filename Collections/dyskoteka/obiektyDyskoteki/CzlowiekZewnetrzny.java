package dyskoteka.obiektyDyskoteki;

public class CzlowiekZewnetrzny extends Uczestnik{

    public CzlowiekZewnetrzny() {
        super(names.get(random.nextInt(0,10)), random.nextInt(16, 41));
    }

    // Na użytek Demonstratora
    @Override
    public String toString() {
        return "CzlowiekZewnetrzny{name=" + this.getName() + ", age=" + this.getAge() + ", id=" + this.getIdUczestnika() +"}";
    }
}
