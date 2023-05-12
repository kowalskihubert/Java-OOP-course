package terminal.swiatTerminalowy;

import terminal.pasazerowieIBagaze.Pasazer;

import java.util.HashSet;
import java.util.Set;

public class Terminal <T> {

    private OperatorBramkiBagazowej operatorBramkiBagazowej;
    private OperatorBramkiBezpieczenstwa operatorBramkiBezpieczenstwa;
    private Set<Pasazer> pasazerowie;
    private T reklamator;

    public Terminal(Set<Pasazer> pasazerowie, T reklamator) {
        operatorBramkiBagazowej = new OperatorBramkiBagazowej(new BramkaBagazowa());
        operatorBramkiBezpieczenstwa = new OperatorBramkiBezpieczenstwa(new BramkaBezpieczenstwa());
        this.pasazerowie = pasazerowie;
        this.reklamator = reklamator;
    }

    public void go() {
        for(Pasazer p : pasazerowie) {
            operatorBramkiBagazowej.obsluzBagazePasazera(p);
            operatorBramkiBezpieczenstwa.sprawdzPasazera(p);
        }
    }

    public OperatorBramkiBezpieczenstwa getOperatorBramkiBezpieczenstwa() {
        return operatorBramkiBezpieczenstwa;
    }
}
