package bozena2022;

import java.util.Random;

import bozena2022.elementyPodloza.ElementyPodloza;
import bozena2022.elementyPodloza.MinaPrzeciwczolgowa;
import bozena2022.elementyPodloza.MinaPrzeciwpiechotna;
import bozena2022.elementyPodloza.Purchawka;
import bozena2022.elementyPodloza.Trawa;

public class Environment {

	private ElementyPodloza[][] poleMinowe = new ElementyPodloza[100][100];
	private Random losowanieRozmieszczenia = new Random();
	private AbleToDestroyMines destroyer;

	
	public Environment() {
		
		int czyWstawiamy, jakiObiekt, czyUzbrojona;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				czyWstawiamy = losowanieRozmieszczenia.nextInt(1,11);
				if(czyWstawiamy <= 4) {
					jakiObiekt = losowanieRozmieszczenia.nextInt(1,5);
					switch(jakiObiekt) {
					case(1): {
						this.poleMinowe[i][j] = new Trawa();
						break;
					}
					case(2): {
						this.poleMinowe[i][j] = new Purchawka();
						break;
					}
					case(3): {
						MinaPrzeciwpiechotna mina = new MinaPrzeciwpiechotna();
						czyUzbrojona = losowanieRozmieszczenia.nextInt(1,11);
						if(czyUzbrojona<=9) mina.armMe();
						this.poleMinowe[i][j] = mina;
						break;
					}
					case(4): {
						MinaPrzeciwczolgowa mina = new MinaPrzeciwczolgowa();
						czyUzbrojona = losowanieRozmieszczenia.nextInt(1,11);
						if(czyUzbrojona<=9) mina.armMe();
						this.poleMinowe[i][j] = mina;
						break;
					}
					}
				}
				else {
					this.poleMinowe[i][j] = null;  // absolutnie niepotrzebne, null jest tam domyślnie
				}
				
			}
		}
		// Koniec wypełniania polaMinowego
		
		// Dla pokazu:
		this.destroyer = new Bozena(this.poleMinowe);
		
	}
	
	public AbleToDestroyMines getDestroyer() {
		return this.destroyer;
	}
	
	public void wypiszPole() {
		
		for(int i=0; i<100; i++) {
			System.out.println();
			for(int j=0; j<100; j++) {
				if(this.poleMinowe[i][j] == null) {
					System.out.print(" ");
				}
				else {
					System.out.print(this.poleMinowe[i][j].getReprTekstowa());
				}	
			}	
		}
	}
	
		
	
}
