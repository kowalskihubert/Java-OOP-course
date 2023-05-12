package terminal;

import terminal.pasazerowieIBagaze.Pasazer;
import terminal.swiatTerminalowy.Neon;
import terminal.swiatTerminalowy.Terminal;

import java.util.HashSet;
import java.util.Set;

public class Demostrator {

    public static void main(String[] args) {
        Set<Pasazer> pasazerowie = new HashSet<>();
        for(int i = 0; i < 50; i++) {
            pasazerowie.add(new Pasazer());
        }
        Terminal terminal = new Terminal(pasazerowie, new Neon());
        terminal.go();
        System.out.println("Mapa pasażer - jego nielegalne towary: ");
        System.out.println(terminal.getOperatorBramkiBezpieczenstwa().getBramkaBezpieczenstwa().getMapa());
        System.out.println(terminal.getOperatorBramkiBezpieczenstwa().getBramkaBezpieczenstwa().getMapa().size());
    }
}
