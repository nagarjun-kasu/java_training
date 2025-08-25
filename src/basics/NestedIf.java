package basics;

public class NestedIf {
	
	public static void main(String[] args) {
		int a=1000, b=200, c=300;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a value is largest number");
			}
			else{
				System.out.println("c value is largest number");
			}
		}
		else {
			if(b>c) {
				System.out.println("b value is largest number");
			}
			else {
				System.out.println("c value is largest");
			}
		}
		
		
	}
	

}

/*
Nested if: if block insider another if block

if(condition1){
	if(condition2){
	--
	---
	}
	else if(condition3){
	--
	--
	}
	else{
	--
	--
	}

}
else{
 if(condition4){
   --
   --
   --
 }
 else if(condition5){
    ---
    ---
 }
 else{
  --
  --
  --
 }
}



*/