package basics;

public class IfElseIfDemo {
	
	public static void main(String[] args) {
		int a=25, b=50;
		
		if(a==b) {
			System.out.println("Both a and b values are equal");
		}
		else if(a<b) {
			System.out.println("a value is less than b");
		}
		else {
			System.out.println("a value is greater than b");
		}
		
	}

}

/*
if(condition1){

}
else if(condition2){

}
else if(condition3){

}
else{

}

*/