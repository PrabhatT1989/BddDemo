package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TagsDemoTest {
	
public static WebDriver driver;
	
	String url = "https://opensource-demo.orangehrmlive.com/";
	String driverpath = "F:\\Selenium Drivers\\Chrome Driver\\Chrome Driver 96\\chromedriver_win32\\chromedriver.exe" ;
	
	
	

@Given("^Access the website$")
public void access_the_website() throws Throwable {
	
	
	System.setProperty("webdriver.chrome.driver", driverpath);
	
	driver = new ChromeDriver();
	
	driver.get(url);
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	

	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
	 
}

@When("^Enter credentials$")
public void enter_credentials() throws Throwable {
   
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
	
	
}

@When("^click on several links$")
public void click_on_several_links() throws Throwable {
   
	
driver.findElement(By.id("MP_link")).click();
	
	
	
	
}

@Then("^Logout of the application$")
public void logout_of_the_application() throws Throwable {
    
	driver.findElement(By.id("welcome")).click();
	driver.findElement(By.linkText("Logout")).click();
	driver.manage().deleteAllCookies();
		
}



@Given("^Access forgot password page$")
public void access_forgot_password_page() throws Throwable {
	
driver.findElement(By.linkText("Forgot your password?")).click();	
	
 driver.findElement(By.id("securityAuthentication_userName")).sendKeys("Prabhat");  
}



@When("^Enter username and click on Reset button$")
public void enter_username_and_click_on_Reset_button() throws Throwable {
	 driver.findElement(By.id("securityAuthentication_userName")).sendKeys("Prabhat.tavag@gmail.com"); 
driver.findElement(By.id("btnSearchValues")).click();


}

@Then("^System should display acknowledgement message$")
public void system_should_display_acknowledgement_message() throws Throwable {
	
String str= 	driver.findElement(By.xpath("//form[@id='resetPasswordForm']/preceding-sibling::div")).getText();


assertEquals("ACk Msg :: ", str, "Please enter your username to identify your account to reset your password.");


}








}
