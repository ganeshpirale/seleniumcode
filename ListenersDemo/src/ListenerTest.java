import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import org.apache.commons.io.FileUtils;



public class ListenerTest implements ITestListener {

	WebDriver driver;
	String RESULT_FILENAME = "D:/Ganesh/screen.jpg";
	
	@Override
	public void onFinish(ITestContext arg0) {
		 
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		 
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		 
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("***** Error Test Case : "+arg0.getName());
    	String methodName=arg0.getName().toString().trim();
    	try {
			takeScreenShot(methodName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		   
	}

	public  void takeScreenShot(String methodName) throws InterruptedException {
    	//get the driver
    	driver=TestCases.getDriver();
    	Thread.sleep(2000);
    	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with test method name 
            try {
				FileUtils.copyFile(scrFile, new File(RESULT_FILENAME+methodName+".png"));
				System.out.println("***Placed screen shot in "+RESULT_FILENAME+" ***");
			} catch (IOException e) {
				e.printStackTrace();
			}
    }
	@Override
	public void onTestSkipped(ITestResult arg0) {
		 
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		 
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		 
		
	}

	
}