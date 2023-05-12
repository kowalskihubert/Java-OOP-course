package terminal.swiatTerminalowy;

import terminal.pasazerowieIBagaze.BagazPodreczny;
import terminal.pasazerowieIBagaze.Pasazer;

import java.util.Iterator;
import java.util.List;

public class OperatorBramkiBezpieczenstwa {

    private BagazoSkanowalne bramkaBezpieczenstwa;

    public OperatorBramkiBezpieczenstwa(BagazoSkanowalne bramkaBezpieczenstwa) {
        this.bramkaBezpieczenstwa = bramkaBezpieczenstwa;
    }

    public void sprawdzPasazera(Pasazer pasazer) {
        List<BagazPodreczny> bagazePodreczne = pasazer.getBagazePodreczne();
        boolean czyZwieraNielegal;
        Iterator<BagazPodreczny> iterator = bagazePodreczne.iterator();
        while(iterator.hasNext()) {
            czyZwieraNielegal = false;
            BagazPodreczny bagazPodreczny = iterator.next();
            try {
                System.out.println("Skanujemy bagazPodreczny nr " + bagazPodreczny.getId());
                czyZwieraNielegal = bramkaBezpieczenstwa.skanujBagaz(pasazer, bagazPodreczny);
            } catch (UwagaKielbasaException e) {
                System.out.println("Kielbasie mowimy stanowcze nie!");
            }
            if(czyZwieraNielegal) {
                iterator.remove();
            }
        }
    }

    public BramkaBezpieczenstwa getBramkaBezpieczenstwa() {
        return (BramkaBezpieczenstwa) this.bramkaBezpieczenstwa;
    }

}
