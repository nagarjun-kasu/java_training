package methods;

public class MethodsDemo13 {
	
	
	int add(int num1, int num2) {
		
		//int sum = num1+num2;
		return num1+num2;
	}
	
	public static void main(String[] args) {
		MethodsDemo13 obj=new MethodsDemo13();
		int sum = obj.add(10, 20);
		System.out.println("SUM= "+sum);
		
	}

}
