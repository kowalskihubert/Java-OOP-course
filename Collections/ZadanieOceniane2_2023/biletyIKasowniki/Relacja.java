package task2.biletyIKasowniki;

public enum Relacja {
    WARSZAWA_ZAKOPANE,
    ZAKOPANE_WARSZAWA;

    public static Relacja losujRelacje() {
        return Relacja.values()[(int)(Math.random() * Relacja.values().length)];
    }
}
