package anonimWewLok;

public class WewDemo {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        MyClass.MyInner mi = mc.new MyInner(5);
        mi.accessTest();

        System.out.println("-----------------");

        MyClass.MyInner mi2 = mc.new MyInner(7); // tworzymy drugą instancję klasy wewnętrznej na podstawie tej samej klasy zewnętrznej
        mc.aPub = 2000;
        mi.accessTest();
        mi2.accessTest();
        // każda z instancji klasy wewnętrznej ma dostęp do tych samych pól klasy zewnętrznej

        System.out.println("-----------------");

        MyClass.MyStaticInner msi = new MyClass.MyStaticInner();
        msi.accessTest();

        System.out.println("-----------------");
        mc.accessToStaticInner();

        System.out.println("-----------------");
        mc.helloFromFunnyObject();
    }

}
