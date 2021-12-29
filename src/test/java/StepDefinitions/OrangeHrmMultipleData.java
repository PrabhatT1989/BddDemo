package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class OrangeHrmMultipleData {

	
	

	public static WebDriver driver;
	
	String url = "https://opensource-demo.orangehrmlive.com/";
	String driverpath = "F:\\Selenium Drivers\\Chrome Driver\\Chrome Driver 96\\chromedriver_win32\\chromedriver.exe" ;
	

	
	@Given("^Access login screen$")
	public void access_login_screen() throws Throwable {
	  
		 System.setProperty("webdriver.chrome.driver", driverpath);
			
			driver = new ChromeDriver();
			
			driver.get(url);
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			

			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
			
		
		
	}

	@When("^enter credentials \"([^\"]*)\"  \"([^\"]*)\" and click on login button$")
	public void enter_credentials_and_click_on_login_button(String username, String password) throws Throwable {
	   driver.findElement(By.id("txtUsername")).sendKeys(username);
	   driver.findElement(By.id("txtPassword")).sendKeys(password);
	   driver.findElement(By.id("btnLogin")).click();
	   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
	   
	   String currenturl = driver.getCurrentUrl();
	   
	   
	 
	   
	   assertEquals("URL is same", currenturl, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	   
	   driver.findElement(By.id("welcome")).click();
	   
	   driver.findElement(By.linkText("Logout")).click();
	   
	   
	   
	  
	   
	   
	   
	   
	}

	@Then("^Login functionality should work appropriately$")
	public void login_functionality_should_work_appropriately() throws Throwable {
	 
		driver.manage().deleteAllCookies();
		
	}
	
}
