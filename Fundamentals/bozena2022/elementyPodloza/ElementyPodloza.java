package bozena2022.elementyPodloza;

public abstract class ElementyPodloza implements Pressable {

	private boolean ekologiczna;
	private String reprTekstowa;

	
	public boolean isEkologiczna() {
		return ekologiczna;
	}

	public void setEkologiczna(boolean ekologiczna) {
		this.ekologiczna = ekologiczna;
	}

	public String getReprTekstowa() {
		return reprTekstowa;
	}

	public void setReprTekstowa(String reprTekstowa) {
		this.reprTekstowa = reprTekstowa;
	}
	
	
	
	
}
