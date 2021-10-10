package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before("@InvalidCredLogin,@ValidCredLogin")
	public void before1()
	{
		System.out.println("Executed before each scenario");
	}
	
	
	@After("@InvalidCredLogin,@ValidCredLogin")
	public void after1()
	{
		System.out.println("Executed after each scenario");
	}
	
	
	
}
