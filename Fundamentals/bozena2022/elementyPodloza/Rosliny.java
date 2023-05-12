package bozena2022.elementyPodloza;

import java.util.Random;

public abstract class Rosliny extends ElementyPodloza {

	private double wysokosc;
	protected static Random losowanieWysokosci = new Random();
	
	public Rosliny(double wysokosc) {
		this.wysokosc = wysokosc;
	}
	
	
	
}
