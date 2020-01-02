package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import GetElements.GetElements;

public class WaitTime extends GetElements{
	private static WaitTime wTime;
	WebDriver driver;
	
	public WaitTime(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	//GetElements elements = new GetElements(driver);
	public void threadSleep(int milliseconds) throws InterruptedException{
		Thread.sleep(milliseconds);
	}
	
	public void implicitWait(int seconds){
		try {
			wTime = new WaitTime(driver);
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage() + e.getCause());
		}
	}
	
}
