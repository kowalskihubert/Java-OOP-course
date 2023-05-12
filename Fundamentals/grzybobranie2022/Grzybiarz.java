package grzybobranie2022;

import java.util.Random;

public class Grzybiarz {

	private AbleToGetGrzyb lasGrzybiarza;
	private static Random losowanie = new Random();

	public Grzybiarz(AbleToGetGrzyb lasGrzybiarza) {
		this.lasGrzybiarza = lasGrzybiarza;
	}
	
	public void konsumujGrzyby() {
		int n = losowanie.nextInt(51,100);
		boolean czyTrujacy = false;
		for(int i=0; i<n; i++) {
			Grzyb grzyb = lasGrzybiarza.getRandomGrzyb();
			if(grzyb == null) continue;
			System.out.println("Zebrany grzybek : " + grzyb);
			grzyb.ugotuj();
			czyTrujacy = zjedz(grzyb);
			if(czyTrujacy) break;
		}
	}
	
	private boolean zjedz(Grzyb grzyb) {
		if(grzyb.isTrujacy()) {
			System.out.println("Uuups!");
			return true;
		}
		else return false;
		
	}
			
	
}
