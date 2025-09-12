package abstraction;

public class InterfaceTest implements Interface1,Interface2{
	int count=100;
	
	@Override
	public void click() {
		System.out.println("click method implementation");
		
	}

	@Override
	public void sendKeys() {
		
		System.out.println("sendkeys method implementation");
	}
	
	public void getElement() {
		System.out.println("getElement method in class");
	}

	@Override
	public void get() {
		System.out.println("get method in class");
		
	}

	@Override
	public void manage() {
		System.out.println("manage method");
		
	}

	@Override
	public void maximize() {
		System.out.println("maximize method");
		
	}
	
	public static void main(String[] args) {
		InterfaceTest obj=new InterfaceTest();
		System.out.println(obj.count);
		obj.display();
		obj.click();
		obj.sendKeys();
		obj.getElement();
		obj.get();
		obj.manage();
		obj.maximize();
		
		
		Interface1 in1 = new InterfaceTest();
		in1.click();
		in1.sendKeys();
		in1.display();
		Interface1.getText();
		System.out.println(Interface1.name);
		
		
		Interface2 in2 = new InterfaceTest();
		in2.get();
		in2.manage();
		in2.maximize();
		in2.click();
		
		
		
		
		
		
	}

}


/*

class extends class

class implements interface

class implements interface1, interface2,...

*/