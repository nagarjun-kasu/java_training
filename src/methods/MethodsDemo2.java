package methods;

public class MethodsDemo2 {
	
	//methods with parameters
	
	//instance method
	void employeeDetails(int empId, String employeeName) {
		System.out.println(empId+" --- "+employeeName);
	}
	
	static void sendKeys(String element, String value) {
		System.out.println(element+" ---- "+value);
	}
	
	
	public static void main(String[] args) {
		MethodsDemo2 obj = new MethodsDemo2();
		obj.employeeDetails(1234, "Nagarjun");
		obj.employeeDetails(100, "Ellar");
		
		MethodsDemo2.sendKeys("username", "TestUser");
		
		
		
	}

}
