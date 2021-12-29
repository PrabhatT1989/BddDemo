package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksDemoTest {

	
	public static WebDriver driver;
	
	String url = "https://www.facebook.com/";
	String driverpath = "F:\\Selenium Drivers\\Chrome Driver\\Chrome Driver 96\\chromedriver_win32\\chromedriver.exe" ;
	
	
	
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
	
	@Given("^enter credentials$")
	public void enter_credentials() throws Throwable {
	   
		driver.findElement(By.id("email")).sendKeys("Prabhat_Tavag@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("7710977");
		
		
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		
		
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_d')]")).click();
	    
	}

	@Then("^user should be logged in$")
	public void user_should_be_logged_in() throws Throwable
	{
		String title =driver.getTitle();
		assertEquals("Title checking", title, "Prabhat Tavag | Facebook");
	    
		
		
	}
	
	
	@Given("^Access forgotten password link$")
	public void access_forgotten_password_link() throws Throwable {
	    driver.findElement(By.linkText("Forgotten password?")).click();
	    
	}

	@When("^Enter emailid and click on Search$")
	public void enter_emailid_and_click_on_Search() throws Throwable {
		driver.findElement(By.id("identify_email")).sendKeys("Prabhat_Tavag@yahoo.com");; 
		
		driver.findElement(By.id("did_submit")).click(); 
	}

	@Then("^Click on Not you button$")
	public void click_on_Not_you_button() throws Throwable {
	   
		driver.findElement(By.xpath("//div[@class='clearfix']/div/a")).click();
		
	}

	
	
	@After
	public void tearDown()
	{
		
		driver.manage().deleteAllCookies();
	}
	
	
	
	
	
	
	
}
