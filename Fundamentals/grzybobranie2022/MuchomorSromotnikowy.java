package grzybobranie2022;

public class MuchomorSromotnikowy extends GrzybToksyczny {

	
	
	public MuchomorSromotnikowy() {
		
		this.setTwardosc(TwardoscGrzyba.losujTwardosc());
		this.setMasaOwocnika(Grzyb.losowanieMasy.nextInt(25,76));
		if(this.getMasaOwocnika() < 50)  this.setToksyny(ToksynyGrzyba.zabojcze);
		else this.setToksyny(ToksynyGrzyba.wyjatkowoZabojcze);;
	}

	@Override
	public boolean isTrujacy() {
		return true;
	}
	
	@Override
	public String toString() {
		return "MuchomorSromotnikowy [toksyny=" + getToksyny() + ", twardosc=" + getTwardosc()
				+ ", masaOwocnika=" + getMasaOwocnika() + "]";
	}


	


	
}
