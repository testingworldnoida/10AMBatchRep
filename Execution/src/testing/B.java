package testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class B {


	@AfterMethod(alwaysRun=true)
	public void closebr()
	{
		System.out.println("Browser Close");
	}
	
	@Test(groups={"P1","All"})
	public void tcase2()
	{
		System.out.println("P1 All");
		
	}
	
	@Test(dependsOnMethods="tcase2")
	public void tcase1()
	{
		System.out.println("TC _001");
	}
	
	@BeforeMethod(alwaysRun=true)
	public  void brStart()
	{
		System.out.println("Browser Start");
	}

	
}
