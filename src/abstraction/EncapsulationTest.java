package abstraction;

public class EncapsulationTest {
	
	public static void main(String[] args) {
		EncapsulationDemo obj=new EncapsulationDemo();
		obj.setUserName("testuser1@gmail.com");
		obj.setPassword("Abc@435$");
		
		String username = obj.getUserName();
		String password = obj.getPassword();
		
		System.out.println(username+" --- "+password);
		
	}

}
