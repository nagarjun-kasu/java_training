package basics;

import java.util.Scanner;

public class WhileDemo3 {
	public static void main(String[] args) {
		
		int correctPin = 1234;
		Scanner scanner=new Scanner(System.in);
		int enteredPin=0;
		int maxAttempts=3;
		int attempts=0;
		
		while(correctPin != enteredPin && attempts < maxAttempts) {
			System.out.println("Enter your ATM pin: ");
			enteredPin = scanner.nextInt();
			attempts++;
			if(enteredPin != correctPin && attempts < maxAttempts) {
				System.out.println("Incorrect PIN. Attempts left: "+ (maxAttempts - attempts));
			}
		}
		
		if(enteredPin == correctPin) {
			System.out.println("Access granted");
		}
		else {
			System.out.println("Too many incorrect attempts ");
		}
		
		
		scanner.close();
	}

}
