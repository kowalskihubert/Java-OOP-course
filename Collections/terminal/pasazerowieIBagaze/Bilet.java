package terminal.pasazerowieIBagaze;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Bilet {

    private String imie;
    private String nazwisko;
    private int numerLoteryjny = random.nextInt(1,200);
    private static Random random = new Random();
    private static Set<String> imiona = new HashSet<>(Set.of("Hubert", "Jan", "Karol", "Maciej", "Robert", "Tomasz", "Krzysztof", "Ala"));
    private static Set<String> nazwiska = new HashSet<>(Set.of("Kowalski", "Nowak", "Kowal", "Zakrzycki", "Nowakowski", "Nowacki", "Rogal", "Brzdąc"));
    private static Set<String> daneOsobowe = new HashSet<>();

    static {  // utworzy się przy pierwszym dotknięciu klasy Bilet
        for(String imie : imiona) {
            for(String nazwisko : nazwiska) {
                daneOsobowe.add(imie + " " + nazwisko);
            }
        }
    }

    public Bilet(String imie, String nawisko) {
        this.imie = imie;
        this.nazwisko = nawisko;
    }

    public static Bilet generujBilet() {
        String dane = daneOsobowe.toArray(new String[0])[random.nextInt(daneOsobowe.size())];
        daneOsobowe.remove(dane);
        String[] danePodzielone = dane.split(" ");
        return new Bilet(danePodzielone[0], danePodzielone[1]);
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

}
