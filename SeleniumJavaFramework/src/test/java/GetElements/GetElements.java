package GetElements;

import org.apache.poi.ss.formula.functions.TimeFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetElements {
	WebDriver driver;
	//By homePageName = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Buy Now'])[1]/following::strong[1]");
	//tinyUpload Page
	By startLink = By.linkText("Start");
	By fileDescriptorTextField = By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/textarea");
	
	
	//Admin Page
	By userNameTextField = By.name("email");
	By passwordTextField = By.name("password");
	By checkBox = By.xpath("/html/body/div[2]/form[1]/div[1]/div/div[1]/label/div/ins");
	By loginButton = By.xpath("/html/body/div[2]/form[1]/button");
	
	public GetElements(WebDriver driver){
		this.driver = driver;
	}

	public void homePageTextField(String message){
		driver.findElement(fileDescriptorTextField).sendKeys(message);
	}
	
	public String startLinkText() {
		String value = driver.findElement(startLink).getText();
		return value;
	}
	
	public void UsernameField(String Username){
		driver.findElement(userNameTextField).sendKeys(Username);
	}

	public void PasswordField(String Password) {
		driver.findElement(passwordTextField).sendKeys(Password);
	}
	
	public void checkBoxButton(){
		driver.findElement(checkBox).click();
	}
	
	public void LoginButton(){
		driver.findElement(loginButton).click();
	}
	
}
