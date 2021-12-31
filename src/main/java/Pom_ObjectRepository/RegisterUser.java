package Pom_ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUser  extends ParentClass {
	
	
	
	@FindBy(id = "firstname")
	@CacheLookup
	WebElement reg_firstname;
	
	@FindBy(id = "lastname")
	@CacheLookup
	WebElement reg_lastname;
	
	@FindBy(id = "userName")
	@CacheLookup
	WebElement reg_username;
	
	@FindBy(id = "password")
	@CacheLookup
	WebElement reg_password;
	
	@FindBy(xpath = "//div[@class='rc-anchor-center-container']/descendant::span[@id='recaptcha-anchor']/div")
	@CacheLookup
	WebElement reg_notarobot;
	
	@FindBy(id = "register")
	@CacheLookup
	WebElement reg_register;
	
	
	public void register_EnterDetails()
	{
		reg_firstname.sendKeys("Prabhat");
		reg_lastname.sendKeys("Tavag");
		
		reg_username.sendKeys("Prabhat_Tavag@yahoo.com");
		reg_password.sendKeys("Hero@123");
		
		reg_notarobot.click();
		
		
	}
	
	public void clickRegisterButton()
	{
		reg_register.click();
		
	}

	
	public RegisterUser () {
		
		PageFactory.initElements(driver, RegisterUser.this);
		
	}

	
	
	
	
}
