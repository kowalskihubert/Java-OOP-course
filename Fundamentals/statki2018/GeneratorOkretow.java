package statki2018;

import java.util.Random;

public class GeneratorOkretow {

	private Random randomizerPol = new Random(2023);
	
	public int[] generujPozycje() {
		int wiersz = randomizerPol.nextInt(0,99);
		int kolumna  = randomizerPol.nextInt(0,99);
		int[] pozycja = {wiersz, kolumna};
		return pozycja;
	}
	
	public Okret generujOkret(String typOkretu, int[] pozycja, Gra gra) {
		
		switch(typOkretu) {
		case("Niszczyciel"): {
			Niszczyciel niszczyciel = new Niszczyciel(gra);
			niszczyciel.setPozycjaPoczatkowa(pozycja);
			niszczyciel.setPozycjaAktualna(pozycja);
			return niszczyciel;
		}
		case("Fregata"): {
			Fregata fregata = new Fregata(gra);
			fregata.setPozycjaPoczatkowa(pozycja);
			fregata.setPozycjaAktualna(pozycja);
			return fregata;
		}
		case("Korweta"): {
			Korweta korweta = new Korweta(gra);
			korweta.setPozycjaPoczatkowa(pozycja);
			korweta.setPozycjaAktualna(pozycja);
			return korweta;
		}
		default: {
			return null;
		}
		}
		
	}
}
