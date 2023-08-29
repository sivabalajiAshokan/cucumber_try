package testrunner;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import base_class.BassClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



 @RunWith(Cucumber.class)
 
@CucumberOptions(features = "src//test//java//features",
glue = "step_definition",

plugin = {"pretty","json:target/cucumber-reports/Cucumber.json",
					"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports"}
		)

public class Test_Runner extends BassClass{

	
	
	public static WebDriver driver;

	@BeforeClass
	public static void set_up() {
		
		
		driver= browserlaunch("chrome");

	}
	
	@AfterClass
	public static void quit() {
		
		browserqiut();
	}
	
}
