package Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Compare_Page {
	
public WebDriver driver;
	
	By titlelink = By.xpath("//*[text()='Qafox.com']");
	By PhonesPDAs = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a");
	By ProductOne = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a");
	By ProductOneCompare = By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/button[2]");
	By ProductTwo = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a");
	By ProductTwoCompare = By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[2]");
	By ProductComparison = By.xpath("//*[@id=\"product-product\"]/div[1]/a[2]");
	By AddtoCart = By.xpath("(//input[@type=\"button\"])[1]");
	By ShoppingCart = By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span");
	By ProductOneRemove = By.xpath("//*[@id=\"content\"]/table/tbody[2]/tr/td[2]/a");
	By ProductTwoRemove = By.xpath("//*[@id=\"content\"]/table/tbody[2]/tr/td[2]/a");
	By Continue = By.xpath("//*[@id=\"content\"]/div/div/a");
	
	public Compare_Page(WebDriver driver) {
		this.driver = driver;
	}

	public void timeset() throws InterruptedException {
		Thread.sleep(2500);
	}
	
	public void scrolldown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		timeset();
	}
	
	public void titlelink() throws InterruptedException {
		timeset();
		driver.findElement(titlelink).click();
	}
	
	public void PhonesPDAs() throws InterruptedException {
		timeset();
		driver.findElement(PhonesPDAs).click();
	}
	
	public void ProductOne() throws InterruptedException {
		scrolldown();
		driver.findElement(ProductOne).click();
	}

	public void ProductOneCompare() throws InterruptedException {
		timeset();
		driver.findElement(ProductOneCompare).click();
	}
	
	public void Reverse() throws InterruptedException {
		timeset();
		driver.navigate().back();
	}
	
	public void ProductTwo() throws InterruptedException {
		timeset();
		driver.findElement(ProductTwo).click();
	}
	
	public void ProductTwoCompare() throws InterruptedException {
		timeset();
		driver.findElement(ProductTwoCompare).click();
	}
	
	public void ProductComparison() throws InterruptedException {
		timeset();
		driver.findElement(ProductComparison).click();
	}
	
	public void AddtoCart() throws InterruptedException {
		timeset();
		for(int i=1; i<=2; i++) {
			scrolldown();
		}
		driver.findElement(AddtoCart).click();
	}
	
	public void ShoppingCart() throws InterruptedException {
		timeset();
		driver.findElement(ShoppingCart).click();
	}
	
	public void reverse() throws InterruptedException {
		timeset();
		driver.navigate().back();
	}
	
	public void ProductOneRemove() throws InterruptedException {
		timeset();
		for(int i=1; i<=2; i++) {
			scrolldown();
		}
		driver.findElement(ProductOneRemove).click();
	}
	
	public void ProductTwoRemove() throws InterruptedException {
		timeset();
		for(int i=1; i<=2; i++) {
			scrolldown();
		}
		driver.findElement(ProductTwoRemove).click();
	}
	
	public void Continue() throws InterruptedException {
		timeset();
		driver.findElement(Continue).click();
	}
}
