package Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Account_Page {
	
	public WebDriver driver;
	
	By myAccount = By.xpath("//span[@class=\"caret\"]");
	By Login = By.xpath("//*[text()='Login']");
	By EmailAddress = By.xpath("//input[@name=\"email\"]");
	By Password = By.xpath("//input[@name=\"password\"]");
	By LoginButton = By.xpath("//input[@type=\"submit\"]");
	By currency = By.xpath("(//button[@data-toggle=\"dropdown\"])[1]");
	By currencyDropDown = By.xpath("//button[@name='EUR']");
	
	public Account_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public void timeSet() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void myAccountSelection() throws InterruptedException {
		WebElement myAccountObject = driver.findElement(myAccount);
		myAccountObject.click();
		timeSet();
		WebElement loginObject = driver.findElement(Login);
		loginObject.click();
		timeSet();
	}
	
	public void CustomerAccount(String email, String userPassword) throws InterruptedException {
		driver.findElement(EmailAddress).sendKeys(email);
		timeSet();
		driver.findElement(Password).sendKeys(userPassword);
		timeSet();
		driver.findElement(LoginButton).click();
		timeSet();
	}
	
	public void currencySelection() throws InterruptedException {
		WebElement currencyObject = driver.findElement(currency);
		currencyObject.click();
		timeSet();
		WebElement currencyOption = driver.findElement(currencyDropDown);
		currencyOption.click();
	}
}
