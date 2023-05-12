package ryby2018;

import java.util.Random;

public abstract class Statek extends ObiektMorski{

	private String kod;
	private static int licznikPorzadkowy = 1;
	private int numerStatku;
	private int maxLadownosc;
	private double masaZlowionychRyb = 0;
	private int[] pozycjaPoczatkowa;
	protected static Random losowanieKodu = new Random();
	
	public Statek(int maxLadownosc) {
		this.maxLadownosc = maxLadownosc;
		this.numerStatku = licznikPorzadkowy;
		licznikPorzadkowy++;
		this.kod = String.valueOf(Math.sqrt(losowanieKodu.nextLong()));
		
	}
	
	
	

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public int getNumerStatku() {
		return numerStatku;
	}

	public void setNumerStatku(int numerStatku) {
		this.numerStatku = numerStatku;
	}

	public int getMaxLadownosc() {
		return maxLadownosc;
	}

	public void setMaxLadownosc(int maxLadownosc) {
		this.maxLadownosc = maxLadownosc;
	}

	public double getMasaZlowionychRyb() {
		return masaZlowionychRyb;
	}

	public void setMasaZlowionychRyb(double masaZlowionychRyb) {
		this.masaZlowionychRyb = masaZlowionychRyb;
	}

	public int[] getPozycjaPoczatkowa() {
		return pozycjaPoczatkowa;
	}

	public void setPozycjaPoczatkowa(int[] pozycjaPoczatkowa) {
		this.pozycjaPoczatkowa = pozycjaPoczatkowa;
	}
	
	
}
