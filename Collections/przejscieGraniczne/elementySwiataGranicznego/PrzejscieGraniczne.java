package przejscieGraniczne.elementySwiataGranicznego;

import przejscieGraniczne.elementySwiataGranicznego.podrozni.Podrozny;
import przejscieGraniczne.elementySwiataGranicznego.podrozni.Przemytnik;
import przejscieGraniczne.elementySwiataGranicznego.podrozni.Szpieg;
import przejscieGraniczne.elementySwiataGranicznego.podrozni.Turysta;
import przejscieGraniczne.wyjatki.NieletniWAreszcieException;

import java.util.*;

public class PrzejscieGraniczne {

    private List<Podrozny> czekajacyPodrozni = new LinkedList<>();
    private List<Celnik> celnicy = new ArrayList<>();
    private Areszt areszt;
    private static Random random = new Random();

    public PrzejscieGraniczne() {
        this.areszt = new Areszt();
        // Podrozni
        for(int i= 0; i < 50; i++) {
            czekajacyPodrozni.add(new Turysta());
        }
        for(int i= 0; i < 50; i++) {
            czekajacyPodrozni.add(new Szpieg());
        }
        for(int i= 0; i < 50; i++) {
            czekajacyPodrozni.add(new Przemytnik());
        }
        Collections.shuffle(czekajacyPodrozni);
        // Celnicy
        for(int i = 0; i < 5; i++) {
            celnicy.add(new Celnik(areszt, czekajacyPodrozni));
        }
    }

    public void doJob() {
        Iterator<Podrozny> iterator = czekajacyPodrozni.iterator();
        while(iterator.hasNext()) {
            Celnik celnik = celnicy.get(random.nextInt(celnicy.size()));
            Podrozny podrozny = iterator.next();
            try {
                celnik.control(podrozny);
                iterator.remove(); // Wykona się tylko jeśli nie było wyjątku ???
            } catch (NieletniWAreszcieException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                // System.exit(1); // Wychodzimy bo inaczej w areszcie byłaby osoba nieletnia
            }

        }
        areszt.wypiszAresztowaniPodrozni();
    }





}
