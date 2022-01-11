package DemoPrograms;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo {

	public static WebDriver driver ;
	public String driverpath = "F:\\Selenium Drivers\\Chrome Driver\\Chrome Driver 96\\chromedriver_win32" ;
	
	public String url = "https://www.toolsqa.com/selenium-webdriver/selenium-testing/"; 
	
	@Test
	public void switchWindowDemo()
	{
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println("hello");
		System.out.println("hello world");
		System.out.println("basic demo");
	}

}
