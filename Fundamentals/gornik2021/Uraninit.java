package gornik2021;

import java.util.Random;

public class Uraninit extends ObiektyKopalnianeRadioaktywne {

	private FormaUraninitu forma;
	private Random losowanieFormy = new Random();

	public Uraninit(double bazowaWarRyn) {
		super(bazowaWarRyn);
		int x = losowanieFormy.nextInt(1,4);
		switch(x) {
		case(1): {
			this.forma = FormaUraninitu.foumarieryt;
		}
		case(2): {
			this.forma = FormaUraninitu.torbernit;
		}
		case(3): {
			this.forma = FormaUraninitu.uranofan;
		}
		}
	}
	
	@Override
	public double getModifiedMarketValue() {
		switch(this.forma) {
		case foumarieryt:
			return 2.5 * this.getBazowaWartoscRynkowa();
		case torbernit:
			return 1.5 * this.getBazowaWartoscRynkowa();
		case uranofan:
			return this.getBazowaWartoscRynkowa();
		default:
			return 0;
		}
		
	}
	
	
}
