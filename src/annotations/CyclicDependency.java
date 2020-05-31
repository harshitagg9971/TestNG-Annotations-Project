package annotations;

import org.testng.annotations.Test;

public class CyclicDependency 
{
	@Test(dependsOnMethods = "nishant")
	public void harshit()
	{
		System.out.println("harshit");
	}
	
	@Test(dependsOnMethods = "harshit")
	public void nishant()
	{
		System.out.println("nishant");
	}
}
