package refleksjeAdnotacje.zadanieWinda.windy;


import refleksjeAdnotacje.zadanieWinda.solution.DomyslneWartosciBezpiecznika;

public class BezpiecznikZasilania {
	
	private int amperaz = 20;
	private Stan stan = Stan.ROZLACZONY;//Na potrzeby zadania

	@DomyslneWartosciBezpiecznika
	public BezpiecznikZasilania(int amperaz, Stan stan) {
		super();
		this.amperaz = amperaz;
		this.stan = stan;
	}

	public enum Stan {
		WLACZONY, ROZLACZONY
	}
	
	public void wlacz() {
		stan = Stan.WLACZONY;
	}
	
	public void wylacz() {
		stan = Stan.ROZLACZONY;
	}
	
}
