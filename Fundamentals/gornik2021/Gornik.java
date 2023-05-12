package gornik2021;

public class Gornik {

	private int income = 0;
	private ObiektyKopalniane[][] kopalniaGornika;
	
	
	public Gornik(ObiektyKopalniane[][] kopalniaGornika) {
		this.kopalniaGornika = kopalniaGornika;
	}
	
	public void goMiner() {

		
		int dlugoscSzybu = this.kopalniaGornika.length;
		
		
		for(int i =0; i<dlugoscSzybu; i++) {
			
			if(kopalniaGornika[i] == null) {
				continue;
			}
			
			for(int j=0;j< kopalniaGornika[i].length;j++) {
				if(kopalniaGornika[i][j] != null)
				{
					income += kopalniaGornika[i][j].getModifiedMarketValue();
					kopalniaGornika[i][j] = null;
				}
			}
		}
		
	}

	
	public int getIncome() {
		return income;
	}



	
	
	
	
	
}
