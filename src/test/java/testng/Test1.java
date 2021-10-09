package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

	
	@BeforeMethod
	public void method1()
	{
		System.out.println("Before Methods1:"+Thread.currentThread().getId());
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test1 Execution...."+Thread.currentThread().getId());
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 Execution...."+Thread.currentThread().getId());
	}
	
	
	@Test
	public void test3()
	{
		System.out.println("Test3 Execution...."+Thread.currentThread().getId());
	}
	
	
	@Test
	public void test4()
	{
		System.out.println("Test4 Execution...."+Thread.currentThread().getId());
	}

	@AfterMethod
	public void method2()
	{
		System.out.println("After Methods1:"+Thread.currentThread().getId());
	}
	
}
