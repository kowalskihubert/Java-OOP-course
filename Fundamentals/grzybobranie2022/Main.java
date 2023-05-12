package grzybobranie2022;

public class Main {

	public static void main(String[] args) {
		
		AbleToGetGrzyb las = new Las(30,100);
		Grzybiarz grzybiarz = new Grzybiarz(las);
		grzybiarz.konsumujGrzyby();
		
		
	}
}
