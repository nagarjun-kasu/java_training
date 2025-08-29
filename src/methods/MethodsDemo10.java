package methods;

public class MethodsDemo10 {
	
	//instance method
	Dashboard login(){
		System.out.println("login method");
		Dashboard db=new Dashboard();
		return db;
	}
	
	
	public static void main(String[] args) {
		MethodsDemo10 obj = new MethodsDemo10();
		Dashboard d = obj.login();
		System.out.println(d.id);
		System.out.println(d.companyName);
		
		d.getDetails();
		
		
	}

}
