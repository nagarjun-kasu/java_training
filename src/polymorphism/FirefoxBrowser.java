package polymorphism;

public class FirefoxBrowser extends BaseTest {
	
	//overriding
	@Override
	public void openBrowser() {
		System.out.println("Launch the application in Firefox browser");
	}
	
	
	private void click() {
		System.out.println("click method from child class");
	}
	
	/*
	public void enterText() { //Cannot override the final method from BaseTest
		
	}
	*/

	
	public static void main(String[] args) {
		FirefoxBrowser obj=new FirefoxBrowser();
		obj.openBrowser();
		
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
	}

	
}

/*
Overriding Rules:
===================
1. Overridden method signature and overriding method signature should be same
2. The return type of overridden method and overriding method must be same at primitive level.
3. The access level can not more restrictive than overridden method

private < default < protected < public 

parent 				child
======				=====
default				default, protected, public
public 				public
protected			protected, public

4. A method declared as private can not be overridden
5. A method declared as final can not be overridden
6. A method declared as static can not be overridden.
7. Constructors can not be overridden


*/