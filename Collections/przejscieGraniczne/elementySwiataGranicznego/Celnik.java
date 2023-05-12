package przejscieGraniczne.elementySwiataGranicznego;

import przejscieGraniczne.elementySwiataGranicznego.podrozni.Podrozny;
import przejscieGraniczne.elementySwiataGranicznego.TrefnyTowar;
import przejscieGraniczne.wyjatki.NieletniWAreszcieException;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Celnik {

    private List<Podrozny> czekajacyPodrozniCelnika;
    private Areszt aresztCelnika;
    private static Random random = new Random();

    public Celnik(Areszt areszt, List<Podrozny> podrozni) {
        this.aresztCelnika = areszt;
        this.czekajacyPodrozniCelnika = podrozni;
    }

    public void control(Podrozny podrozny) throws NieletniWAreszcieException {
        if(random.nextInt(10) < 2) {
            int sumaWartosciCzarnorynkowych = 0;
            for(Towar towar : podrozny.getTowary()) {
                if(towar instanceof TrefnyTowar) {
                    // TODO: dopytać jak to zrobic elegancko
                    sumaWartosciCzarnorynkowych += ((TrefnyTowar)towar).getWartoscCzarnorynkowa();
                }
            }
            if(sumaWartosciCzarnorynkowych > 50000) {
                aresztCelnika.dodajDoAresztu(podrozny);
            }
        }
    }

}
