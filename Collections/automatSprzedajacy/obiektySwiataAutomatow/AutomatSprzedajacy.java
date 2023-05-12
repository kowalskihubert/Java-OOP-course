package automatSprzedajacy.obiektySwiataAutomatow;

import automatSprzedajacy.wyjatki.SugarTooHighException;

import java.util.*;

public class AutomatSprzedajacy <T> implements Automatopodobne, Serwisowalne {

    private Set<Slodycz> slodyczeAutomatu = new HashSet<>(); // nieistotna kolejnosc
    private Set<Napoj> napojeAutomatu = new LinkedHashSet<>(); // kolejnosc zachowana
    private int slodyczeMaxCapacity = 15;
    private int napojeMaxCapacity = 10;
    private List<ProduktSpozywczy> podajnik = new LinkedList<>();
    private Random random = new Random();
    private List<T> listaDodatkowa = new ArrayList<>();

    @Override
    public void randomOrder() {
        Set<ProduktSpozywczy> produkty = new HashSet<>(slodyczeAutomatu);
        produkty.addAll(napojeAutomatu);
        if(produkty.isEmpty()) {
            System.out.println("Towaru brak!");
        }
        else {
            ProduktSpozywczy p = produkty.toArray(new ProduktSpozywczy[0])[random.nextInt(produkty.size())];
            podajnik.add(p);
            if (slodyczeAutomatu.contains(p)) {  // możemy sobie pozwolić, bo contains dla Setów jest szybkie
                // alternatywnie instanceof
                slodyczeAutomatu.remove(p);
            } else {
                napojeAutomatu.remove(p);
            }
        }
    }

    @Override
    public List<ProduktSpozywczy> getAll() {
        List<ProduktSpozywczy> produkty = new LinkedList<>(podajnik);
        Collections.sort(produkty);
        podajnik.clear();
        return produkty;
    }

    @Override
    public boolean put(Slodycz slodycz) throws SugarTooHighException {
        if(slodyczeAutomatu.size() >= slodyczeMaxCapacity) {
           return false;
        }
        if(slodycz.getSugarContent() < 0 || slodycz.getSugarContent() >= 100) {
            throw new SugarTooHighException();
        }
        slodyczeAutomatu.add(slodycz);
        return true;
    }

    @Override
    public boolean putDrink(Napoj napoj) throws SugarTooHighException {
        if(napojeAutomatu.size() >= napojeMaxCapacity) {
            return false;
        }
        if(napoj.getSugarContent() < 0 || napoj.getSugarContent() >= 100) {
            throw new SugarTooHighException();
        }
        napojeAutomatu.add(napoj);
        return true;
    }

    protected void putAdditional(T t) {
        listaDodatkowa.add(t);
    }
}
