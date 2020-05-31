package annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.POMActitimeCreateCustomer;
import pom.POMActitimeHomePage;
import pom.POMActitimeLoginPage;
import pom.POMActitimeTaskPage;

public class TESTActitimePriorityInvocation 
{
	@Test(priority = 1)
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		POMActitimeLoginPage login = new POMActitimeLoginPage(driver);
		login.loginMethod();
	}
	
	@Test(priority = 2,invocationCount = 2)
	public void createCustomer() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		POMActitimeLoginPage login = new POMActitimeLoginPage(driver);
		login.loginMethod();
		
		POMActitimeHomePage tab = new POMActitimeHomePage(driver);
		tab.taskTabMethod();
		
		POMActitimeTaskPage customer = new POMActitimeTaskPage(driver);
		customer.creatingCustomerMethod();
		
		POMActitimeCreateCustomer click1 =  new POMActitimeCreateCustomer(driver);
		click1.createCustomerMethod();
	}
}
