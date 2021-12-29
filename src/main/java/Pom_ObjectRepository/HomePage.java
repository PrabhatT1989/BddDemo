package Pom_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends ParentClass {
	
	
	
	

	HomePage() 
	{
		PageFactory.initElements(driver, HomePage.class);
	}
	
	
	
	@FindBy(id="login")
	WebElement  loginbutton;
	
	
	@FindBy(id="newUser")
	WebElement  newuserbutton;
	
	
	
	public void newUser()
	{
		newuserbutton.click();
	}
	
	
	public void clickLogin()
	{
		loginbutton.click();
	}
	
  }
