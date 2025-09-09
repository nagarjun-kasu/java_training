package polymorphism;

public class MethodOverloading {
	
	//method to add two numbers and return sum
	int add(int a, int b) {
		return a+b;
	}
	
	double add(int a, double b) {
		return a+b;
	}
	

	//method to add three numbers and return sum
	int add(int a,int b, int c) {
		return a+b+c;
	}
	
	//method to add two double numbers and return sum
	double add(double a, double b) {
		return a+b;
	}
	
	
	
	
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		int sumOfTwoInt = obj.add(10, 20);
		System.out.println(sumOfTwoInt);
		
		double sumOfDouble = obj.add(10, 10.75);
		System.out.println(sumOfDouble);
		
		System.out.println(obj.add(10, 20, 30));
	}
	
}
/*
Method signature should be different
*/
/*
class WaitHelper{
	
	
		void waitForElement(WebDriver driver, WebElement element) {
			
		}
		
		void waitForElement(WebDriver driver, WebElement element, int timeout) {
			
		}
		
		static void click(WebElement element) {
			element.click();
		}
		
		static void click() {
			
		}
		static void click(WebDriver driver, By element) {
			
		}
	
}
*/