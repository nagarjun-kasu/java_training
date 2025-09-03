package inheritance;

public class Login extends BaseTest{
	
	int age=30;
	String name="David";
	
	void loginToApp() {
		System.out.println("login to application method");
	}
	
	void search() {
		System.out.println("search method from child class Login");
	}
	
	public static void main(String[] args) {
		
		//If we create object for child class and hold that object in child class reference, then we can access all parent and child class instance members.
		Login l = new Login();
		l.setup();
		l.tearDown();
		l.loginToApp();
		l.search();
		System.out.println(l.username+" -- "+l.password+"--"+l.age+"-- "+l.name);
		
		//If we create object for parent class and hold that object in parent class reference, then we can access only parent class instance members
		BaseTest b = new BaseTest();
		b.setup();
		b.tearDown();
		System.out.println(b.username+" --- "+b.password);
		
		
		//If we create object of child class and hold that object in parent class reference, then we can access only parent class instance members
		BaseTest bt = new Login();
		bt.setup();
		bt.tearDown();
		System.out.println(bt.username+" --- "+bt.password);
		
		//If we cereate object for parent class and hold that object in child class reference, then compiler throws an exception "Type mismatch: cannot convert from BaseTest to Login"
		//Login ch = new BaseTest(); //Type mismatch: cannot convert from BaseTest to Login
		
		
		
		
		
		
	}

}
