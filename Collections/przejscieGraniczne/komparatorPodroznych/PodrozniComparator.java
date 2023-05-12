package przejscieGraniczne.komparatorPodroznych;

import przejscieGraniczne.elementySwiataGranicznego.podrozni.Podrozny;

import java.util.Comparator;

public class PodrozniComparator implements Comparator<Podrozny> {

    @Override
    public int compare(Podrozny o1, Podrozny o2) {
        return o1.getAge() - o2.getAge();
    }
}
