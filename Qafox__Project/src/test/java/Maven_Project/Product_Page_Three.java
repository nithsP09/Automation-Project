package Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Product_Page_Three {

	public WebDriver driver;
	
	By title = By.xpath("//*[text()='Qafox.com']");
	By LaptopsAndNotebooks = By.xpath("(//a[@data-toggle=\"dropdown\"])[3]");
	By ShowAllLaptopsAndNotebooks = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a");
	By ChooseProduct = By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/h4/a");
	By DeliveryDate = By.xpath("(//input[@type=\"text\"])[3]");
	By Qty = By.xpath("(//input[@type=\"text\"])[4]");
	By AddCart = By.xpath("//*[@id=\"button-cart\"]");
		
	public Product_Page_Three(WebDriver driver) {
		this.driver = driver;
	}

	public void time() throws InterruptedException {
		Thread.sleep(2500);
	}
	
	public void scrolldown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		time();
	}
	
	public void scrollup() throws InterruptedException {
		JavascriptExecutor js_scrollup = (JavascriptExecutor) driver;
		js_scrollup.executeScript("window.scrollBy(0,-400)");
		time();
	}

	public void title() throws InterruptedException {
		time();
		driver.findElement(title).click();
	}
	
	public void LaptopsAndNotebooks() throws InterruptedException {
		time();
		driver.findElement(LaptopsAndNotebooks).click();
	}
	
	public void ShowAllLaptopsAndNotebooks() throws InterruptedException {
		time();
		driver.findElement(ShowAllLaptopsAndNotebooks).click();
	}
	
	public void ChooseProduct() throws InterruptedException {
		time();
		driver.findElement(ChooseProduct).click();
	}
	
	public void DeliveryDate(String deliverDate) throws InterruptedException {
		for(int i=0; i<2; i++ ) {
			scrolldown();
		}
		time();
		WebElement DeliveryDateField = driver.findElement(DeliveryDate);
		DeliveryDateField.clear();
		time();
		DeliveryDateField.sendKeys(deliverDate);
	}
	
	public void quantity(String qty) throws InterruptedException {
		time();
		WebElement quantityField = driver.findElement(Qty);
		quantityField.clear();
		time();
		quantityField.sendKeys(qty);
	}
	
	public void AddCart() throws InterruptedException {
		time();
		driver.findElement(AddCart).click();
	}
}
