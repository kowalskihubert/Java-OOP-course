package statki2018;

import java.util.Random;

public class Dzialo {
	
	private Random randomizerPol = new Random();
	
	public int[] losujPozycjeDoOstrzalu() {
		int wiersz = randomizerPol.nextInt(0,99);
		int kolumna  = randomizerPol.nextInt(0,99);
		int[] pozycja = {wiersz, kolumna};
		return pozycja;
	}
	
	public void ostrzelajOkret(Okret okret) {
		okret.ostrzal();
	}

}
