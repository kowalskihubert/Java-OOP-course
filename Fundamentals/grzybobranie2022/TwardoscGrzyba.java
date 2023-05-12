package grzybobranie2022;

import java.util.Random;

public enum TwardoscGrzyba {

	twardy,
	miekki,
	sredniotwardy;
	
	private static Random losowanie = new Random();
	
	public static TwardoscGrzyba losujTwardosc() {
		int a = losowanie.nextInt(1,4);
		switch(a) {
		case(1): {
			return TwardoscGrzyba.twardy;
		}
		case(2): {
			return TwardoscGrzyba.miekki;

		}
		case(3): {
			return TwardoscGrzyba.sredniotwardy;
		}
		default: return TwardoscGrzyba.twardy;  // tylko żeby eclipse nie wariował
		}
	}
	
}
