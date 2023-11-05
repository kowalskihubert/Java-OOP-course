package lambdaFunRef;

import anonimWewLok.pszczoly.Robotnica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class lambdaDemo {

    public static void main(String[] args) {

        // Przydatne interfejsy funkcyjne

        // Runnable - void run()
        int a = 6; // zmienna lokalna, efektywnie finalna, dlatego możemy z niej skorzystać
        Runnable task = () -> {
            System.out.println("Nie przyjmuję argumentów, więc mogę tylko napisać coś ogólnego");
            System.out.println("Wypisuję z zewnątrz: a = " + a);
        };
        task.run();

        // Consumer - void accept(T t)
        System.out.println("");
        Consumer<String> consumer = (String s) -> {
            s = s.toUpperCase();
            System.out.println(s);
        };
        consumer.accept("hubert");

        // Supplier - T get()
        System.out.println("");
        Supplier<Robotnica> supplier = () -> {
            int wiek = new Random().nextInt(1, 15);
            Robotnica robotnica = new Robotnica("Hermenegilda", wiek);
            return robotnica;
        };
        Robotnica robotnica = supplier.get();
        robotnica.zbierajNektar(20);




        // Własny interfejs funkcyjny - MyFunction - double apply(int a, int b)
        System.out.println("");
        MyFunction myFunction = (x, y) -> {
            return Math.cos(x) + Math.sin(y);
        };
        double w = myFunction.apply(0, 3);
        System.out.println("Wynik działania myFunction dla a=0, b=3: " + w);
        w = myFunction.apply(2, 10);
        System.out.println("Wynik działania myFunction dla a=2, b=10: " + w);



        // Działanie na lambdach w pętli
        System.out.println("\nArgument przekazany do lambdy");
        Consumer<Integer> intConsumer = (Integer x) -> {
            System.out.println("Wypisuję z pętli: " + x);
        }; // Tu nie korzystamy ze zmiennych zewnętrznych, a przekazujemy je jako argumenty
        // Dzięki temu zmienna i może się zmieniać w pętli for
        for (int i = 1; i < 6; i++) {
            intConsumer.accept(i);
        }
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(i -> System.out.println("Wypisuję z forEach: " + i));

        // Działanie na lambdach w pętli - zmienna lokalna
        System.out.println("\nZmienna lokalna z zewnątrz");
        Runnable r;
        for(int i = 1; i < 6; i++) {
            r = () -> {
                // System.out.println("Wypisuję z pętli: " + i);
                // Nie działa, bo zmienna i się zmienia
            };
            r.run();
        }
        for(int i : list) {
            r = () -> {
                System.out.println("Wypisuję z forEach: " + i);
            };
            r.run();
        }

    }
}
