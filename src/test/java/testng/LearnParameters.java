package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters {

	
	@Test
	@Parameters({"uid","pswd"})
	public void test1(String uid,String pswd)
	{
		System.out.println(uid);
		System.out.println(pswd);
	}
	
	
}
