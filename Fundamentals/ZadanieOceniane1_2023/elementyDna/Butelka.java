package task1.elementyDna;

public class Butelka extends ElementyDna {

	private RodzajButelki rodzaj;
	
	public Butelka() {
		this.rodzaj = RodzajButelki.losujRodzaj();
		if(this.rodzaj == RodzajButelki.ZWROTNA) {
			this.setWartosc(0.5);
		}
		else {
			this.setWartosc(0.25);
		}
		this.setReprTekstowa("()");
	}
	
	@Override
	public int distance() {
		return ElementyDna.losowanieWartosci.nextInt(2,5);
	}
}
