package bozena2022.elementyPodloza;

import java.util.Random;

public class MinaPrzeciwpiechotna extends Miny {

	private TypObudowyMiny obudowa;
	private Random losowanieTypuObudowy = new Random();
	
	public MinaPrzeciwpiechotna() {
		
		super();  // czy to potrzebne??
		
		int typObudowy = losowanieTypuObudowy.nextInt(1, 4);
		switch(typObudowy) {
		case(1): this.obudowa = TypObudowyMiny.karton;
		case(2): this.obudowa = TypObudowyMiny.metal;
		case(3): this.obudowa = TypObudowyMiny.plastik;
		}
		
		if(obudowa == TypObudowyMiny.karton) {
			this.setEkologiczna(true);
		}
		else {
			this.setEkologiczna(false);
		}
		this.setReprTekstowa("x");
	}

	
	
	@Override
	public void pressMe() {
		if(this.isUzbrojona())   System.out.println("Boom!");
		else System.out.println("Chrup");
	}

	
	
}
