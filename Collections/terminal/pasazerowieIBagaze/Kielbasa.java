package terminal.pasazerowieIBagaze;

public class Kielbasa extends PrzedmiotNielegalny {

    public Kielbasa() {
        this.masa = random.nextInt(1, 3);
    }

    @Override
    public int getStopienNielegalnosci() {
        return masa * 5;
    }

    @Override
    public String toString() {
        return "Kielbasa{" +
                "masa=" + masa +
                '}';
    }
}
