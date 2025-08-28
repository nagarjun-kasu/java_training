package methods;

public class MethodsDemo3 {
	
	//instance methods
	void login() {
		System.out.println("login method without parameter");
	}
	
	void login(String username) {
		System.out.println("login method with parameter username: "+username);
	}
	
	
	public static void main(String[] args) {
		MethodsDemo3 obj=new MethodsDemo3();
		obj.login();
		obj.login("testuser");
		
	}

}

/*
Method signature: Method name and it's parameters list is called method signature

Inside the class, it is not possible to declare two methods with same signature. duplicate methods are not allowed.

*/
