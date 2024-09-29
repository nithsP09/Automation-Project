package Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WishList_Page {
	
	public WebDriver driver;
	
	By TitleLink = By.xpath("//*[text()='Qafox.com']");
	By Cameras = By.xpath("//*[text()='Cameras']");
	By CameraSelection = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a");
	By CameraImage = By.xpath("(//img[@title=\"Nikon D300\"])[1]");
	By ButtonNext = By.xpath("//button[@title=\"Next (Right arrow key)\"]");
	By ButtonPrevious = By.xpath("//button[@title=\"Previous (Left arrow key)\"]");
	By ButtonClose = By.xpath("//button[@title=\"Close (Esc)\"]");
	By WishListButtonOne = By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/button[1]/i");
	By Tablets = By.xpath("//*[@id=\"column-left\"]/div[1]/a[4]");
	By TabletsSelection = By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/h4/a");
	By TabletsImage = By.xpath("(//img[@title=\"Samsung Galaxy Tab 10.1\"])[1]");
	By NextButton = By.xpath("//button[@title=\"Next (Right arrow key)\"]");
	By PreviousButton = By.xpath("//button[@title=\"Previous (Left arrow key)\"]");
	By CloseButton = By.xpath("//button[@title=\"Close (Esc)\"]");
	By WishListButtonTwo = By.xpath("(//i[@class=\"fa fa-heart\"])[2]");
	By WishList = By.xpath("//*[@id=\"wishlist-total\"]/span");
	By Continue = By.xpath("//*[@id=\"content\"]/div[2]/div/a");
	
	public WishList_Page(WebDriver driver) {
		this.driver = driver;
	}

	public void timer() throws InterruptedException {
		Thread.sleep(2500);
	}
	
	public void ScrollDown() throws InterruptedException {
		JavascriptExecutor js_scrolldown = (JavascriptExecutor) driver;
		js_scrolldown.executeScript("window.scrollBy(0,200)");
		timer();
	}
	
	public void ScrollUp() throws InterruptedException {
		JavascriptExecutor js_scrollup = (JavascriptExecutor) driver;
		js_scrollup.executeScript("window.scrollBy(0,-400)");
		timer();
	}
	
	public void TitleLink() throws InterruptedException {
		timer();
		driver.findElement(TitleLink).click();
	}
	
	public void Cameras() throws InterruptedException {
		timer();
		driver.findElement(Cameras).click();
	}
	
	public void CameraSelection() throws InterruptedException {
		timer();
		ScrollDown();
		driver.findElement(CameraSelection).click();
	}
	
	public void CameraImage() throws InterruptedException{
		timer();
		driver.findElement(CameraImage).click();
	}
	
	public void ButtonsChange() throws InterruptedException {
		for(int i=1; i<=5; i++) {
			driver.findElement(ButtonNext).click();
			timer();
		}
		for(int i=1; i<=5; i++) {
			driver.findElement(ButtonPrevious).click();
			timer();
		}
		driver.findElement(ButtonClose).click();
	}
	
	public void View() throws InterruptedException {
		for(int i=1; i<=3; i++) {
			ScrollDown();
		}
		for(int i=1; i<=2; i++) {
			ScrollUp();
		}
	}

	public void WishListButtonOne() throws InterruptedException {
		timer();
		driver.findElement(WishListButtonOne).click();
	}
	
	public void Backwards() throws InterruptedException {
		timer();
		driver.navigate().back();
	}
	
	public void Tablets() throws InterruptedException {
		timer();
		driver.findElement(Tablets).click();
	}
	
	public void TabletsSelection() throws InterruptedException {
		timer();
		driver.findElement(TabletsSelection).click();
	}
	
	public void TabletsImage() throws InterruptedException {
		timer();
		driver.findElement(TabletsImage).click();
	}
	
	public void ChangeButtons() throws InterruptedException {
		for(int i=1; i<=7; i++) {
			driver.findElement(NextButton).click();
			timer();
		}
		for(int i=1; i<=7; i++) {
			driver.findElement(PreviousButton).click();
			timer();
		}
		driver.findElement(CloseButton).click();
	}
	
	public void ViewIt() throws InterruptedException {
		for(int i=1; i<=2; i++) {
			ScrollDown();
		}
		ScrollUp();
	}
	
	public void WishListButtonTwo() throws InterruptedException {
		timer();
		driver.findElement(WishListButtonTwo).click();
	}
	
	public void WishList() throws InterruptedException {
		timer();
		driver.findElement(WishList).click();
	}
	
	public void Continue() throws InterruptedException {
		timer();
		driver.findElement(Continue).click();
	}
}
