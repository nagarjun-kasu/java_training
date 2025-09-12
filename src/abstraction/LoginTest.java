package abstraction;

public class LoginTest {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get();
		driver.getTitle();
		
		WebDriver ff = new FirefoxDriver();
		ff.get();
		ff.getTitle();
		
	}

}
