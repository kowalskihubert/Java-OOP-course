package task1.elementyDna;

public class But extends ElementyDna {

	private static String rodzajButa = "Kalosz";
	
	public But() {
		this.setWartosc(0);
		this.setReprTekstowa("@");
	}
	
	@Override
	public int distance() {
		return ElementyDna.losowanieWartosci.nextInt(2,4);  // upperBound jest exclusive stąd 4
	}
}
