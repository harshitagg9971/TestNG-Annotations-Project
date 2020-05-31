package annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo 
{
	@Test
	public void verifyTitle()
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.demo.actitime.com");
		String expectedTitle = "Harshit";
		
		
		String actualTitle = driver.getTitle();
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualTitle , expectedTitle);
		System.out.println("Both the titles are same.");
		System.out.println("harshit");
		System.out.println("deepak");
		System.out.println("ankit");
		System.out.println("nishka");
		s.assertAll();
		System.out.println("harshit aggarwal");//will not be executed
	}
	
	@Test
	public void nextMethod()
	{
		System.out.println("next method working");
	}
}
