package Pom_ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends ParentClass{

	
	
	
	@FindBy(id="userName")
	@CacheLookup
	WebElement username;
	
	@FindBy(id= "password")
	@CacheLookup
	WebElement password ; 
	
    @FindBy(id= "login")
    @CacheLookup
	WebElement loginbutton ;


    LoginPage()
    {
	   PageFactory.initElements(driver, this);
    }

	public void userLogin()
	{
		username.sendKeys("Prabhat_Tavag@yahoo.com");
		password.sendKeys("Vashi@123");
		loginbutton.click();
		
	}
	
	
	
	
}
