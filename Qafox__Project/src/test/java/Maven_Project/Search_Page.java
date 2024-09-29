package Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Search_Page {
	
	public WebDriver driver;
	
	By mainLink = By.xpath("//*[text()='Qafox.com']");
	By searchBar = By.xpath("//input[@type=\"text\"]");
	By searchIcon = By.xpath("//i[@class=\"fa fa-search\"]");
	By SortBy = By.xpath("//select[@id=\"input-sort\"]");
	
	public Search_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timerset() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void scrollingDown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Timerset();
	}
	
	public void link() {
		driver.findElement(mainLink).click();
	}
	
	public void SearchBar(String item) {
		driver.findElement(searchBar).sendKeys(item);
	}
	
	public void SearchIcon() {
		driver.findElement(searchIcon).click();
	}
}
