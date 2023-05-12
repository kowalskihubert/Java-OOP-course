package bozena2022;

public class Main {

	public static void main(String[] args) {
		
		Environment noweSrodowisko = new Environment();
		noweSrodowisko.wypiszPole();
		for(int i = 0; i<50; i++)  noweSrodowisko.getDestroyer().destroyMines();
		noweSrodowisko.wypiszPole();
		
		
	}
}
