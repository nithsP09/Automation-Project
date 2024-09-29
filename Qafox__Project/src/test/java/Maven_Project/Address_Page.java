package Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Address_Page {
	
	public WebDriver driver;
	
	By AddressBook = By.xpath("//*[text()='Address Book']");
	By NewAddress = By.xpath("//*[text()='New Address']");
	By FirstName = By.xpath("//input[@name=\"firstname\"]");
	By LastName = By.xpath("//input[@name=\"lastname\"]");
	By Company = By.xpath("//input[@name=\"company\"]");
	By Address = By.xpath("//input[@name=\"address_1\"]");
	By City = By.xpath("//input[@name=\"city\"]");
	By PostalCode = By.xpath("//input[@name=\"postcode\"]");
	By Country = By.xpath("//select[@name=\"country_id\"]");
	By StateRegion = By.xpath("//select[@name=\"zone_id\"]");
	By DefaultAddress = By.xpath("(//input[@type=\"radio\"])[2]");
	By Continue = By.xpath("//input[@value=\"Continue\"]");
	By Delete = By.xpath("(//a[@class=\"btn btn-danger\"])[1]");
	
	public Address_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}

	public void addressBook() throws InterruptedException {
		driver.findElement(AddressBook).click();
		Timer();
		driver.findElement(NewAddress).click();
		Timer();
	}
	
	public void AddAdressFirstName(String firstName) {
		driver.findElement(FirstName).sendKeys(firstName);
	}
	
	public void AddAdressLastName(String lastName) {
		driver.findElement(LastName).sendKeys(lastName);
	}
	
	public void AddAddressCompany (String company) {
		driver.findElement(Company).sendKeys(company);
	}
	
	public void AddAdress(String address) {
		driver.findElement(Address).sendKeys(address);	
	}
	
	public void AddAdressPlace(String Place) {
		driver.findElement(City).sendKeys(Place);
	}
	
	public void AddAdressCode(String Code) {
		driver.findElement(PostalCode).sendKeys(Code);
	}
	
	public void countrySelection(String World) {
		WebElement country = driver.findElement(Country);
		Select countryObject = new Select(country);
		countryObject.selectByVisibleText(World);
	}
	
	public void stateRegionSelection(String State) {
		WebElement region = driver.findElement(StateRegion);
		Select regionObject = new Select(region);
		regionObject.selectByVisibleText(State);
	}
	
	public void scrollDown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Timer();
	}
	
	public void defaultAddress() {
		driver.findElement(DefaultAddress).click();
	}
	
	public void submitDetails() {
		driver.findElement(Continue).click();
	}
}
