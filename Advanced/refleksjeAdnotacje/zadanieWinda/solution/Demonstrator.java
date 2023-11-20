package refleksjeAdnotacje.zadanieWinda.solution;

import refleksjeAdnotacje.zadanieWinda.windy.MiNIWinda;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.util.stream.Stream;

public class Demonstrator {

    private static String doKlasy = "refleksjeAdnotacje.zadanieWinda.windy.MiNIWinda";

    public static void main(String[] args) throws Exception {
        // Żeby kod był czytelniejszy, main niestety może wyrzucić Exception

        // task1();
        // task2();
        // task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName(doKlasy);
        MiNIWinda winda = (MiNIWinda) clazz.newInstance();
        System.out.println("Utworzono obiekt winda: " + winda);

    }

    public static void task2() throws ClassNotFoundException {
        Class<?> clazz = Class.forName(doKlasy);
        Constructor<?>[] konstruktory = clazz.getDeclaredConstructors();
        System.out.println("Liczba konstruktorów: " + konstruktory.length);
        Constructor c = Stream.of(konstruktory).max((a,b) -> a.getParameterCount() - b.getParameterCount()).orElseGet(null);
        if(c == null) System.out.println("konstruktorów brak");
        else {
            Parameter[] parameters = c.getParameters();
            for(Parameter p : parameters) {
                // write parameter names and types
                System.out.println(p.getType().getSimpleName() + " " + p.getName());
            }
        }
    }

    public static void task3() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        // wypisz wartość pola producent z MINIWinda używając refleksji
        Class<?> clazz = Class.forName(doKlasy);
        Field poleProd = clazz.getField("PRODUCENT");
        System.out.println("Wartość pola PRODUCENT: " + poleProd.get(null)); // Obojętnie jaki obiekt  bo pole jest statyczne

    }

    public static void task4() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        // wartość pola kolor z MINIWinda używając refleksji
        Class<?> clazz = Class.forName(doKlasy);

        MiNIWinda winda = (MiNIWinda) clazz.newInstance();

        Field poleKolor = clazz.getDeclaredField("kolor"); // pole kolor jest prywatne
        poleKolor.setAccessible(true); // ustawiamy dostępność pola na publiczny
        System.out.println("Wartość pola kolor: " + poleKolor.get(winda)); // dla utworzonej windy
    }

    public static void task5() throws ClassNotFoundException {
        // Lista metod które są dziedziczone przez klasę MiniWinda oraz pełna nazwa nadklasy
        Class<?> clazz = Class.forName(doKlasy);
        Class<?> superClass = clazz.getSuperclass();
        System.out.println("Pełna nazwa nadklasy: " + superClass.getName());
        System.out.println("Metody dziedziczone przez klasę MiniWinda: ");
        Stream.of(clazz.getMethods()).filter(m -> m.getDeclaringClass() != clazz).forEach(System.out::println);

    }

    public static void task6() {

    }

    public static void task7() {

    }




}
