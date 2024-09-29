package Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CheckOut_Page {
	
	public WebDriver driver;
	
	By BillingDetailsContinue = By.xpath("//*[@id=\"button-payment-address\"]");
	By DeliveryDetailsContinue = By.xpath("//input[@id='button-shipping-address']");
	By DeliveryMethod = By.xpath("//textarea[@name=\"comment\"]");
	By DeliveryMethodContinue = By.xpath("//*[@id=\"button-shipping-method\"]");
	By PaymentMethod = By.xpath("//input[@type=\"checkbox\"]");
	By PaymentMethodContinue = By.xpath("//*[@id=\"button-payment-method\"]");
	By ConfirmOrder = By.xpath("//*[@id=\"button-confirm\"]");
	By OrderContinue = By.xpath("//*[@id=\"content\"]/div/div/a");
	
	public CheckOut_Page(WebDriver driver) {
		this.driver = driver;
	}

	public void set() throws InterruptedException {
		Thread.sleep(2500);
	}
	
	public void scrollerdown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		set();
	}
	
	public void BillingDetailsContinue() throws InterruptedException {
		set();
		driver.findElement(BillingDetailsContinue).click();
		scrollerdown();
	}
	
	public void DeliveryDetailsContinue() throws InterruptedException {
		set();
		driver.findElement(DeliveryDetailsContinue).click();
	}

	public void DeliveryMethod() throws InterruptedException {
		set();
		driver.findElement(DeliveryMethod).sendKeys("Treat with love for lasting care!");
		scrollerdown();
		driver.findElement(DeliveryMethodContinue).click();
		scrollerdown();
	}
	
	public void PaymentMethod() throws InterruptedException {
		set();
		driver.findElement(PaymentMethod).click();
		set();
		driver.findElement(PaymentMethodContinue).click();
		scrollerdown();
	}
	
	public void ConfirmOrder() throws InterruptedException {
		set();
		driver.findElement(ConfirmOrder).click();
	}
	
	public void OrderContinue() throws InterruptedException {
		set();
		driver.findElement(OrderContinue).click();
	}
}
