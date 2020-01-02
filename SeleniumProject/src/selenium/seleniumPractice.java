package selenium;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumPractice extends GoogleSearch{
	private static WebDriver driver;
	
	public static void main(String[] args) {
		Test_Case_1();
	}
	
	public static void Test_Case_1() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		seleniumPractice GoogleSearch = new seleniumPractice();
		GoogleSearch.searchTextField(driver).sendKeys("search automation");
		GoogleSearch.searchButton(driver).sendKeys(Keys.RETURN);
		System.out.println("Automation Successfully");
	}
	
}