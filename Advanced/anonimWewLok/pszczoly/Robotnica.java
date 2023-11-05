package anonimWewLok.pszczoly;

import java.util.Random;

public class Robotnica extends Pszczola {

    protected int iloscWyprodukowanegoMiodu = 0;

    public Robotnica(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
        this.silaAtaku = new Random().nextInt(1,99);
    }

    public void zbierajNektar(int w){
        iloscWyprodukowanegoMiodu += w;
        System.out.println(imie + " - Kolejna porcja miodu do pudełka");
    }

    @Override
    public String toString() {
        return "Robotnica " + imie + " " + "(atak: " + silaAtaku + "), żyję " + wiek + "dni i zrobiłam " + iloscWyprodukowanegoMiodu + " baryłek miodu";
    }

    @Override
    public void run() {
        Random random = new Random();
        zbierajNektar(random.nextInt(0,20));
    }
}
