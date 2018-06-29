package com.jenkinsmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsMavenTest1Main2 
{

//	public static WebDriver driver;
	
	@Test
	public void firstTest(){
//		driver = new FirefoxDriver();
		System.out.println("first test");
		System.out.println("JenkinsMavenTest1Main2");
	}
	
	@Test(priority = 1)
	public void secondTest(){
		System.out.println("second test");
	}
	
	
}
