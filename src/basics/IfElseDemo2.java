package basics;

public class IfElseDemo2 {
	public static void main(String[] args) {
		
		double balance = 5000;
		
		double withdrawAmount=6000;
		
		if(withdrawAmount <= balance) {
			balance = balance - withdrawAmount;
			System.out.println("withdrawal successful..Remaining balance is "+ balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
		
		
	}

}
