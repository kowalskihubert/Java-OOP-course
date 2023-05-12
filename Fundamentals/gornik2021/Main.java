package gornik2021;

public class Main {

	public static void main(String args[]) {
		
		Adit kopalnia = new Adit(3, 15, 7);
		kopalnia.wypiszSzyb();
		
		kopalnia.getGornik().goMiner();
		System.out.println("Górnik ma teraz: " + kopalnia.getGornik().getIncome());
		System.out.println();
		kopalnia.wypiszSzyb();
		
	}
}
