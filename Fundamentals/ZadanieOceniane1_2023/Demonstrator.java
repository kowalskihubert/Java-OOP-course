package task1;

import task1.srodowisko.Srodowisko;
import task1.srodowisko.SrodowiskoWithReprTekstowa;
import task1.srodowisko.WrongSizeException;

public class Demonstrator {

	public static void main(String[] args) {
		
		try {
			// Srodowisko environment = new Srodowisko(60, -4);
//			Srodowisko environment = new Srodowisko(60, 30);
//			for(int i=0;i<10;i++) {
//				environment.moveAll();
//			}
			
			SrodowiskoWithReprTekstowa env2 = new SrodowiskoWithReprTekstowa(60, 15);
			for(int i=0;i<10;i++) {
				System.out.printf("MOVE %d:", (i+1));
				env2.moveAll();
				System.out.println("\n\n");
			}
			
			
		} catch (WrongSizeException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		

	}

}
