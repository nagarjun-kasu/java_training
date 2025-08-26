package methods;

public class MethodsDemo1 {
	
	//instance method
	void login() {
		//instance area
		System.out.println("login instance method");
		
	}
	
	//static method
	static void search() {
		System.out.println("search static method");
		MethodsDemo1 obj=new MethodsDemo1();
		obj.login();
	}
	
	
	
	public static void main(String[] args) {
		//static area
		
		MethodsDemo1 obj = new MethodsDemo1();
		obj.login();
		
		MethodsDemo1.search();
		
	}

}

/*
Methods:
1. Code Re-usability
2. Readability and easy to understand.

1. Instance methods:

syntax:
[access_modifier] return_type method_name([parameters_list] [throws Exception]){
 --
 --
 -- statements
 ---

}

2. Static methods:

syntax:
[access_modifier] static return_type method_name([parameters_list] [throws Exception]){
--
--
--
--

}





*/