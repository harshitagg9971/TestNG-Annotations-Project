package annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pom.POMActitimeCreateCustomer;
import pom.POMActitimeHomePage;
import pom.POMActitimeLoginPage;
import pom.POMActitimeTaskPage;

public class TESTActitimeWorkingWithSameBrowser 
{	
	public WebDriver driver;
	
	@Test
	public void a_login()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com");
		POMActitimeLoginPage login = new POMActitimeLoginPage(driver);
		login.loginMethod();
	}
	
	@Test
	public void b_createCustomer() throws InterruptedException
	{
		POMActitimeHomePage tab = new POMActitimeHomePage(driver);
		tab.taskTabMethod();
		
		POMActitimeTaskPage customer = new POMActitimeTaskPage(driver);
		customer.creatingCustomerMethod();
		
		POMActitimeCreateCustomer click1 =  new POMActitimeCreateCustomer(driver);
		click1.createCustomerMethod();
	}
	
	@Test
	public void c_deleteCustomer() throws InterruptedException
	{
		POMActitimeCreateCustomer click1 =  new POMActitimeCreateCustomer(driver);
		click1.deleteCustomerMethod();
	}
}
