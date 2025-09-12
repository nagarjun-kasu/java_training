package abstraction;

public class ICICI extends Bank{

	@Override
	double getRateOfInterest() {
		System.out.println("icici getrateofinterest method");
		return 11.75;
	}

}
