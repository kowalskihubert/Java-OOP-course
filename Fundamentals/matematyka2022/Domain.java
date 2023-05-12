package matematyka2022;

public enum Domain {
	
	R(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY),
	RPLUS(0, Double.POSITIVE_INFINITY),
	RMINUS(Double.NEGATIVE_INFINITY, 0);
	
	private double from;
	private double to;
	
	Domain(double from, double to) {
		this.from = from;
		this.to = to;
	}
	
	public boolean isInDomain(double x) {
		boolean contains;
		if(this.from < x && x < this.to) contains = true;
		else contains = false;
		return contains;
	}
	
	@Override
	public String toString() {
		
		String from, to;
		if(this.from == Double.NEGATIVE_INFINITY) from = "-inf";
		else from = "0";
		if(this.to == Double.POSITIVE_INFINITY) to = "inf";
		else to = "0";
		
		return "(" + from + ", " + to + ")";
	}
	
	
	
	
}
