package basics;

public class ForDemo1 {
	public static void main(String[] args) {
		
		//to print numbers from 1 to 20
		for(int num=1; num<=20; num++) {
			if(num%2==0) {
				System.out.println(num); //2 4
			}
		}
		
		System.out.println("After for loop");
		
	}

}


/*
for(initialization; condition; increment/decrement){
---
--
--
---
---

}

*/