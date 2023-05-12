package matematyka2022;

public class Main {

	public static void main(String[] args) {
		
//		Domain d = Domain.RMINUS;
//		System.out.println(d);
//		System.out.println(d.isInDomain(-28.442));
//		Domain d2 = Domain(4.3, 5.4);  // konstruktor Enuma jest prywatny!
		
		
		Function[][] funs = {
			{new Sinus(Domain.R) , new Exponent(Domain.R)}, {}, {new Linear(2,3,Domain.R), new Linear(-1,17,Domain.R)}, null, {new Exponent(Domain.R)}};   
		double x = 0;
		double tab[] = Function.calculateRowSums(funs, x);
		System.out.print("[");
		for(double i: tab) {
			System.out.print(i + ", ");
		}
		System.out.print("]");
		System.out.println();
		
		Linear l = new Linear("2x");
		System.out.println(l.getA() + ", " + l.getB());
		
		
	}

}
