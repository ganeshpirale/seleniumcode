package com.jenkinsmaven;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsMavenTestTest {
 

		@Test
	public void firstTest() throws InterruptedException {
		
		System.out.println("launch firefox");
		Thread.sleep(3000);
//		driver = new FirefoxDriver();
		System.out.println("JenkinsMavenTestTest");
	}

	@Test(priority = 1)
	public void secondTest() {
		System.out.println("second test");
	}
	
	
}
