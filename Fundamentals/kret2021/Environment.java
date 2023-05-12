package kret2021;

import java.util.Random;

public class Environment {

	private ObiektyZiemne[][] plansza;
	private static Random losowanieMiejsca = new Random();
	private static final int wartoscOdzywczaDzdzownicy = 3;
	private MoleMotion moleMotion;
	

	public Environment(int wysokosc, int szerokosc, int liczbaLarw, int liczbaDzdzownic) {
		
		this.plansza = new ObiektyZiemne[wysokosc][szerokosc];
		boolean utworzono = false;
		int x,y;
		// Generowanie larw
		for(int i=0; i<liczbaLarw; i++) {
			utworzono = false;
			while(!utworzono) {
				x = losowanieMiejsca.nextInt(0, wysokosc);
				y = losowanieMiejsca.nextInt(0, szerokosc);
				if(this.plansza[x][y] == null) {
					Larwa larwa = new Larwa();
					larwa.setWartoscOdzywcza(ObiektyZiemne.losowanieGestosciMasyWartosciO.nextInt(3, 6));
					this.plansza[x][y] = larwa;
					utworzono = true;
				}
			}
		}
		
		// Generowanie dzdzownic
		for(int i=0; i<liczbaDzdzownic; i++) {
			utworzono = false;
			while(!utworzono) {
				x = losowanieMiejsca.nextInt(0, wysokosc);
				y = losowanieMiejsca.nextInt(0, szerokosc);
				if(this.plansza[x][y] == null) {
					Dzdzownica dz = new Dzdzownica();
					dz.setWartoscOdzywcza(Environment.wartoscOdzywczaDzdzownicy);
					this.plansza[x][y] = dz;
					utworzono = true;
				}
			}
		}
		
		// Dopełnienie glebą
		for(int i = 0; i<wysokosc; i++) {
			for (int j=0; j<szerokosc; j++) {
				if(this.plansza[i][j] == null) {
					Gleba gleba = new Gleba();
					gleba.setWartoscOdzywcza(0);
					this.plansza[i][j] = gleba;
				}
			}
		}
		
		// Koniec wypełniania
		
	}
	
	
	public Environment(int wysokosc, int szerokosc, int liczbaLarw, int liczbaDzdzownic, GatunkiKreta gatunek ) {    
		
		this.plansza = new ObiektyZiemne[wysokosc][szerokosc];
		boolean utworzono = false;
		int x,y;
		// Tworzenie kreta
		Kret krecik = new Kret(gatunek, this.plansza);
		this.moleMotion = krecik;  
		// Uwaga, dzięki temu z pola moleMotion mamy dostęp tylko do metod goMole i 
		// getNutritionalValue z Kreta, a nie do całego Kreta!!!
		// Koniec tworzenia kreta
		// Generowanie larw
		for(int i=0; i<liczbaLarw; i++) {
			utworzono = false;
			while(!utworzono) {
				x = losowanieMiejsca.nextInt(0, wysokosc);
				y = losowanieMiejsca.nextInt(0, szerokosc);
				if(this.plansza[x][y] == null) {
					Larwa larwa = new Larwa();
					larwa.setWartoscOdzywcza(ObiektyZiemne.losowanieGestosciMasyWartosciO.nextInt(3, 6));
					this.plansza[x][y] = larwa;
					utworzono = true;
				}
			}
		}
		
		// Generowanie dzdzownic
		for(int i=0; i<liczbaDzdzownic; i++) {
			utworzono = false;
			while(!utworzono) {
				x = losowanieMiejsca.nextInt(0, wysokosc);
				y = losowanieMiejsca.nextInt(0, szerokosc);
				if(this.plansza[x][y] == null) {
					Dzdzownica dz = new Dzdzownica();
					dz.setWartoscOdzywcza(Environment.wartoscOdzywczaDzdzownicy);
					this.plansza[x][y] = dz;
					utworzono = true;
				}
			}
		}
		
		// Dopełnienie glebą
		for(int i = 0; i<wysokosc; i++) {
			for (int j=0; j<szerokosc; j++) {
				if(this.plansza[i][j] == null) {
					Gleba gleba = new Gleba();
					gleba.setWartoscOdzywcza(0);
					this.plansza[i][j] = gleba;
				}
			}
		}
		
		// Koniec wypełniania
		
		
	}

	
	public void wypiszPlansze() {
		
		int wysokosc = this.plansza.length;
		int szerokosc = this.plansza[0].length;
		for(int i = 0; i<wysokosc; i++) {
			System.out.println();
			for (int j=0; j<szerokosc; j++) {
				
				if(this.plansza[i][j] == null) {
					System.out.print("  ");
				}
				if(this.plansza[i][j] instanceof Gleba) {
					System.out.print("# ");
				}
				if(this.plansza[i][j] instanceof Dzdzownica) {
					System.out.print("{}");
				}
				if(this.plansza[i][j] instanceof Larwa) {
					System.out.print("@ ");
				}
			}
		}
		
	}
	
	public void runMole() {
		for(int i = 0; i<10; i++) {
			moleMotion.goMole();
			this.wypiszPlansze();
			System.out.println();
			System.out.println();
			
		}
	}
	
	
	public ObiektyZiemne getPlanszaij(int i, int j) {
		return plansza[i][j];
	}

	public void setPlanszaij(int i, int j, ObiektyZiemne ob) {
		this.plansza[i][j] = ob;
	}
	
	
}
