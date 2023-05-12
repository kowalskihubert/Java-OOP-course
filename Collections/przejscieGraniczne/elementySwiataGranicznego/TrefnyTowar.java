package przejscieGraniczne.elementySwiataGranicznego;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TrefnyTowar extends Towar{

    private int wartoscCzarnorynkowa;
    private static Map<String, Set<Integer>> mapaNazwIWartosci = new HashMap<>(
            Map.of("broń", Set.of(15000, 12000), "alkohol bez banderoli", Set.of(700, 750, 800),
                    "bursztyn", Set.of(3500), "łopatka wieprzowa", Set.of(1450, 1350))
    );

    public TrefnyTowar() {
        super();
        this.nazwa = mapaNazwIWartosci.keySet().toArray(new String[0])[random.nextInt(mapaNazwIWartosci.size())].toString();
        this.wartoscCzarnorynkowa = mapaNazwIWartosci.get(this.nazwa).toArray(new Integer[0])[random.nextInt(mapaNazwIWartosci.get(this.nazwa).size())];
    }

    public void printMe() {
        System.out.println("Nazwy trefnych towarów: ");
        for(String s : mapaNazwIWartosci.keySet()) {
            System.out.println(s);
        }
    }
    public int getWartoscCzarnorynkowa() {
        return wartoscCzarnorynkowa;
    }
}
