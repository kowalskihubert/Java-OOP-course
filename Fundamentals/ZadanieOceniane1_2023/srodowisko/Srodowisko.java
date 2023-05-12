package task1.srodowisko;

import java.util.Random;

import task1.elementyDna.But;
import task1.elementyDna.Butelka;
import task1.elementyDna.ElementyDna;
import task1.elementyDna.Moneta;
import task1.elementyDna.Zegarek;
import task1.elementyDna.ZegarekPodwodny;

public class Srodowisko {

	private ElementyDna[][] dnoRzeki;
	protected static Random losowanieMiejsc = new Random();
	
	public Srodowisko(int dlugosc, int szerokosc) throws WrongSizeException {
		
		if(dlugosc < 1 || dlugosc > 100 || szerokosc < 1 || szerokosc > 100) {
			throw new WrongSizeException();
		}
		
		this.dnoRzeki = new ElementyDna[szerokosc][dlugosc];
		for(int i=0;i<szerokosc;i++) {
			for(int j=0;j<dlugosc;j++) {
				if(losowanieMiejsc.nextInt(10) == 0) {
					switch(losowanieMiejsc.nextInt(5)) {
					case 0:
						dnoRzeki[i][j] = new Moneta();
						break;
					case 1:
						dnoRzeki[i][j] = new Zegarek();
						break;
					case 2:
						dnoRzeki[i][j] = new ZegarekPodwodny();
						break;
					case 3:
						dnoRzeki[i][j] = new But();
						break;
					default:
						dnoRzeki[i][j] = new Butelka();
					}
				}
			}
		}
		// Koniec wypełniania dna	
	}
	
	public void moveAll() {
		
		int dlugosc = this.dnoRzeki[0].length;  //dlugosc to kolumny
		int szerokosc = this.dnoRzeki.length;
		int dystans;
		for(int i=0;i<szerokosc;i++) {
			for(int j=0;j<dlugosc;j++) {
				if(this.dnoRzeki[i][j] == null) continue;
				dystans = this.dnoRzeki[i][j].distance();
				if((j+dystans) < dlugosc && dnoRzeki[i][j+dystans] == null) {
					dnoRzeki[i][j+dystans] = dnoRzeki[i][j];
					dnoRzeki[i][j] = null;
				}
				if((j+dystans >= dlugosc)) {
					dnoRzeki[i][j] = null;
				}	
			}
		}
		
	}
	
	protected ElementyDna[][] getDnoRzeki() {
		return this.dnoRzeki;
	}
	
}
