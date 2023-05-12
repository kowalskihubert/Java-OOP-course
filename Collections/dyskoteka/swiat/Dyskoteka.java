package dyskoteka.swiat;

import dyskoteka.obiektyDyskoteki.*;

import java.util.Iterator;
import java.util.Random;

public class Dyskoteka {

    private Sala malaSala;
    private Sala duzaSala;
    private Hol hol;
    private OchroniarzMaly malyOchroniarz;
    private OchroniarzDuzy duzyOchroniarz;

    public Dyskoteka() {
        this.malaSala = new Sala();
        malaSala.ustawPojemnoscSali(51);
        this.duzaSala = new Sala();
        duzaSala.ustawPojemnoscSali(75);
        this.hol = new Hol();
        this.malyOchroniarz = new OchroniarzMaly(malaSala, duzaSala, hol);
        this.duzyOchroniarz = new OchroniarzDuzy(malaSala, duzaSala, hol, new RejestrObcych());
    }

    private void inviteAll() {
        Random random = new Random();
        boolean czyZaproszonyNaSale;
        Iterator<Uczestnik> iteratorPoHolu = hol.getUczestnicyWHolu().iterator();
        while(iteratorPoHolu.hasNext()) {
            Uczestnik uczestnik = iteratorPoHolu.next();
            if(random.nextBoolean()) {
                czyZaproszonyNaSale = malyOchroniarz.check(uczestnik);
            }
            else {
                czyZaproszonyNaSale = duzyOchroniarz.check(uczestnik);
            }
            if(czyZaproszonyNaSale) {
                iteratorPoHolu.remove();
            }
        }
    }

    public void goLive() {
        inviteAll();
        duzyOchroniarz.printStrangers();
        malaSala.printUczestnicy();
        duzaSala.printUczestnicy();
    }

}
