package task1.elementyDna;

public class Moneta extends ElementyDna{

	private boolean polysk;
	
	public Moneta() {
		this.setWartosc(ElementyDna.losowanieWartosci.nextDouble(1, 5000));
		this.polysk = ElementyDna.losowanieWartosci.nextBoolean();
		this.setReprTekstowa("O");
	}
}
