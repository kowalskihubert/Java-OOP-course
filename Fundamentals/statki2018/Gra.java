package statki2018;

public class Gra implements Grajable {
	
	private Okret[][] plansza = new Okret[100][100];
	private static GeneratorOkretow generatorOkretow = new GeneratorOkretow();
	private Dzialo dzialo = new Dzialo();
	
	public Gra() {
		
		inicjalizuj(100, 500, 1000);
		
	}
	
	public Gra(int liczbaNiszczycieli, int liczbaFregat, int liczbaKorwet) {
		
		inicjalizuj(liczbaNiszczycieli, liczbaFregat, liczbaKorwet);
		
	}
	
	private void inicjalizuj(int liczbaNiszczycieli, int liczbaFregat, int liczbaKorwet) {
		boolean utworzono;
		
		for(int i =0; i<liczbaNiszczycieli; i++) {
			utworzono = false;
			while(!utworzono) {
				
				int[] pozycja = generatorOkretow.generujPozycje();
				
				if(plansza[pozycja[0]][pozycja[1]] == null) {
					Niszczyciel okret = (Niszczyciel)generatorOkretow.generujOkret("Niszczyciel",pozycja, this);
					plansza[pozycja[0]][pozycja[1]] = okret;
					utworzono = true;
				}
			}	
		}
		
		for(int i =0; i<liczbaFregat; i++) {
			utworzono = false;
			while(!utworzono) {
				
				int[] pozycja = generatorOkretow.generujPozycje();
				
				if(plansza[pozycja[0]][pozycja[1]] == null) {
					Fregata okret = (Fregata)generatorOkretow.generujOkret("Fregata",pozycja, this);
					plansza[pozycja[0]][pozycja[1]] = okret;
					utworzono = true;
				}	
			}	
		}
		
		for(int i =0; i<liczbaKorwet; i++) {
			utworzono = false;
			while(!utworzono) {
				
				int[] pozycja = generatorOkretow.generujPozycje();
				
				if(plansza[pozycja[0]][pozycja[1]] == null) {
					Korweta okret = (Korweta)generatorOkretow.generujOkret("Korweta",pozycja, this);
					plansza[pozycja[0]][pozycja[1]] = okret;
					utworzono = true;
				}	
			}	
		}
		
	}

	public void graj(int liczbaTur) {
		
		for(int i=0; i<liczbaTur; i++) {
			System.out.println("Tura nr " + (i+1));
			for(int j=0;j<10;j++) {
				
				int[] pozycja = dzialo.losujPozycjeDoOstrzalu();
				while(plansza[pozycja[0]][pozycja[1]] == null) {
					pozycja = dzialo.losujPozycjeDoOstrzalu();
				}
				
				dzialo.ostrzelajOkret(plansza[pozycja[0]][pozycja[1]]);
			}
		}
		
	}
	
	public void printPlansza() {
		
		for (int i =0; i<100; i++) {
			System.out.println();
			for(int j=0; j<100; j++) {
				if(plansza[i][j] == null) {
					System.out.print("~");
				}
				else {
					System.out.print(plansza[i][j].getSymbol());
				}
			}
		}	
	}
	
	
	public Okret getPlanszaij(int wiersz, int kol) {
		return plansza[wiersz][kol];
	}
	
	public Okret[][] getPlansza() {
		return plansza;
	}

	public void setPlanszaij(int w, int k, Okret okret) {
		this.plansza[w][k] = okret;
	}
	
	
	public boolean planszaContains(String nazwa) {
		boolean contains = false;
		for (int i =0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(plansza[i][j] == null) continue;
				if(plansza[i][j].toString().equals(nazwa)) contains=true;
			}
		}
		return contains;
	}
	
	
}
