package przejscieGraniczne.elementySwiataGranicznego;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Towar {

    private static List<String> nazwyTowarow = new ArrayList<String>(Arrays.asList("woda", "kanapka",
            "laptop", "zasilacz", "mysz", "książka")); // dostęp po indeksie bez potrzeby usuwania elementów
    protected static Random random = new Random();
    protected String nazwa;

    public Towar() {
        this.nazwa = nazwyTowarow.get(random.nextInt(nazwyTowarow.size()));
    }

}
