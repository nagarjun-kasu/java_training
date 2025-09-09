package methods;

import inheritance.AccessModifiers;

public class AccessTest extends AccessModifiers{
	
	public AccessTest() {
		super();
	}
	
	public static void main(String[] args) {
		
		//AccessModifiers obj=new AccessModifiers();
		
		AccessTest ac = new AccessTest();
		ac.click();
		System.out.println(ac.id);
		
		
	}

}
