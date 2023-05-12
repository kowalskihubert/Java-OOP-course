package grzybobranie2022;

public class MuchomorSzarawy extends GrzybToksyczny {

	private static final int rokOdkrycia = 1783;
	
	
	public MuchomorSzarawy() {
		this.setTwardosc(TwardoscGrzyba.losujTwardosc());
		this.setMasaOwocnika(Grzyb.losowanieMasy.nextInt(25,76));
		this.setToksyny(ToksynyGrzyba.trujace);
		
	}
	
	@Override 
	public void ugotuj() {
		super.ugotuj();
		this.setToksyny(ToksynyGrzyba.nieobecne);
	}
	
	@Override
	public boolean isTrujacy() {
		if(this.getToksyny() == ToksynyGrzyba.nieobecne) return false;
		else return true;
	}
	
	@Override
	public String toString() {
		return "MuchomorSromotnikowy [toksyny=" + getToksyny() + ", twardosc=" + getTwardosc()
				+ ", masaOwocnika=" + getMasaOwocnika() + ", rokOdkrycia=" + rokOdkrycia + "]";
	}
	
	
	
}
