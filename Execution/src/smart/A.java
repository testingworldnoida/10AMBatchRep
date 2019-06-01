package smart;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class A {

	
	
	@Test
	public void rk()
	{
		System.out.println("hello rakesh");
	}
	
	
	@BeforeClass
	public static void tg()
	{
		System.out.println("hello tushar");
	}
	
	@BeforeClass
	public static void t2g()
	{
		System.out.println("hello tushar");
	}
	
	
	
	@Test

	public void asmt()
	{
		System.out.println("hello smart");
	}
	
	@AfterClass
	public static void sk()
	{
		System.out.println("hello sanjay");
	}
}
