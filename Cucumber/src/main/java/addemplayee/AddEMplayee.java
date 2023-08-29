package addemplayee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEMplayee {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//div[@id='app']/div/div/aside/nav/div[2]/ul/li[2]/a")
	private WebElement pimmenu;

	@FindBy(xpath = "//header[@class='oxd-topbar']/div[2]/nav/ul/li[3]")
	private WebElement addemplyee;
	
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@name='middleName']")
	private WebElement middlename;
	
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastname;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveclick;

	public WebElement getPimmenu() {
		return pimmenu;
	}

	public WebElement getAddemplyee() {
		return addemplyee;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getMiddlename() {
		return middlename;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getSaveclick() {
		return saveclick;
	}
	
	public AddEMplayee(WebDriver driver1) {
		
		driver =driver1;
		PageFactory.initElements(driver, this);
	}
}
