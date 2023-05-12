package statki2018;

import java.util.Random;

public abstract class Okret {
	
	private String nazwa;
	private static int numerPorzadkowy = 1;
	private int numerOkretu;
	private int wytrzymalosc;
	private int liczbaTrafien = 0;
	private int[] pozycjaPoczatkowa;
	// pola dodane przeze mnie
	private String typOkretu;
	private Gra graWKtorejOkretGra;
	private int[] pozycjaAktualna;
	
	
	public Okret(String klasaOkretow, int numerOkretuKlasy, int wytrzymalosc, Gra gra) {
		
		this.graWKtorejOkretGra = gra;
		this.nazwa = klasaOkretow + String.valueOf(numerOkretuKlasy);
		this.typOkretu = klasaOkretow;
		this.wytrzymalosc = wytrzymalosc;
		this.numerOkretu = numerPorzadkowy;
		this.liczbaTrafien = 0; // czy to jest potrzebne?? 
		Okret.numerPorzadkowy++;
				
	}
	
	public void ostrzal() {
		this.liczbaTrafien++;
		
		System.out.println("Okręt " + typOkretu +  " nr " + numerOkretu + "  został trafiony.");
		if(this.liczbaTrafien == this.wytrzymalosc) {
			System.out.println("Okręt " + typOkretu + " nr " + numerOkretu + "  został trafiony i ZATOPIONY.");  
			// Jak okret ma sie sam usunac z planszy ?!! - najłatwiej dodać pole graWKtorejOkretGra
			graWKtorejOkretGra.setPlanszaij(pozycjaAktualna[0], pozycjaAktualna[1], null);
		}
		this.move();
	}
	
	public void move() {
		
		Random losujPole = new Random();
		int kierunek = losujPole.nextInt(1,5);
		switch(kierunek) {
		case(1): {
			// góra
			if(pozycjaAktualna[0] > 0 && graWKtorejOkretGra.getPlanszaij(pozycjaAktualna[0]-1,pozycjaAktualna[1])==null )  {
				graWKtorejOkretGra.setPlanszaij(pozycjaAktualna[0]-1, pozycjaAktualna[1], this);
				pozycjaAktualna[0] = pozycjaAktualna[0]-1;
			}
			else if(pozycjaAktualna[0] < 99 && graWKtorejOkretGra.getPlanszaij(pozycjaAktualna[0]+1,pozycjaAktualna[1])==null)  {
				graWKtorejOkretGra.setPlanszaij(pozycjaAktualna[0]+1, pozycjaAktualna[1], this);
				pozycjaAktualna[0] = pozycjaAktualna[0]+1;

			}
			break;
		}
		case(2): {
			// doł
			if(pozycjaAktualna[0] < 99 && graWKtorejOkretGra.getPlanszaij(pozycjaAktualna[0]+1,pozycjaAktualna[1])==null )  {
				graWKtorejOkretGra.setPlanszaij(pozycjaAktualna[0]+1, pozycjaAktualna[1], this);
				pozycjaAktualna[0] = pozycjaAktualna[0]+1;

			}
			else if(pozycjaAktualna[0] > 0 && graWKtorejOkretGra.getPlanszaij(pozycjaAktualna[0]-1,pozycjaAktualna[1])==null)  {
				graWKtorejOkretGra.setPlanszaij(pozycjaAktualna[0]-1, pozycjaAktualna[1], this);
				pozycjaAktualna[0] = pozycjaAktualna[0]-1;
			}
			break;
		}
		case(3): {
			//lewo
			if(pozycjaAktualna[1] > 0 && graWKtorejOkretGra.getPlanszaij(pozycjaAktualna[0],pozycjaAktualna[1]-1)==null )  {
				graWKtorejOkretGra.setPlanszaij(pozycjaAktualna[0], pozycjaAktualna[1]-1, this);
				pozycjaAktualna[1]=pozycjaAktualna[1]-1;
			}
			else if(pozycjaAktualna[1] < 99 && graWKtorejOkretGra.getPlanszaij(pozycjaAktualna[0],pozycjaAktualna[1]+1)==null)  {
				graWKtorejOkretGra.setPlanszaij(pozycjaAktualna[0], pozycjaAktualna[1]+1, this);
				pozycjaAktualna[1]=pozycjaAktualna[1]+1;
			}
			break;
		}
		case(4): {
			//prawo
			if(pozycjaAktualna[1] < 99 && graWKtorejOkretGra.getPlanszaij(pozycjaAktualna[0],pozycjaAktualna[1]+1)==null )  {
				graWKtorejOkretGra.setPlanszaij(pozycjaAktualna[0], pozycjaAktualna[1]+1, this);
				pozycjaAktualna[1]=pozycjaAktualna[1]+1;

			}
			else if(pozycjaAktualna[1] > 0 && graWKtorejOkretGra.getPlanszaij(pozycjaAktualna[0],pozycjaAktualna[1]-1)==null)  {
				graWKtorejOkretGra.setPlanszaij(pozycjaAktualna[0], pozycjaAktualna[1]-1, this);
				pozycjaAktualna[1]=pozycjaAktualna[1]-1;
			}
			break;
		}
		}
		
		
	}
	
	public String getSymbol(){
		return "";
	}		

	public String getNazwa() {
		return nazwa;
	}
//	public void setNazwa(String nazwa) {
//		this.nazwa = nazwa;
//	}
	public int getWytrzymalosc() {
		return wytrzymalosc;
	}
//	public void setWytrzymalosc(int wytrzymalosc) {
//		this.wytrzymalosc = wytrzymalosc;
//	}
	public int getLiczbaTrafien() {
		return liczbaTrafien;
	}
//	public void setLiczbaTrafien(int liczbaTrafien) {
//		this.liczbaTrafien = liczbaTrafien;
//	}

	public int[] getPozycjaPoczatkowa() {
		return pozycjaPoczatkowa;
	}

	public void setPozycjaPoczatkowa(int[] pozycjaPoczatkowa) {
		this.pozycjaPoczatkowa = pozycjaPoczatkowa;
	}

	@Override
	public String toString() {
		return this.nazwa ;
	}

	public int[] getPozycjaAktualna() {
		return pozycjaAktualna;
	}

	public void setPozycjaAktualna(int[] pozycjaAktualna) {
		this.pozycjaAktualna = pozycjaAktualna;
	}
	
	
	
	
	
	
	
}
