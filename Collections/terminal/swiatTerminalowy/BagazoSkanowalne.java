package terminal.swiatTerminalowy;

import terminal.pasazerowieIBagaze.Bagaz;
import terminal.pasazerowieIBagaze.Pasazer;

public interface BagazoSkanowalne {

    public boolean skanujBagaz(Pasazer pasazer, Bagaz bagaz) throws UwagaKielbasaException;
}
