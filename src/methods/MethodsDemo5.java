package methods;

public class MethodsDemo5 {
	
	void login() {
		System.out.println("login method");
	}
	 
	void searchProduct() {
		System.out.println("search product method");
	}
	
	void addToCart() {
		System.out.println("add to cart method");
	}
	void makePayment() {
		System.out.println("make payment method");
	}
	
	//instance method
	//template method
	void purchase() {
		//instance area
		login();
		searchProduct();
		addToCart();
		makePayment();
	}
	
	public static void main(String[] args) {
		MethodsDemo5 obj=new MethodsDemo5();
		obj.purchase();
		
	}

}
