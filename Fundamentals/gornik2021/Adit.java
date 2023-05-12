package gornik2021;

import java.util.Random;

public class Adit {

	private ObiektyKopalniane[][] szyb;
	private Random losowanieKorytarzyIMineralow = new Random();
	private Gornik gornik;
	
	
	public Adit(int maxDystans, int dlugoscKorytarzy, int iloscKorytarzy) {
		
		int dlugoscSzybu = maxDystans * (iloscKorytarzy+1);
		ObiektyKopalniane[][] szyb = new ObiektyKopalniane[dlugoscSzybu][];
		int ostatniKorytarz = -1, przesuniecie, a;
		
		for(int i = 0; i<iloscKorytarzy; i++) {
			
			przesuniecie = losowanieKorytarzyIMineralow.nextInt(1,maxDystans+1);
			ObiektyKopalniane[] korytarz = new ObiektyKopalniane[dlugoscKorytarzy];
			for(int j = 0; j<dlugoscKorytarzy; j++) {
				a = losowanieKorytarzyIMineralow.nextInt(1,11);
				if(a == 1) {
					korytarz[j] = new Chalkolit(50);
				}
				else if(a == 2 || a == 3) {
					korytarz[j] = new Uraninit(50);
				}
				else {
					korytarz[j] = new Skala();
				}
			}
			
			szyb[ostatniKorytarz + przesuniecie] = korytarz;
			ostatniKorytarz += przesuniecie;
		}
		
		this.szyb = szyb;
		// Stworzenie górnika:
		this.gornik = new Gornik(this.szyb);
	}
	
	
	public void wypiszSzyb() {

		
		int dlugoscSzybu = this.szyb.length;
		for(int i =0; i<dlugoscSzybu; i++) {
			System.out.println();
			if(szyb[i] == null) {
				System.out.print(" ");
				continue;
			}
			else System.out.print("->");
			for(int j=0;j< szyb[i].length;j++) {
				if(szyb[i][j] == null)
				{
					System.out.print(" ");
				}
				else {
					System.out.print(" " + szyb[i][j].getBazowaWartoscRynkowa());
				}
				
			}
		}
		
		
	}


	
	
	public Gornik getGornik() {
		return gornik;
	}



	
	
	
	
}
