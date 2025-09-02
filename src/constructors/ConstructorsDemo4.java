package constructors;

public class ConstructorsDemo4 {
	//instance variables
	String username, password;
	
	ConstructorsDemo4(String username, String password){ //local variables
		this.username = username;
		this.password = password;
		
	}
	
	void login() {
		System.out.println(username+ " ---- "+password);
	}
	
	public static void main(String[] args) {
		
		ConstructorsDemo4 obj1 = new ConstructorsDemo4("TestUser", "Abc@123");
		obj1.login();
		
		ConstructorsDemo4 obj2 = new ConstructorsDemo4("Nagarjun", "Test@999");
		obj2.login();
		
		
	}

}
