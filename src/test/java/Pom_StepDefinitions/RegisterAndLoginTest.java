package Pom_StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import Pom_ObjectRepository.HomePage;
import Pom_ObjectRepository.LoginPage;
import Pom_ObjectRepository.ParentClass;
import Pom_ObjectRepository.RegisterUser;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterAndLoginTest  extends  ParentClass {

    public 	RegisterUser ru ;
	public  HomePage hp ;
	
	public LoginPage lp ;
	
	@Before
	public void initialize()
	{
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		
		
	}
	
	@Given("^Access demoqa website Click on login$")
	public void access_demoqa_website_Click_on_login() 
	{
	  hp = new HomePage();
	  hp.clickLogin();
	  
	  
		
		
	}

	@When("^Click on New User button and enter all details$")
	public void click_on_New_User_button_and_enter_all_details() throws Throwable {
		hp = new HomePage(); 
		hp.newUser();
		
		ru = new RegisterUser();
		ru.register_EnterDetails();
	}

	@When("^Click on Register button$")
	public void click_on_Register_button()  {
	  
		ru = new RegisterUser();
		
		ru.clickRegisterButton();
		
	}

	@Then("^User should be registered sucessfully$")
	public void user_should_be_registered_sucessfully()  {
	  
	String ack_message = 	driver.switchTo().alert().getText();
	
	assertEquals("Alert Message is correct", ack_message, "User Register Successfully.");
	}

	
	
	@Given("^Access demoqa website and click on login button$")
	public void access_demoqa_website_and_click_on_login_button() 
	{
		
		hp = new HomePage();
		hp.clickLogin();
		
	    
	}

	@When("^Enter username and password$")
	public void enter_username_and_password()  {
	 
		lp = new LoginPage() ; 
		lp.userLogin();
		
	}

	@Then("^User should be able to access the website and verify title$")
	public void user_should_be_able_to_access_the_website_and_verify_title() {
	  
		lp = new LoginPage();
	String title = 	lp.displayTitle();
	
	
	
		
	}

	@Then("^perform logout$")
	public void perform_logout(){
	   
	}


	
	@After
	public void tearDown()
	{
		driver.manage().deleteAllCookies();
	}
}
