package matematyka2022;

public class Linear extends Function {
	
	private double a;
	private double b;
	
	public Linear(double a, double b, Domain domain) {
		super(domain);
		this.a = a;
		this.b = b;
	}
	
	public Linear(String s) {
		super(Domain.R);
		if(s.contains("x")) {
			int indX = s.indexOf("x");
			
			String a = s.substring(0,indX);
			String b = s.substring(indX + 1, s.length());
			
			if(a == "") a = "1";
			if(a == "-") a = "-1";
			if(a == "+") a = "1";
			if(b == "") b = "0";
			
			this.a = (double)Double.valueOf(a);
			this.b = (double)Double.valueOf(b);
		}
		else {
			this.a = 0;
			this.b = (double)Double.valueOf(s);
		}
	}
	
	@Override
	public double Calculate(double x) {
		
		if(this.isInDomain(x)) {
			return this.a * x + this.b;
		}
		else {
			this.handleNotInDomain(x);
			return 0;
		}
	}

	@Override
	public double CalculateDerivative(double x) {
		
		if(this.isInDomain(x)) {
			return this.a;
		}
		else {
			this.handleNotInDomain(x);
			return 0;
		}
		
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	
	
	

}
