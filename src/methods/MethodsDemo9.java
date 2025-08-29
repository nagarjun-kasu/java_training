package methods;

public class MethodsDemo9 {
	
	String username;
	
	String login(String username) {
		System.out.println("login method");
		this.username=username;
		
		return this.username;
		
	}
	
	static void getInfo() {
		System.out.println("static getInfo method");

	}
	
	public static void main(String[] args) {
		
		MethodsDemo9 obj = new MethodsDemo9();
		String user = obj.login("TestUser@gmail.com");
		System.out.println(user);
		
		MethodsDemo9.getInfo();
		
	}

}
