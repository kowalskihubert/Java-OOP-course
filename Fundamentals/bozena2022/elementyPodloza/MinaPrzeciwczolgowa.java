package bozena2022.elementyPodloza;

import java.util.Random;

public class MinaPrzeciwczolgowa extends Miny {

	private double masaMatWybuchowego;
	private static Random losowanieMatWybuchowego = new Random();
	
	public MinaPrzeciwczolgowa() {
		
		super(); // czy to potrzbne??
		this.masaMatWybuchowego = losowanieMatWybuchowego.nextDouble(1.5, 2.5);
		this.setEkologiczna(false);
		this.setReprTekstowa("X");
	}
	
	@Override
	public void pressMe() {
		if(this.isUzbrojona())  System.out.println("Kaboom!!!");
		else System.out.println("Chrup");
	}
	
}
