package przejscieGraniczne.elementySwiataGranicznego.podrozni;

public abstract class Nikczemnik extends Podrozny {

    private boolean uzbrojony;

    public Nikczemnik() {
        super(random.nextInt(35, 76));
        this.uzbrojony = random.nextBoolean();
    }
}
