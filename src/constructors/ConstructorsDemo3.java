package constructors;

public class ConstructorsDemo3 {
	
	//instance variables
	String username, password;
	
	ConstructorsDemo3(){
		username = "TestUser";
		password = "Abc$321";
	}
	
	void login() {
		System.out.println(username+" ---- "+password);
	}
	
	
	public static void main(String[] args) {
		ConstructorsDemo3 obj = new ConstructorsDemo3();
		obj.login();
		
		ConstructorsDemo3 obj2 = new ConstructorsDemo3();
	}

}

// limitation is for each object, the username and password values are same.
