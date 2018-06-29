package com.jenkinsmaven.com.jenkinsmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
/* extends TestCase */
{
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	/*
	 * public AppTest( String testName ) { super( testName ); }
	 * 
	 *//**
		 * @return the suite of tests being tested
		 */
	/*
	 * public static Test suite() { return new TestSuite( AppTest.class ); }
	 * 
	 *//**
		 * Rigourous Test :-)
		 *//*
		 * public void testApp() { assertTrue( true ); }
		 */

	public static WebDriver driver;

//	@Test
	public void firstTest() throws InterruptedException {
		
		System.out.println("launch firefox");
		Thread.sleep(3000);
		driver = new FirefoxDriver();
		System.out.println("first test");
	}

//	@Test(priority = 1)
	public void secondTest() {
		System.out.println("second test");
	}
}
