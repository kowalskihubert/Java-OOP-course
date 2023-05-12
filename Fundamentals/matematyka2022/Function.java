package matematyka2022;

public abstract class Function implements Deriverable {

	private Domain dziedzina;
	
	public Function(Domain d) {
		this.dziedzina = d;
	}
	
	public abstract double Calculate(double x);
	
	protected boolean isInDomain(double x) {
		return dziedzina.isInDomain(x);
	}
	
	protected void handleNotInDomain(double x) {
		System.out.println(String.valueOf(x) + " nie należy do " + dziedzina);
	}
	
	public static double calculateSum(Function f1, Function f2, double x) {
		// Implementacja Calculate może się różnić w zależności od tego co wsadzimy zamiast f1, f2
		return f1.Calculate(x) + f2.Calculate(x);
	}
	
	public static double calculateSumDerivative(Function f1, Function f2, double x) {
		// pochodna sumy to suma pochodnych
		return f1.CalculateDerivative(x) + f2.CalculateDerivative(x);
	}
	
	public static double[] calculateRowSums(Function[][] funs, double x) {
		int w = funs.length;
		double[] wynik = new double[w];
		double rowSum;
		for (int i = 0; i<w; i++) {
			rowSum = 0;
			if(funs[i] != null) {
				for(Function f: funs[i]) {
					rowSum += f.Calculate(x);
				}
			}
			wynik[i] = rowSum;
		}
		
		return wynik;
	}
	
	

	
}
