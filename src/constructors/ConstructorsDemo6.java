package constructors;

public class ConstructorsDemo6 {
	
	ConstructorsDemo6(){
		System.out.println("user defined 0-arg constructor");
	}
	
	ConstructorsDemo6(int count){
		//this();
		this("TestUser", "abc@$23232");
		System.out.println("1-arg constructor");
		
	}
	
	ConstructorsDemo6(String username, String password){
		System.out.println(username+" --- "+password);
		
	}
	
	
	
	
	public static void main(String[] args) {
		//ConstructorsDemo6 obj= new ConstructorsDemo6();
		
		ConstructorsDemo6 obj2= new ConstructorsDemo6(100);
	}

}

//Note: Constructor call must be the first statement inside another constructor. we can call only constructor inside the constructor using this keyword.