package bozena2022;

import java.util.Random;

import bozena2022.elementyPodloza.ElementyPodloza;

public class Bozena implements AbleToDestroyMines {

	private ElementyPodloza[][] poleMinoweBozenki;
	private static Random random = new Random();

	public Bozena(ElementyPodloza[][] poleMinowe) {
		this.poleMinoweBozenki = poleMinowe;
	}

	public void destroyMines() {
		int wylosowanyWiersz = random.nextInt(1,100);
		for(int i=0; i<100; i++) {
			if(this.poleMinoweBozenki[wylosowanyWiersz][i] != null) {
				this.poleMinoweBozenki[wylosowanyWiersz][i].pressMe();
				this.poleMinoweBozenki[wylosowanyWiersz][i] = null;
			}
		}
	}
	
	
	public ElementyPodloza getPoleMinoweBozenkiIJ(int i, int j) {
		return poleMinoweBozenki[i][j];
	}

	public void setPoleMinoweBozenkiIJ(int i, int j, ElementyPodloza el) {
		this.poleMinoweBozenki[i][j] = el;
	}
	
	
	
}
