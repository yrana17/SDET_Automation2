package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {

	

	@BeforeMethod
	public void method1()
	{
		System.out.println("Before Methods2:"+Thread.currentThread().getId());
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test21 Execution...."+Thread.currentThread().getId());
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test22 Execution...."+Thread.currentThread().getId());
	}
	
	
	@Test
	public void test3()
	{
		System.out.println("Test23 Execution...."+Thread.currentThread().getId());
	}
	
	
	@Test
	public void test4()
	{
		System.out.println("Test24 Execution...."+Thread.currentThread().getId());
	}

	@AfterMethod
	public void method2()
	{
		System.out.println("After Methods2:"+Thread.currentThread().getId());
	}
	
}
