package task1.srodowisko;

public class SrodowiskoWithIloscWywolan extends Srodowisko {

	private int iloscWywolan = 0;
	
	public SrodowiskoWithIloscWywolan(int dlugosc, int szerokosc) throws WrongSizeException {
		super(dlugosc, szerokosc);
	}
	
	@Override
	public void moveAll() {
		super.moveAll();
		this.iloscWywolan++;
	}

	public int getIloscWywolan() {
		return iloscWywolan;
	}
	
	

	
}
