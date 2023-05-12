package bozena2022.elementyPodloza;

public class Purchawka extends Rosliny {

	public Purchawka() {
		
		super(Rosliny.losowanieWysokosci.nextDouble(3.5, 7.5));
		this.setEkologiczna(losowanieWysokosci.nextBoolean());
		this.setReprTekstowa("o");
	}

	@Override
	public void pressMe() {
		System.out.println("Puffff");
		
	}
	
	
	
	
}
