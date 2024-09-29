package Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart_Page {
	
	public WebDriver driver;
	
	By ShoppingCart = By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span");
	By CrossButton = By.xpath("//*[@id=\"checkout-cart\"]/div[1]/button");
	By ProductOneClose = By.xpath("(//button[@class='btn btn-danger'])[1]");
	By ProductTwoClose = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]");
	By ProductThreeClose = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]/i");
	By UpdateQty = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input");
	By UpdateIcon = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[1]");
	By ShippingAndTaxes = By.xpath("(//a[@class='accordion-toggle'])[2]");
	By GetQuote = By.xpath("//*[@id=\"button-quote\"]");
	By FlatRate = By.xpath("//*[@id=\"modal-shipping\"]/div/div/div[2]/div/label/input");
	By ApplyShipping = By.xpath("//*[@id=\"button-shipping\"]");
	By CheckOut = By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a");
	
	public Cart_Page(WebDriver driver) {
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
	
	public void ShoppingCart() throws InterruptedException {
		time();
		driver.findElement(ShoppingCart).click();
	}
	
	public void ProductOneClose() throws InterruptedException {
		time();
		driver.findElement(ProductOneClose).click();
	}
	
	public void ProductTwoClose() throws InterruptedException {
		time();
		driver.findElement(ProductTwoClose).click();
	}
	
	public void CrossButton() throws InterruptedException {
		time();
		driver.findElement(CrossButton).click();
	}
	
	public void ProductThreeClose() throws InterruptedException {
		time();
		driver.findElement(ProductThreeClose).click();
	}

	public void UpdateQty(String updateQty) throws InterruptedException {
		time();
		WebElement UpdateQtyField = driver.findElement(UpdateQty);
		UpdateQtyField.clear();
		time();
		UpdateQtyField.sendKeys(updateQty);
	}
	
	public void UpdateIcon() throws InterruptedException {
		time();
		driver.findElement(UpdateIcon).click();
	}
	
	public void ShippingAndTaxes() throws InterruptedException {
		for(int i=0; i<2; i++) {
			scrolldown();
		}
		time();
		driver.findElement(ShippingAndTaxes).click();
	}
	
	public void GetQuote() throws InterruptedException {
		time();
		driver.findElement(GetQuote).click();
	}
	
	public void FlatRate() throws InterruptedException {
		time();
		driver.findElement(FlatRate).click();
	}
	
	public void ApplyShipping() throws InterruptedException {
		time();
		driver.findElement(ApplyShipping).click();
	}
	
	public void CheckOut() throws InterruptedException {
		for(int i=0; i<=3; i++) {
			scrolldown();
		}
		time();
		driver.findElement(CheckOut).click();
	}
}
