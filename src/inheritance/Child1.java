package inheritance;

public class Child1 extends Parent1{
	
	String username="childuser1", password="child@123";
	
	void method3() {
		System.out.println("child class method3");
	}
	
	void method4() {
		System.out.println("child class method4");
	}
	
	void method5(String username, String password) {
		System.out.println(username+" ---- "+password);
		System.out.println(this.username+" ---- "+this.password);
		System.out.println(super.username+" --- "+super.password);
		
	}
	
	public static void main(String[] args) {
		
		Child1 obj =new Child1();
		
		System.out.println(obj.username+" --- "+obj.password);
		obj.method1();
		obj.method2();
		
		obj.method3();
		obj.method4();
		
		obj.method5("localuser1", "localpassword@123");
		
		
	}
	

}

//Super keyword can be used access parent class instance members. it can be used in instance area only.
