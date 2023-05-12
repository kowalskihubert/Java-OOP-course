package terminal.pasazerowieIBagaze;

public class PrzedmiotNielegalny extends Przedmiot {

    protected int masa;
    private static int stala = 10;

    public PrzedmiotNielegalny() {
        this.masa = random.nextInt(5, 29);
    }

    @Override
    public int getStopienNielegalnosci() {
        return masa * stala;
    }

    @Override
    public String toString() {
        return "PrzedmiotNielegalny{" +
                "masa=" + masa +
                '}';
    }
}
