package testing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A {

	
	
	@AfterMethod(alwaysRun=true)
	public void closebr()
	{
		System.out.println("Browser Close");
	}
	
	@Test(groups={"Smoke"})
	public void tcase2()
	{
		System.out.println("Smoke");
		
	}
	
	@Test(groups={"Smoke","P1","All"})
	public void tcase1()
	{
		System.out.println("Smoke, P1, All");
	}
	
	@BeforeMethod(alwaysRun=true)
	public  void brStart()
	{
		System.out.println("Browser Start");
	}
}
