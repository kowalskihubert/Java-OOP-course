package statki2018;

import java.util.Random;

public class Niszczyciel extends Okret{
	
	private int numerNiszczyciela;
	private static int numerPorzadkowyNiszczycieli = 1;
	private int liczbaRakiet;
	private static Random randomizerRakiet = new Random();
	
	public Niszczyciel(Gra gra) {
		
		super("Niszczyciel", numerPorzadkowyNiszczycieli, 5, gra);
		this.numerNiszczyciela = numerPorzadkowyNiszczycieli;
		numerPorzadkowyNiszczycieli++;
		this.liczbaRakiet = randomizerRakiet.nextInt(1, 20);	
	}

	@Override
	public String getSymbol(){
		return "N";
	}
	
	public int getNumerNiszczyciela() {
		return numerNiszczyciela;
	}

	public void setNumerNiszczyciela(int numerNiszczyciela) {
		this.numerNiszczyciela = numerNiszczyciela;
	}

	public int getLiczbaRakiet() {
		return liczbaRakiet;
	}

	public void setLiczbaRakiet(int liczbaRakiet) {
		this.liczbaRakiet = liczbaRakiet;
	}
		
	
	
	
}
