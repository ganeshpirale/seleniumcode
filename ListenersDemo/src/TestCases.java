import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenerTest.class)
public class TestCases {

	 static WebDriver driver = new FirefoxDriver();

	
	String RESULT_FILENAME = "D:/Ganesh/screen.jpg";
//	String RESULT_FILENAME;
	
	@Test 
	public void login() throws IOException, InterruptedException{
		
//		Thread.sleep(2000);
//		System.out.println("Driver in TestCases:" +driver);
		driver.get("http://demo.guru99.com/V4/");	
		driver.manage().window().maximize();
	    driver.findElement(By.name("uid")).sendKeys("mngr137336");							
	    driver.findElement(By.name("password")).sendKeys("mYrAbUh");							
	    driver.findElement(By.name("btnLogin")).click();	
	    
	
	}
	
	@Test 
	public void TestToFail() throws IOException, InterruptedException{
		System.out.println("This method is to test failed test case");
		System.out.println("Taking screenshot");
		
//	    Thread.sleep(4000);
//	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	    FileUtils.copyFile(scrFile, new File(RESULT_FILENAME));
		
//		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		    FileUtils.copyFile(scrFile, new File(RESULT_FILENAME));
		 
		Assert.assertTrue(false);
		System.out.println("After test failure in assert");
		    
		    
	}

	public static  WebDriver getDriver() {
		System.out.println("Driver in Method: " +driver);
		return driver;
	}
}
