package task1.elementyDna;

import java.util.Random;

public abstract class ElementyDna {

	private double wartosc;
	private String reprTekstowa;
	protected static Random losowanieWartosci = new Random();
	
	
	public int distance() {
		return 1; // domyślnie metoda zwraca 1
	}
	
	public double getWartosc() {
		return wartosc;
	}
	protected void setWartosc(double wartosc) {
		wartosc = Math.round(wartosc * 100)/100.0;
		this.wartosc = wartosc;
	}
	public String getReprTekstowa() {
		return reprTekstowa;
	}
	protected void setReprTekstowa(String reprTekstowa) {
		this.reprTekstowa = reprTekstowa;
	}
	
	
}
