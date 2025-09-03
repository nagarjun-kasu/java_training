package inheritance;

public class BaseTest {
	
	String username="Parentuser", password="parent@123";
	
	void setup() {
		System.out.println("setup method from parent class BaseTest");
	}
	
	void tearDown() {
		System.out.println("teardown method from parent class BaseTest");
	}

}
