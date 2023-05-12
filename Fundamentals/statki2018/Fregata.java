package statki2018;

import java.util.Random;

public class Fregata extends Okret {

	private int numerFregaty;
	private static int numerPorzadkowyFregat = 1;
	private int liczbaDzial;
	private static Random randomizerDzial = new Random();
	
	public Fregata(Gra gra) {
		super("Fregata", numerPorzadkowyFregat, 3, gra);
		this.numerFregaty = numerPorzadkowyFregat;
		numerPorzadkowyFregat++;
		this.liczbaDzial = randomizerDzial.nextInt(1, 6);	
	}
	
	@Override
	public String getSymbol(){
		return "F";
	}

	public int getNumerFregaty() {
		return numerFregaty;
	}

	public void setNumerFregaty(int numerFregaty) {
		this.numerFregaty = numerFregaty;
	}

	public int getLiczbaDzial() {
		return liczbaDzial;
	}

	public void setLiczbaDzial(int liczbaDzial) {
		this.liczbaDzial = liczbaDzial;
	}
	
	
	
	
}
