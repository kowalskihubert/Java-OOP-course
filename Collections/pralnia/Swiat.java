package pralnia;

import pralnia.elementyPralni.Certyfikat;
import pralnia.elementyPralni.Klient;
import pralnia.elementyPralni.Pralnia;
import pralnia.elementyPralni.Pralniowate;

import java.util.ArrayList;
import java.util.List;

public class Swiat {

    public void goLive() {
        Pralniowate nowaPralnia = new Pralnia<>(new Certyfikat());
        List<Klient> klienci = new ArrayList<>();
        for(int i = 0; i<10; i++) {
            klienci.add(new Klient(nowaPralnia));
        }
        for(Klient klient : klienci) {
            klient.doJob();
        }
    }
}
