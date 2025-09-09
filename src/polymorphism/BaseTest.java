package polymorphism;

public class BaseTest {
	//overridden method
	protected void openBrowser() {
		System.out.println("Launch the application in chrome browser");
	}
	
	void enterText(String element, String value) {
		System.out.println("enterText method from BaseTest class. element: "+element+" --- value: "+value);
	}
	
	private void click() {
		System.out.println("click method from BaseTest class");
	}
	
	public final void enterText() {
		
	}
	
	public BaseTest() {
		
	}

}
