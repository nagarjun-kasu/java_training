package basics;

public class IfElseDemo {
	public static void main(String[] args) {
		
		double purchaseAmount = 400;
		
		if(purchaseAmount > 1000) {
			double discount = purchaseAmount*10/100;
			System.out.println("Discount Amount: "+discount);
			System.out.println("Amount Payable: "+ (purchaseAmount-discount));
		}
		else if(purchaseAmount>500) {
			double discount = purchaseAmount*5/100;
			System.out.println("Discount Amount: "+discount);
			System.out.println("Amount Payable: "+ (purchaseAmount-discount));
		}
		else {
			System.out.println("No discount applicable");
			System.out.println("Amount Payable: "+purchaseAmount);
		}
		
		
		
		
		
		
	}

}

/*
if purchase amount is >1000 , 10% discount
if purchase amount is > 500, 5% discount
if purchase amount is <500, no discount

*/