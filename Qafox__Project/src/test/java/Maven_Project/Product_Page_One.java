package Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Product_Page_One {
	
	public WebDriver driver;
	
	By itemSelect = By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a");
	By itemImage = By.xpath("(//img[@title=\"iPhone\"])[2]");
	By imageButtonNext = By.xpath("(//button[@type=\"button\"])[3]");
	By imageButtonPrevious = By.xpath("(//button[@type=\"button\"])[2]");
	By imageButtonClose = By.xpath("(//button[@type=\"button\"])[1]");
	By review = By.xpath("(//a[@data-toggle=\"tab\"])[2]");
	By description = By.xpath("(//a[@data-toggle=\"tab\"])[1]");
	By quantity = By.xpath("//input[@name=\"quantity\"]");
	By addToCartButton = By.xpath("//button[@id='button-cart']");
	
	public Product_Page_One(WebDriver driver) {
		this.driver = driver;
	}
	
	public void TimerSet() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void scrollerDown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		TimerSet();
	}
	
	public void chooseItem() throws InterruptedException {
		driver.findElement(itemSelect).click();
	}
	
	public void image() throws InterruptedException {
		scrollerDown();
		driver.findElement(itemImage).click();
	}
	
	public void ImageButton() throws InterruptedException{
		for (int i = 0; i < 5; i++) {
	        driver.findElement(imageButtonNext).click();
	        TimerSet();
	    }
		for (int i = 0; i < 5; i++) {
	        driver.findElement(imageButtonPrevious).click();
	        TimerSet();
	    }
		driver.findElement(imageButtonClose).click();
	}
	
	public void Opinion() throws InterruptedException {
		scrollerDown();
		driver.findElement(review).click();
		TimerSet();
		driver.findElement(description).click();
	}
	
	public void quantitySelection(String qty) throws InterruptedException {
		WebElement quantityField = driver.findElement(quantity);
	    quantityField.clear();
	    TimerSet();
	    quantityField.sendKeys(qty);
	    TimerSet();
	}
	
	public void addItem() throws InterruptedException {
		driver.findElement(addToCartButton).click();
		TimerSet();
	}

}
