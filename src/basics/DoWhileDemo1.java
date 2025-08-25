package basics;

public class DoWhileDemo1 {
	
	public static void main(String[] args) {
		
		int num=1;
		do {
			System.out.println(num); //1 2 3
			num++;
			
		}while(num<=10);
		
		//To print even numbers from 1 to 20
		System.out.println("---- Even numbers from 1 to 20 ----");
		int n=1;
		do {
			if(n%2==0) {
				System.out.println(n);
			}
			n++;
		}while(n<=20);
	}

}


/*

do{

 ---
 -- statements
 ---
 } while(condition);


*/