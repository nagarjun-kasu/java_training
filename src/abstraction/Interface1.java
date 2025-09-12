package abstraction;

public interface Interface1 {
	int age=30; // public static final int age=30;
	
	static String name="nagarjun";
	
	void click(); // public abstract void click(); //all the methods are public and abstract
	
	public abstract void sendKeys();
	
	default void display() {
		System.out.println("display method from interface1");
	}
	
	static void getText() {
		System.out.println("getText method from interface1");
	}
	
	private void get() {
		System.out.println("get method from interface1");
	}
	
	

}
