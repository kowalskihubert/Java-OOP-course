package kret2021;

public class Gleba extends ObiektyZiemne {

	private double gestosc;

	public Gleba() {
		super(0);
		this.gestosc = losowanieGestosciMasyWartosciO.nextDouble(1.4, 2.4);
	}
	
	
}
