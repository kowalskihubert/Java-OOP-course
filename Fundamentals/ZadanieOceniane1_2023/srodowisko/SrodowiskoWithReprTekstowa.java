package task1.srodowisko;

import task1.elementyDna.ElementyDna;

public class SrodowiskoWithReprTekstowa extends Srodowisko {

	public SrodowiskoWithReprTekstowa(int dlugosc, int szerokosc) throws WrongSizeException {
		super(dlugosc, szerokosc);
	}
	
	@Override
	public void moveAll() {
		super.moveAll();
		ElementyDna[][] dnoRzeki = this.getDnoRzeki();
		int dlugosc = dnoRzeki[0].length;
		int szerokosc = dnoRzeki.length;
		for(int i=0;i<szerokosc;i++) {
			System.out.println();
			for(int j=0;j<dlugosc;j++) {
				if(dnoRzeki[i][j] == null) {
					System.out.print(" ");
				}
				else {
					System.out.print(dnoRzeki[i][j].getReprTekstowa());
				}
			}
		}
		
	}

}
