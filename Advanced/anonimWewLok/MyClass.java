package anonimWewLok;

public class MyClass {

    private int aPriv = 10;
    public int aPub = 100;
    public String nazwa = "Moja";

    private static int aPrivStat = 7;
    public static int aPubStat = 77;

    class MyInner {
        private int a;
        public int b;
        // klasa wewnętrzna nie może zawierać statycznych pól, bo jest ściśle związana z instancją klasy zewnętrznej

        public MyInner(int a) {
            this.a = a;
        }

        public void accessTest() {
            // klasa wewnętrzna ma dostęp do wszystkich pól klasy zewnętrznej (w tym prywatnych)
            System.out.println("aPriv = " + aPriv);
            System.out.println("aPub = " + aPub);
            System.out.println("aPrivStat = " + MyClass.aPrivStat);
            System.out.println("aPubStat = " + MyClass.aPubStat);
            System.out.println("a = " + a);
        }
    }

    public void accessToInner() {
        MyInner mi = new MyInner(5); // tu nie ma zabawy z instancją klasy zewnętrznej
        mi.a = 15; // mamy dostęp do pól klasy wewnętrznej
        mi.accessTest(); // mamy dotęp do metod klasy wewnętrznej
    }

    static class MyStaticInner {
        // używamy jeśli nie potrzeba dostępu do instancji klasy zewnętrznej
        private int aPrivInner = 101;
        public int aPubInner = 102;
        public static int aPubStaticInner = 109;
        private static int aPrivStaticInner = 177;

        public MyStaticInner() {
        }

        public void accessTest() {
            // nie ma dostępu do pól niestatycznych klasy zewnętrznej (bo nie jest tworzona w oparciu o instancję klasy zewnętrznej)
            // ale można stworzyć obiekt klasy zewnętrznej i wtedy będzie dostęp do pól niestatycznych
            MyClass mc = new MyClass();
            mc.aPriv = 1000;
            System.out.println("Nowy obiekt MyClass: aPriv = " + mc.aPriv);
        }
    }

    public void accessToStaticInner() {
        // pola i metody z klasy wewnętrznej zachowują się typowo jak dla zywkłej klasy
        MyStaticInner msi = new MyStaticInner();
        MyStaticInner msi2 = new MyStaticInner();
        msi.aPrivInner = 1000;
        System.out.println("aPrivInner = " + msi.aPrivInner);
        System.out.println("aPrivInner for msi2 = " + msi2.aPrivInner); // zmienia się tylko dla msi
    }

    public void helloFromFunnyObject() {
        Object object = new Object() {
            public String toString() {
                return "I'm a funny object";
            }
        };
        System.out.println(object.toString());

    }


}
