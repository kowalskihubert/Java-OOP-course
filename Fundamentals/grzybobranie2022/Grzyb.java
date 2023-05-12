package grzybobranie2022;

import java.util.Random;

public abstract class Grzyb {

	private TwardoscGrzyba twardosc;   // można to dać na protected
	private int masaOwocnika;
	protected static Random losowanieMasy = new Random();
	
	
	public void ugotuj() {
		this.twardosc = TwardoscGrzyba.sredniotwardy;
	}
	
	public abstract boolean isTrujacy();  // można defaultowo dać false
	
	public TwardoscGrzyba getTwardosc() {
		return twardosc;
	}
	protected void setTwardosc(TwardoscGrzyba twardosc) {
		this.twardosc = twardosc;
	}
	public int getMasaOwocnika() {
		return masaOwocnika;
	}
	protected void setMasaOwocnika(int masaOwocnika) {
		this.masaOwocnika = masaOwocnika;
	}
	
	
}
