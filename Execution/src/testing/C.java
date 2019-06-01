package testing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C {

	
	
	@AfterMethod
	public void closebr()
	{
		System.out.println("Browser Close");
	}
	
	@Test
	public void tcase2()
	{
		System.out.println("TC _002");
		
	}
	
	@Test(dependsOnMethods="tcase2")
	public void tcase1()
	{
		System.out.println("TC _001");
	}
	
	@BeforeMethod
	public  void brStart()
	{
		System.out.println("Browser Start");
	}
}
