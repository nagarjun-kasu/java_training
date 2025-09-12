package abstraction;

public class SBI extends Bank{

	@Override
	double getRateOfInterest() {
		System.out.println("sbi getrateofinterest method");
		return 10.25;
	}

}
