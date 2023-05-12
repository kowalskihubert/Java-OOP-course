package grzybobranie2022;

import java.util.Random;

public class Las implements AbleToGetGrzyb {

	private Grzyb[][] poleGrzybowe;
	private static int domyslnyRozmiar = 100;
	private static Random losowanieMiejsc = new Random();

	public Las(int x, int y) {
		
		if(x <= 0) x = domyslnyRozmiar;
		if(y <= 0) y = domyslnyRozmiar;
		this.poleGrzybowe = new Grzyb[x][y];
		int kolumnaBez = losowanieMiejsc.nextInt(0, y);
		double czyGrzyb;
		int jakiGrzyb;
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				if(j == kolumnaBez) continue;  // domyślnie jest tam już null
				czyGrzyb = losowanieMiejsc.nextDouble();
				if(czyGrzyb <= 0.2) {
					jakiGrzyb = losowanieMiejsc.nextInt(1,5);
					switch(jakiGrzyb) {
					case(1):{
						this.poleGrzybowe[i][j] = new MuchomorSromotnikowy();
						break;
					}
					case(2):{
						this.poleGrzybowe[i][j] = new MuchomorCesarski();
						break;
					}
					case(3):{
						this.poleGrzybowe[i][j] = new MuchomorKolczastoglowy();
						break;
					}
					case(4):{
						this.poleGrzybowe[i][j] = new MuchomorSzarawy();
						break;
					}
					}
				}
//				else {
//					this.poleGrzybowe[i][j] = null; // bez sensu, null już tam jest
//				}

			}
					
		}
		// Koniec tworzenia planszy	
		
	}
	
	public Grzyb getRandomGrzyb() {
		int x = losowanieMiejsc.nextInt(0, poleGrzybowe.length);
		int y = losowanieMiejsc.nextInt(0, poleGrzybowe[0].length);
		
		Grzyb grzybDoZwrotu = this.poleGrzybowe[x][y];
		this.poleGrzybowe[x][y] = null;
		return grzybDoZwrotu;
	}

	
	
}
