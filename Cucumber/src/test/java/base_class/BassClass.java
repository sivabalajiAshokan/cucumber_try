package base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BassClass {
	
	
	public static WebDriver driver;
	
	
	public static WebDriver browserlaunch(String value) {
		
		if(value.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		}
		return driver;
	}
	
	public static void getur(String value) {
		driver.get(value);
	}
	
	public static void clickbutton(WebElement element) {
		element.click();
	}
	
	public static void inputvalue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void browserqiut() {

		driver.quit();
	}
}
