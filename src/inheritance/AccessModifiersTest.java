package inheritance;

public class AccessModifiersTest {
	
	public static void main(String[] args) {
		
		AccessModifiers obj = new AccessModifiers();
		obj.display();
		
		System.out.println(obj.age+" --- "+obj.username);
		
		AccessModifiers.message();
		System.out.println(AccessModifiers.name);
		
		//accessing protected members
		obj.click();
		System.out.println(obj.id);
	}

}
