package Maven_Project;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Qafox_Page {
	
	public WebDriver driver;
	public Account_Page Account_Page_Object;
	public Address_Page Address_Page_Object;
	public Search_Page Search_Page_Object;
	public Product_Page_One Product_Page_One_Object;
	public Product_Page_Two Product_Page_Two_Object;
	public Product_Page_Three Product_Page_Three_Object;
	public WishList_Page WishList_Page_Object;
	public Compare_Page Compare_Page_Object;
	public Cart_Page Cart_Page_Object;
	public CheckOut_Page CheckOut_Page_Object;
	
  @BeforeClass
	public void beforeMethod() throws InterruptedException {
	  driver = new ChromeDriver();
	  Account_Page_Object = new Account_Page(driver);
	  Address_Page_Object = new Address_Page(driver);
	  Search_Page_Object = new Search_Page(driver);
	  Product_Page_One_Object = new Product_Page_One(driver);
	  Product_Page_Two_Object = new Product_Page_Two(driver);
	  Product_Page_Three_Object = new Product_Page_Three(driver);
	  WishList_Page_Object = new WishList_Page(driver);
	  Compare_Page_Object = new Compare_Page(driver);
	  Cart_Page_Object = new Cart_Page(driver);
	  CheckOut_Page_Object = new CheckOut_Page(driver);
	  driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	  Thread.sleep(1500);
	  driver.manage().window().maximize();
	  Thread.sleep(1500);
  }
  
  @Test (priority = 1)
  public void AccountPage() throws InterruptedException {
	  Account_Page_Object.myAccountSelection();
	  Account_Page_Object.CustomerAccount("bedigan9768@hotmail.com", "67890");
	  Account_Page_Object.currencySelection();
  }
	
  @Test (priority = 2)
  public void AddressPage() throws InterruptedException {
	  Address_Page_Object.Timer();
	  Address_Page_Object.addressBook();
	  Address_Page_Object.Timer();
	  Address_Page_Object.AddAdressFirstName("Bedigan");
	  Address_Page_Object.Timer();
	  Address_Page_Object.AddAdressLastName("Detoria");
	  Address_Page_Object.Timer();
	  Address_Page_Object.AddAddressCompany("BVD_Company");
	  Address_Page_Object.Timer();
	  Address_Page_Object.AddAdress("ESX+Barveli-XCC");
	  Address_Page_Object.Timer();
	  Address_Page_Object.scrollDown();
	  Address_Page_Object.AddAdressPlace("Detroit");
	  Address_Page_Object.Timer();
	  Address_Page_Object.AddAdressCode("78549");
	  Address_Page_Object.Timer();
	  Address_Page_Object.countrySelection("United States");
	  Address_Page_Object.Timer();
	  Address_Page_Object.stateRegionSelection("South Carolina");
	  Address_Page_Object.Timer();
	  Address_Page_Object.defaultAddress();
	  Address_Page_Object.Timer();
	  Address_Page_Object.submitDetails();
  }

  @Test (priority = 3)
  public void SearchPage() throws InterruptedException {
	  Search_Page_Object.Timerset();
	  Search_Page_Object.link();
	  Search_Page_Object.Timerset();
	  Search_Page_Object.SearchBar("iPhone");
	  Search_Page_Object.Timerset();
	  Search_Page_Object.SearchIcon();
	  Search_Page_Object.Timerset();
  }
  
  @Test (priority = 4)
  public void ProductPageOne() throws InterruptedException {
	  Product_Page_One_Object.TimerSet();
	  Product_Page_One_Object.chooseItem();
	  Product_Page_One_Object.TimerSet();
	  Product_Page_One_Object.image();
	  Product_Page_One_Object.TimerSet();
	  Product_Page_One_Object.ImageButton();
	  Product_Page_One_Object.Opinion();
	  Product_Page_One_Object.quantitySelection("2");
	  Product_Page_One_Object.addItem();
  }
  
  @Test (priority = 5)
  public void ProductPageTwo() throws InterruptedException {
	  Product_Page_Two_Object.titleLink();
	  Product_Page_Two_Object.Component();
	  Product_Page_Two_Object.ItemSelection();
	  Product_Page_Two_Object.Review();
	  Product_Page_Two_Object.Description() ;
	  Product_Page_Two_Object.Quantity("1");
	  Product_Page_Two_Object.addToCart();
  }
  @Test (priority = 6)
  public void ProductPageThree() throws InterruptedException {
	  Product_Page_Three_Object.title();
	  Product_Page_Three_Object.LaptopsAndNotebooks();
	  Product_Page_Three_Object.ShowAllLaptopsAndNotebooks();
	  Product_Page_Three_Object.ChooseProduct();
	  Product_Page_Three_Object.DeliveryDate("2024-09-29");
	  Product_Page_Three_Object.quantity("2");
	  Product_Page_Three_Object.AddCart();
  }

  @Test (priority = 7)
  public void WishListPage() throws InterruptedException {
	  WishList_Page_Object.TitleLink();
	  WishList_Page_Object.Cameras();
	  WishList_Page_Object.CameraSelection();
	  WishList_Page_Object.CameraImage();
	  WishList_Page_Object.ButtonsChange();
	  WishList_Page_Object.View();
	  WishList_Page_Object.WishListButtonOne();
	  WishList_Page_Object.Backwards();
	  WishList_Page_Object.Tablets();
	  WishList_Page_Object.TabletsSelection();
	  WishList_Page_Object.TabletsImage();
	  WishList_Page_Object.ChangeButtons();
	  WishList_Page_Object.ViewIt();
	  WishList_Page_Object.WishListButtonTwo();
	  WishList_Page_Object.WishList();
	  WishList_Page_Object.Continue();
  }
  
  @Test (priority = 8)
  public void ComparePage() throws InterruptedException {
	  Compare_Page_Object.titlelink();
	  Compare_Page_Object.PhonesPDAs();
	  Compare_Page_Object.ProductOne();
	  Compare_Page_Object.ProductOneCompare();
	  Compare_Page_Object.Reverse();
	  Compare_Page_Object.ProductTwo();
	  Compare_Page_Object.ProductTwoCompare();
	  Compare_Page_Object.ProductComparison();
	  Compare_Page_Object.AddtoCart();
	  Compare_Page_Object.ShoppingCart();
	  Compare_Page_Object.reverse();
	  Compare_Page_Object.ProductOneRemove();
	  Compare_Page_Object.ProductTwoRemove();
	  Compare_Page_Object.Continue();
  }
  
  @Test (priority = 9)
  public void CartPage() throws InterruptedException {
	  Cart_Page_Object.ShoppingCart();
	  Cart_Page_Object.ProductOneClose();
	  Cart_Page_Object.ProductTwoClose();
	  Cart_Page_Object.CrossButton();
	  Cart_Page_Object.ProductThreeClose();
	  Cart_Page_Object.UpdateQty("4");
	  Cart_Page_Object.UpdateIcon(); 
	  Cart_Page_Object.ShippingAndTaxes();
	  Cart_Page_Object.GetQuote();
	  Cart_Page_Object.FlatRate();
	  Cart_Page_Object.ApplyShipping();
	  Cart_Page_Object.CheckOut();
  }
  
  @Test (priority = 10)
  public void ChechkOutPage() throws InterruptedException {
	  CheckOut_Page_Object.BillingDetailsContinue();
	  CheckOut_Page_Object.DeliveryDetailsContinue();
	  CheckOut_Page_Object.DeliveryMethod();
	  CheckOut_Page_Object.PaymentMethod();
	  CheckOut_Page_Object.ConfirmOrder();
	  CheckOut_Page_Object.OrderContinue();
  }
  
  @AfterClass
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  //driver.close();
  }
}
