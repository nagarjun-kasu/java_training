package basics;

public class InstanceVariables {
	
	//instance variable
	public int id=123;
	
	int a; //0
	double d;//0.0
	boolean bl;//false
	
	//instance method
	void display() {
		//instance area
		System.out.println(id);
		System.out.println(a);
		System.out.println(d);
		System.out.println(bl);
	}
	
	public static void main(String[] args) {
		//static area
		
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.id); //123
		System.out.println(obj.a); //0
		System.out.println(obj.d); //0.0
		System.out.println(obj.bl);// false
		
		obj.display();
		
		
	}

}

/*
Instance Variables:
The variables declared inside the class and outside of a method or constructor or block are called instance variables.
Access modifiers can be given to instance variables
Instance variables are visible in all methods
Memory is allocated when the object is created for instance members.
Instance variables have default values. JVM assigns default value to instance variable when there is no value initialized.

Object Creation:
1. Named object
syntax:
classname obj_reference = new classname();
ex: InstanceVariables obj = new InstanceVariables();

2. Nameless object
new classname();

ex: new InstanceVariables();


2 types of methods:
1. Instance methods: the method defined without static keyword.
syntax:
[access_modifier] return_type method_name([parameters_list]){
	--
	--  instance area
	--

}

ex: void login(){

}


2. Static methods: The method defined with static keyword.
[access_modifier] static return_type method_name([parameters_list]){
	--
	--
	-- static area
	--

}


Accessing instance variables/methods:
		instance variables/methods
		  
			directly access
		instance_area


*/