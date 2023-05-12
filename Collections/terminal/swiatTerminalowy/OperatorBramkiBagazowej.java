package terminal.swiatTerminalowy;

import terminal.pasazerowieIBagaze.BagazGlowny;
import terminal.pasazerowieIBagaze.Pasazer;

import java.util.Set;

public class OperatorBramkiBagazowej {

    private BagazoZdawalne bramkaBagazowa;

    public OperatorBramkiBagazowej(BagazoZdawalne bramkaBagazowa) {
        this.bramkaBagazowa = bramkaBagazowa;
    }

    public void obsluzBagazePasazera(Pasazer pasazer) {
        Set<BagazGlowny> bagaze = pasazer.oddajBagazeGlowne();
        for(BagazGlowny b : bagaze) {
            System.out.println("Zdajemy bagaz nr " + b.getId());
            bramkaBagazowa.zdajBagaz(pasazer.getBilet(), b);
        }
    }
}
