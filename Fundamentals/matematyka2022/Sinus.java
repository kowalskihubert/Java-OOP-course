package matematyka2022;

public class Sinus extends Function {

	public Sinus (Domain domain) {
		super(domain);
	}

	@Override
	public double Calculate(double x) {
		
		if(this.isInDomain(x)) {
			return Math.sin(x);
		}
		else {
			this.handleNotInDomain(x);
			return 0;
		}
	}

	@Override
	public double CalculateDerivative(double x) {
		
		if(this.isInDomain(x)) {
			return Math.cos(x);
		}
		else {
			this.handleNotInDomain(x);
			return 0;
		}
	}
}
