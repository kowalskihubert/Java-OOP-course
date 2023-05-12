package przejscieGraniczne.elementySwiataGranicznego;

import przejscieGraniczne.elementySwiataGranicznego.podrozni.Podrozny;
import przejscieGraniczne.komparatorPodroznych.PodrozniComparator;
import przejscieGraniczne.wyjatki.NieletniWAreszcieException;

import java.util.Set;
import java.util.TreeSet;

public class Areszt {
    // TreeSet, bo chcemy mieć stałe sortowanie, z Comparatorem w razie gdybyśmy gdzieś indziej chcieli porównywać podróżnych inaczej niż po wieku
    private Set<Podrozny> aresztowaniPodrozni = new TreeSet<>(new PodrozniComparator());

    public void dodajDoAresztu(Podrozny podrozny) throws NieletniWAreszcieException {
        aresztowaniPodrozni.add(podrozny);
        if(podrozny.getAge() < 18) throw new NieletniWAreszcieException();
    }

    public void wypiszAresztowaniPodrozni() {
        System.out.println("Aresztowani:");
        System.out.println(aresztowaniPodrozni);
    }


}
