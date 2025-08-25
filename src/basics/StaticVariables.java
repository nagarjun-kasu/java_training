package basics;

public class StaticVariables {
	
	//static variable
	public static int id=12345;
	
	static double d;
	static boolean bl;
	
	//static method
	static void show() {
		//static area
		
		//int age=30;
		System.out.println("show method");
		System.out.println(StaticVariables.id);
		System.out.println(StaticVariables.d);
		System.out.println(StaticVariables.bl);
	}
	
	//instance method
	void details() {
		//instance area
		System.out.println("instance method details");
		System.out.println(StaticVariables.id);
		System.out.println(StaticVariables.d);
		System.out.println(StaticVariables.bl);
		
		
	}
	
	public static void main(String[] args) {
		//static area
		
		System.out.println(StaticVariables.id); //12345
		System.out.println(StaticVariables.d); //0.0
		System.out.println(StaticVariables.bl);//false
		
		StaticVariables.show();
		
		StaticVariables obj=new StaticVariables();
		obj.details();
		
	}

}

/*
Static variables:
The variables declared inside the class but ourside of a method or constructor or block with static keyword are called static variables.
Access modifiers can be given to static variables
Static variables have default values. JVM assigns default value to static variable when there is no value initialized.
Static variable are visible for all the methods.
Memory will be allocated at the time of class file loading.




*/
