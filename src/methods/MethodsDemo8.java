package methods;

public class MethodsDemo8 {
	
	String username, password;
	
	void credentials(String username, String password) {
		System.out.println(username+" --- "+password); //local variable
		
		//assign values of local variables to instance variables
		this.username=username;
		this.password=password;
		
	}
	
	//instance method
	void login() {
		System.out.println(username+" --- "+password);
	}
	
	public static void main(String[] args) {
		MethodsDemo8 obj=new MethodsDemo8();
		obj.credentials("TestUser", "Test@321");
		
		obj.login();
	}

}
