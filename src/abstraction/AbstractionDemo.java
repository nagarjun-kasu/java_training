package abstraction;

public class AbstractionDemo {
	
	public static void main(String[] args) {
		
		Bank b = new ICICI();
		double icici_roi = b.getRateOfInterest();
		System.out.println(icici_roi);
		
		Bank b2 = new SBI();
		double sbi_roi = b2.getRateOfInterest();
		System.out.println(sbi_roi);
		
	}

}


/*
Abstraction:
Abstraction is the process of hiding the implementation details and showing only functionality to the user.

In Java, abstraction is achieved using:
	1. abstract class
	2. interface


abstract method:
A method declared with abstract keyword without implementation is called abstract method.
public abstract void methodname();


Note: It is not possible to object for abstract class
*/