package methods;

public class MethodsDemo7 {
	//instance variables
		int a=10, b=20;
		
		//instance method
		void add(int a, int b) { //local variables
			System.out.println(a+b);//350
			System.out.println(this.a+this.b);//30
		}
		
		public static void main(String[] args) {
			MethodsDemo7 obj=new MethodsDemo7();
			obj.add(100, 250);
			
			//System.out.println(this.a); cannot use this in a static context
			
		}

}
/*
'this' keyword is applicable for instance area only.
*/