package com.jenkinsmaven;

import org.testng.annotations.Test;

public class JenkinsMavenTest1Test {



	@Test
	public void firstTest(){
//		driver = new FirefoxDriver();
		System.out.println("first test");
		System.out.println("JenkinsMavenTest1");
	}
	
	@Test(priority = 1)
	public void secondTest(){
		System.out.println("second test");
	}
	
	
}
