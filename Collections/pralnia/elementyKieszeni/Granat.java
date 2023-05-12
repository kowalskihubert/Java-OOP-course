package pralnia.elementyKieszeni;

public class Granat extends ElementyKieszeni {

    private boolean odbezpieczony;

    public Granat() {
        if(random.nextInt(10) == 0) {
            odbezpieczony = true;
        } else {
            odbezpieczony = false;
        }
    }

    public boolean isOdbezpieczony() {
        return odbezpieczony;
    }

}
