package basics;

import inheritance.AccessModifiers;

public class PublicExample {
	
	
	public static void main(String[] args) {
		
		
		AccessModifiers obj = new AccessModifiers();
		System.out.println(obj.country);
		obj.show();
		
		System.out.println(AccessModifiers.message);
		AccessModifiers.getMessage();
		
	}

}
