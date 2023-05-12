package task1.elementyDna;

public class Zegarek extends ElementyDna {

	private static int licznikPorzadkowy = 1;
	private int numerSeryjny;
	private boolean polysk;
	
	public Zegarek() {
		this.numerSeryjny = licznikPorzadkowy * 10;
		licznikPorzadkowy++;
		this.setWartosc(ElementyDna.losowanieWartosci.nextDouble(200, 250));
		this.polysk = ElementyDna.losowanieWartosci.nextBoolean();
		this.setReprTekstowa("*");
	}
}
