package grzybobranie2022;

public class MuchomorKolczastoglowy extends Grzyb {

	
	
	public MuchomorKolczastoglowy() {
		this.setTwardosc(TwardoscGrzyba.losujTwardosc());
		this.setMasaOwocnika(Grzyb.losowanieMasy.nextInt(25, 76));
		
	}
	
	@Override
	public boolean isTrujacy() {
		return false;
	}
	
	@Override
	public String toString() {
		return "MuchomorKolczastoglowy[twardosc=" + getTwardosc()
				+ ", masaOwocnika=" + getMasaOwocnika() + "]";
	}
	
	
}

