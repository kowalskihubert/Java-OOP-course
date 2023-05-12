package statki2018;

public class Main {

	public static void main(String[] args) {
		Gra gierka = new Gra();
		
//		for (int i =0; i<100; i++) {
//			System.out.println();
//			for(int j=0; j<100; j++) {
//				System.out.printf("%-15s", gierka.getPlanszaij(i, j));
//			}
//		}
		
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println(gierka.planszaContains("Niszczyciel87")); // działa !!!

//		gierka.graj(20);

		
//		for (int i =0; i<100; i++) {
//			System.out.println();
//			for(int j=0; j<100; j++) {
//				System.out.printf("%-15s", gierka.getPlanszaij(i, j));
//			}
//		}
		
		
		
		gierka.printPlansza();
		gierka.graj(50);
		gierka.printPlansza();
		
		
		/*
		 * Najpierw sprawdzany pierwszy warunek, drugi jest dead
		 int[] tab = new int[2];
		if(0 > 1 && tab[-1] == 0) {
			System.out.println("dupa");
		}
		 */
	}

}
