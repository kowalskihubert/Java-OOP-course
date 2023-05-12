package gornik2021;

import java.util.Random;

public class ObiektyKopalnianeRadioaktywne extends ObiektyKopalniane {

	private int radioaktywnosc;
	protected static Random losowanieRadioaktywnosci = new Random();

	public ObiektyKopalnianeRadioaktywne(double bazowaWartoscRynkowa) {
		super(bazowaWartoscRynkowa);
		this.radioaktywnosc = ObiektyKopalnianeRadioaktywne.losowanieRadioaktywnosci.nextInt(700,950);
	}
	
	
}
