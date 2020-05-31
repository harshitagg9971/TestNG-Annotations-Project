package annotations;

import org.testng.annotations.Test;

public class PriorityInvocation 
{
	@Test(invocationCount = 0,priority = 1)
	public void harshit()
	{
		System.out.print("Harshit ");
	}
	
	@Test(invocationCount = 2,priority = 2)
	public void nishant()
	{
		System.out.print("Nishant ");
	}
	
	@Test(invocationCount = 3,priority = -3)
	public void amit()
	{
		System.out.print("Amit ");
	}
}
