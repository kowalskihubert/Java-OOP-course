package kret2021;

import java.util.Random;

public class Kret extends ObiektyZiemne implements MoleMotion {

	private GatunkiKreta gatunek;
	private ObiektyZiemne[][] planszaKreta;
	private static Random losowanieMiejsca = new Random();
	
	
	public Kret(GatunkiKreta gatunek, ObiektyZiemne[][] planszaKreta) {
		super(ObiektyZiemne.losowanieGestosciMasyWartosciO.nextInt(200,241));
		this.gatunek = gatunek;
		this.planszaKreta = planszaKreta;
	}


	@Override
	public void goMole() {
		
		int w = planszaKreta.length;
		int k = planszaKreta[0].length;
		int x = losowanieMiejsca.nextInt(0,w);
		int y = losowanieMiejsca.nextInt(0,k);
		
		if(planszaKreta[x][y] == null) {
			System.out.println("Pusto :(");
		}
		else {
			this.setWartoscOdzywcza(this.getWartoscOdzywcza() + planszaKreta[x][y].getWartoscOdzywcza() );
			System.out.println("Mniam! Dodana wart. odż.: " + planszaKreta[x][y].getWartoscOdzywcza() + ". Lokalizacja: [" + x + ", " + y + "]");   
			planszaKreta[x][y] = null;
		}
		
	}


	@Override
	public String getNutritionalValue() {
		return String.valueOf(this.getWartoscOdzywcza());
	}
	
	
	
}
