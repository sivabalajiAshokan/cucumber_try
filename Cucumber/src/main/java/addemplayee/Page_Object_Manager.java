package addemplayee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import login.Log_in;

public class Page_Object_Manager {

	public static  WebDriver driver;
	
private	AddEMplayee ae;

private Log_in li;
	
public AddEMplayee getempl() {
	
	ae = new AddEMplayee(driver) ;
	
	return ae;
}
	
public Log_in lgin() {
	
	li =new Log_in(driver);
	
	return li;
}
public Page_Object_Manager(WebDriver si) {
	
	driver = si;
	PageFactory.initElements(driver, this);
}

}
