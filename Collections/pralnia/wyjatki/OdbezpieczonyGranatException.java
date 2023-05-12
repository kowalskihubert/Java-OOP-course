package pralnia.wyjatki;

public class OdbezpieczonyGranatException extends Exception{

    public OdbezpieczonyGranatException() {
        super("Znaleziono granat odbezpieczony!");
    }
}
