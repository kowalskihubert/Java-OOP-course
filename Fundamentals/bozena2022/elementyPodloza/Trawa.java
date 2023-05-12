package bozena2022.elementyPodloza;

public class Trawa extends Rosliny {

	public Trawa() {
		
		super(Rosliny.losowanieWysokosci.nextDouble(10.5, 50.5));
		this.setEkologiczna(true);
		this.setReprTekstowa("|");

	}

	@Override
	public void pressMe() {
		System.out.println("Chrup");
	}

	
	
}
