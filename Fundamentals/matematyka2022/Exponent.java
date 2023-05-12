package matematyka2022;

public class Exponent extends Function {

	public Exponent(Domain domain) {
		super(domain);
	}

	@Override
	public double Calculate(double x) {
		
		if(this.isInDomain(x)) {
			return Math.exp(x);
		}
		else {
			this.handleNotInDomain(x);
			return 0;
		}
	}

	@Override
	public double CalculateDerivative(double x) {
		
		if(this.isInDomain(x)) {
			return Math.exp(x);
		}
		else {
			this.handleNotInDomain(x);
			return 0;
		}
		
	}
	
	
	
	
	
}
