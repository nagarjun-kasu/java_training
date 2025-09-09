package inheritance;

public class AccessModifiers {
	
	
	public AccessModifiers(){
		System.out.println("0-arg constructor from AccessModifiers class");
	}
	
	
	
	//dafault variables
	int age=30;
	String username="TestUser";
	
	static String name = "David";
	
	void display() {
		System.out.println("display method from access modifiers class");
	}
	
	static void message() {
		System.out.println("message method from access modifiers class");
	}
	
	//private members
	private String companyName = "Infosys";
	private static String password = "Test$35434";
	
	private void authorize() {
		System.out.println("authorize method from access modifiers class");
	}
	
	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		obj.authorize();
		System.out.println(obj.companyName+" --- "+AccessModifiers.password);
	}
	
	//protected members
	protected int id=123;
	protected void click() {
		System.out.println("protected click method");
	}
	
	//public members
	public String country="India";
	public static String message="Good morning";
	
	public void show() {
		System.out.println("public show method");
	}
	public static void getMessage() {
		System.out.println("public static getmessage method");
	}

}


/*
Access Modifier:
Access modifiers define the scope (visibility) of classes, variables, methods and constructors.


There are 4 access modifiers

1. default : (no keyword/modifier)
	o If no access modifier is specified, it is considered as default
	o Visible only within the same package, it is not possible to access default members in another package.

	
2. private:
	o The most restrictive modifier
	o can be accessed only within the same class. It is not possible to access private members in other classes, even in the same package.

3. protected: 
	o protected members can be accessible within the same package and child class of same/different package.
	
4. public:
	o least restrictive modifier
	o public members can be accessible in any of the classes through the project.
	



method:
[accessmodifier] returntype methodname([parameterslist]){

}

variable:
[accessmodifier] datatype variablename = value;

*/