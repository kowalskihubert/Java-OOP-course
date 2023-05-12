package task1.elementyDna;

public class ZegarekPodwodny extends Zegarek {

	private boolean dziala;
	
	public ZegarekPodwodny() {
		super();
		this.dziala = ElementyDna.losowanieWartosci.nextBoolean();
		this.setReprTekstowa("_*_");
	}
	
}
