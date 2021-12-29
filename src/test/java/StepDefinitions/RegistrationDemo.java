package StepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class RegistrationDemo {

    public static WebDriver driver;
	
	String url = "https://seleniumcamp.com/registration/form/";
	String driverpath = "F:\\Selenium Drivers\\Chrome Driver\\Chrome Driver 96\\chromedriver_win32\\chromedriver.exe" ;
	
	
	@Given("^User can access the registration form$")
	public void user_can_access_the_registration_form() throws Throwable {
		    System.setProperty("webdriver.chrome.driver", driverpath);
			
			driver = new ChromeDriver();
			
			driver.get(url);
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			

			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
			
	    
	}

	@When("^User enters all the details$")
	public void user_enters_all_the_details(DataTable userdetails) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		
		
		List<Map<String,String>>  lm = userdetails.asMaps(String.class, String.class);
		
		driver.findElement(By.id("first_name")).sendKeys(userdetails.get));
		
		
	}

	@Then("^User can register sucessfully$")
	public void user_can_register_sucessfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
