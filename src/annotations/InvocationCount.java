package annotations;

import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test(invocationCount = 2)
	public void harshit()
	{
		System.out.println("Harshit");
	}
	
	@Test(invocationCount = -3)//if we put negative value it will not execute 
	public void nishant()
	{
		System.out.println("Nishant");
	}
	
	@Test(invocationCount = 3)
	public void amit()
	{
		System.out.println("Amit");
	}
}
