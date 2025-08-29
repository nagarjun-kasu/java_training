package methods;

public class MethodsDemo11 {
	
	void login(Dashboard db) {
		System.out.println(db.id);
		System.out.println(db.companyName);
		db.getDetails();
	}
	
	
	public static void main(String[] args) {
		/*
		 * MethodsDemo11 obj=new MethodsDemo11();
		 *  Dashboard dbObj=new Dashboard();
		 * obj.login(dbObj);
		 */
		
		new MethodsDemo11().login(new Dashboard());
		
		
	}

}

/*

Reusable.java
void click(WebDriver driver, By element){

driver.findElement(element).click();


}


*/