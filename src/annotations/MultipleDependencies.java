package annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleDependencies 
{
	@Test
	public void login()
	{
		Assert.fail();
		System.out.println("Login successful");
	}
	
	@Test (dependsOnMethods = "login")
	public void createCustomer() 
	{
		System.out.println("Creation successful");
	}
	
	@Test(dependsOnMethods = {"createCustomer","login"})
	public void deleleCustomer()
	{
		System.out.println("Deletion successful");
	}
	
	@Test
	public void harshit()
	{
	System.out.println("Harshit Aggarwal");
	}
}
