package inheritance;

public class Parent1 {
	
	//instance variables
	String username="ParentUser1", password="parent@123";
	
	static int age = 30;
	
	static void display() {
		System.out.println("static display method");
	}
	
	void method1() {
		System.out.println("parent class method1");
	}
	
	void method2() {
		System.out.println("parent class method2");
	}
	

}
