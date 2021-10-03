package testng;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExpectedExceptions {

	@Test(expectedExceptions = { IOException.class, NullPointerException.class })
	public void test1() throws IOException {
		System.out.println("Test1......");
		throw new IOException();

	}

	@Test(expectedExceptions = { Exception.class })
	public void test2() {

		System.out.println(5 / 0);

	}

	@Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = "Pass Message Test")
	public void test3() throws IOException {

		throw new IOException("Pass Message Test");

	}

	@Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = ".* Message .*")
	public void test4() throws IOException {

		throw new IOException("Pass Message Test");

	}
}
