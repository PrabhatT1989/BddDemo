package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundDemoFirst {
	
public static WebDriver driver;
	
	String url = "https://phptravels.com/";
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
	
	@Given("^Access phptravels website$")
	public void access_phptravels_website() throws Throwable {
	    driver.navigate().refresh();
	    
	}

	@When("^select a product and click on buy now option$")
	public void select_a_product_and_click_on_buy_now_option() throws Throwable {
	    driver.findElement(By.xpath("//a[contains(text(),'Buy Now')]")).click();
	    driver.findElement(By.xpath("//a[@id='1']")).click();
	    driver.findElement(By.id("order_button")).click();
	    
	}

	@Then("^enter details$")
	public void enter_details() throws Throwable {
	   
		
		 driver.findElement(By.id("order_button")).sendKeys("Prabhat");;
		 driver.findElement(By.id("last_name")).sendKeys("Tavag");;
		 driver.findElement(By.id("bizname")).sendKeys("Lokhandwala");;
		 
		 driver.findElement(By.id("email")).sendKeys("Prabhat");;
		 driver.findElement(By.id("mobile")).sendKeys("9869");;
		 
	}

	@Given("^Acess website$")
	public void acess_website() throws Throwable {
	  
		driver.findElement(By.xpath("//div[@class='rc-anchor-center-item rc-anchor-checkbox-holder']/span/div")).click();
	}

	@When("^click on Confirm Order button$")
	public void click_on_Confirm_Order_button() throws Throwable {
		 driver.findElement(By.id("button")).click();  
	}

	@Then("^System should redirect the user to payment gateway page$")
	public void system_should_redirect_the_user_to_payment_gateway_page() throws Throwable {
	   
		String paymentgatewaytitle = driver.getTitle();
		System.out.println("Title of payment gateway");
	}
}
