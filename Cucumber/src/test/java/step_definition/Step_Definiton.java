package step_definition;

import org.openqa.selenium.WebDriver;

import addemplayee.Page_Object_Manager;

import base_class.BassClass;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

import testrunner.Test_Runner;

public class Step_Definiton extends BassClass{
	
	public static WebDriver driver = Test_Runner.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

@Given("^Get Url$")
public void get_Url() throws Throwable {
  
	getur("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
}

@Given("^Input UserName From Username Input Feield$")
public void input_UserName_From_Username_Input_Feield() throws Throwable {
   
	inputvalue(pom.lgin().getUsername(),"Admin");
}

@Given("^Input Password From Password Field$")
public void input_Password_From_Password_Field() throws Throwable {
   
	inputvalue(pom.lgin().getPassword(), "admin123");
}

@Given("^Click The Login Button$")
public void click_The_Login_Button() throws Throwable {
   
	clickbutton(pom.lgin().getLogin());
	
}

@Given("^Click The Pim Menu$")
public void click_The_Pim_Menu() throws Throwable {
  
	clickbutton(pom.getempl().getPimmenu());
}

@Given("^Add Emplayee Details Menu Click$")
public void add_Emplayee_Details_Menu_Click() throws Throwable {
   
	clickbutton(pom.getempl().getAddemplyee());
}

@Given("^Input The Value In Firstname$")
public void input_The_Value_In_Firstname() throws Throwable {
	inputvalue(pom.getempl().getFirstname(),"siva");
	
}

@Given("^Input The Middlename in Middlename field$")
public void input_The_Middlename_in_Middlename_field() throws Throwable {
  
	inputvalue(pom.getempl().getMiddlename(),"balaji");
}

@Given("^Input The Lastname In Lastname field$")
public void input_The_Lastname_In_Lastname_field() throws Throwable {
   
	inputvalue(pom.getempl().getLastname(),"A");
}

@Then("^Click The Save Button And Navigate To Main Menu$")
public void click_The_Save_Button_And_Navigate_To_Main_Menu() throws Throwable {
 
	clickbutton(pom.getempl().getSaveclick());
	
}


	

}
