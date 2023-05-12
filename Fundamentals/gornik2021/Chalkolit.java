package gornik2021;

public class Chalkolit extends ObiektyKopalnianeRadioaktywne {

	public Chalkolit (double bazowaWarRyn) {
		super(bazowaWarRyn);
	}
	
	@Override
	public double getModifiedMarketValue() {
		return this.getBazowaWartoscRynkowa();
	}
	
}
