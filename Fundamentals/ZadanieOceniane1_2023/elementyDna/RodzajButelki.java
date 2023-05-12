package task1.elementyDna;

import java.util.Random;

public enum RodzajButelki {
	
	ZWROTNA,
	BEZZWROTNA,
	BRAK_DANYCH;
	
	private static Random random = new Random();
	
	public static RodzajButelki losujRodzaj() {
		RodzajButelki[] rodzajeButelki = RodzajButelki.values();
		RodzajButelki rodzaj = rodzajeButelki[random.nextInt(rodzajeButelki.length)];
		return rodzaj;
	}
}
