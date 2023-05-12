package grzybobranie2022;

public class MuchomorCesarski extends Grzyb {

	public MuchomorCesarski() {
		this.setTwardosc(TwardoscGrzyba.twardy);
		this.setMasaOwocnika(Grzyb.losowanieMasy.nextInt(50, 76));
	}
	
	@Override
	public boolean isTrujacy() {
		return false;
	}
	
	@Override
	public String toString() {
		return "MuchomorCesarski [twardosc=" + getTwardosc()
				+ ", masaOwocnika=" + getMasaOwocnika() + "]";
	}
	
	
	
}
