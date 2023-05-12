package gornik2021;

public abstract class ObiektyKopalniane implements MineryObjectEvaluator {

	private double bazowaWartoscRynkowa;

	
	public ObiektyKopalniane(double bazowaWartoscRynkowa) {
		this.bazowaWartoscRynkowa = bazowaWartoscRynkowa;
	}

	public double getBazowaWartoscRynkowa() {
		return bazowaWartoscRynkowa;
	}

	protected void setBazowaWartoscRynkowa(double bazowaWartoscRynkowa) {
		this.bazowaWartoscRynkowa = bazowaWartoscRynkowa;
	}
	
	
	
}
