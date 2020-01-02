package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class GetScreenShot {
	
	public String screenShot(WebDriver driver, String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "\\screenshots\\" + fileName + ".png";
		File destination = new File(dest);	
		FileUtils.copyFile(source, destination);
		return dest;
	}
	
}
