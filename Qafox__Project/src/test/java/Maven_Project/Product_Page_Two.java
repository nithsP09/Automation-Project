package Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Product_Page_Two {
	
	public WebDriver driver;
	
	By titleLink = By.xpath("//*[text()='Qafox.com']");
	By Component =  By.xpath("(//a[@data-toggle=\"dropdown\"])[4]");
	By ComponentSelection = By.xpath("//*[text()='Monitors (2)']");
	By ItemSelection = By.xpath("//*[@id=\"content\"]/div[3]/div[2]/div/div[2]/div[1]/h4/a");
	By Review = By.xpath("(//a[@data-toggle=\"tab\"])[2]");
	By Description = By.xpath("(//a[@data-toggle=\"tab\"])[1]");
	By Quantity = By.xpath("(//input[@type=\"text\"])[3]");
	By AddToCart = By.xpath("//button[@id='button-cart']");
	
	public Product_Page_Two(WebDriver driver) {
		this.driver = driver;
	}

	public void TimeSet() throws InterruptedException {
		Thread.sleep(2500);
	}
	
	public void scrollDown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		TimeSet();
	}
	
	public void titleLink() throws InterruptedException {
		TimeSet();
		driver.findElement(titleLink).click();
	}
	
	public void Component() throws InterruptedException {
		WebElement componentMenu = driver.findElement(Component);
		componentMenu.click();
		TimeSet();
		WebElement componentSelectionMenu =  driver.findElement(ComponentSelection);
		componentSelectionMenu.click();
		TimeSet();
	}
	
	public void ItemSelection() throws InterruptedException {
		TimeSet();
		scrollDown();
		TimeSet();
		driver.findElement(ItemSelection).click();
		TimeSet();
		scrollDown();
		TimeSet();
	}
	
	public void Review() throws InterruptedException{
		driver.findElement(Review).click();
		TimeSet();
	}
	
	public void Description() throws InterruptedException{
		driver.findElement(Description).click();
		TimeSet();
	}
	
	public void Quantity(String qty) throws InterruptedException {
		TimeSet();
		WebElement QuantityField = driver.findElement(Quantity);
		QuantityField.clear();
	    TimeSet();
	    QuantityField.sendKeys(qty);
	}
	
	public void addToCart() throws InterruptedException {
		TimeSet();
		driver.findElement(AddToCart).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
