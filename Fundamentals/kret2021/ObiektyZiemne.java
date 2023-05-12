package kret2021;

import java.util.Random;

public abstract class ObiektyZiemne {

	private int wartoscOdzywcza;
	protected static Random losowanieGestosciMasyWartosciO = new Random();
	
	public ObiektyZiemne(int wartosc) {
		this.wartoscOdzywcza = wartosc;
	}
	
	public int getWartoscOdzywcza() {
		return wartoscOdzywcza;
	}
	public void setWartoscOdzywcza(int wartoscOdzywcza) {
		this.wartoscOdzywcza = wartoscOdzywcza;
	}
	
	
	
	
	
}
