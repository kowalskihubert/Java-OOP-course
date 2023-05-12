package bozena2022.elementyPodloza;

public abstract class Miny extends ElementyPodloza {

	private static int licznikPorzadkowy = 1;
	private int identyfikatorMiny;
	private boolean uzbrojona = false;  // czy domyślnie to jest false?
	
	
	public Miny() {
		this.identyfikatorMiny = licznikPorzadkowy * 10;
		licznikPorzadkowy++;
	}
	
	public void armMe() {
		this.uzbrojona = true;
	}
	
	
	public boolean isUzbrojona() {
		return uzbrojona;
	}
	
	public int getIdentyfikatorMiny() {
		return identyfikatorMiny;
	}


}
