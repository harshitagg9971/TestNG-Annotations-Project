package annotations;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
	@Test
	public void pooja()
	{
		Reporter.log("pooja", true);
	}
	
	@Test
	public void naimisha()
	{
		Reporter.log("naimisha", true);
	}
	
	@Test
	public void harshit()
	{
		Reporter.log("harshit", true);
	}
	
	@BeforeSuite
	public void start()
	{
		Reporter.log("Start", true);
	}
	
	@BeforeTest
	public void  beforeTest()
	{
		Reporter.log("Before Test", true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("before Class", true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("before Method", true);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("after Method", true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("after Class", true);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("after Suite", true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("after Test end", true);
	}
}
