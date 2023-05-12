package automatSprzedajacy.wyjatki;

public class SugarTooHighException extends Exception {

    public SugarTooHighException() {
        super("Za dużo cukru!");
    }
}
