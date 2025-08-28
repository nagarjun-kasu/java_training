package methods;

public class MethodsDemo6 {
	//instance variables
	int a=10, b=20;
	
	//instance method
	void add(int p, int q) { //local variables
		System.out.println(p+q);//350
		System.out.println(a+b);//30
	}
	
	
	public static void main(String[] args) {
		MethodsDemo6 obj=new MethodsDemo6();
		obj.add(100, 250);
		
	}

}
