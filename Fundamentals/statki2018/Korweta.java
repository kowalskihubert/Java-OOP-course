package statki2018;

import java.util.Random;

public class Korweta extends Okret{
	
	private int numerKorwety;
	private static int numerPorzadkowyKorwet = 1;
	private int liczbaBomb;
	private static Random randomizerBomb = new Random();
	
	public Korweta(Gra gra) {
		
		super("Korweta", numerPorzadkowyKorwet, 1, gra);
		this.numerKorwety = numerPorzadkowyKorwet;
		numerPorzadkowyKorwet++;
		this.liczbaBomb = randomizerBomb.nextInt(1, 4);	
	}
	
	@Override
	public String getSymbol(){
		return "K";
	}

	public int getNumerKorwety() {
		return numerKorwety;
	}

	public void setNumerKorwety(int numerKorwety) {
		this.numerKorwety = numerKorwety;
	}

	public int getLiczbaBomb() {
		return liczbaBomb;
	}

	public void setLiczbaBomb(int liczbaBomb) {
		this.liczbaBomb = liczbaBomb;
	}
	
	
	

}
