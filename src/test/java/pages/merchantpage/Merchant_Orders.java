package pages.merchantpage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.userpage.Userpage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class Merchant_Orders {
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Userpage userpage=new Userpage();
    Actions actions=new Actions(Driver.getDriver());
    public Merchant_Orders(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // Dashboard/Order Butonu
    @FindBy(xpath ="//li[@class='merchant_orders']")
    public   WebElement ordersButton;
    //Dashboard/Order/New Orders
    @FindBy(xpath ="//li[@class='position-relative orders_new']")
    public   WebElement newOrdersButton;
    //Dashboard/Orders/New Orders/Sipariş Listesi
    @FindBy(xpath ="//div[@class='col col-lg-3 col-md-4 col-sm-3 position-relative border']")
    public   WebElement orderList;
    //Dashboard/Orders/New Orders/Sipariş Listesi 1. Yemek
    @FindBy(xpath ="//div[@class='row align-items-start'][1]")
    public   WebElement orderListFirstMeal;
    //Dashboard/Orders/New Orders/Accept Butonu
    @FindBy(xpath ="//button[@class='btn-green btn normal mr-2 font13 mb-3 mb-xl-0']")
    public   WebElement acceptedButton;
    //Dashboard/Orders/New Orders/Reject Butonu
    @FindBy(xpath ="//button[@class='btn-black btn normal mr-2 font13 mb-3 mb-xl-0']")
    public   WebElement rejectButton;
    //Dashboard/Orders/New Orders/Reject Butonu/No Result yazısı
    @FindBy(xpath ="//p[text()='No results']")
    public   WebElement noResultText;
    //Dashboard/Orders/New Orders/Reject Butonu/Kitchen Closed Seçeneği
    @FindBy(xpath ="//a[text()='Kitchen closed']")
    public   WebElement kitchenClosedOption;
    //Dashboard/Orders/New Orders/Reject Butonu/Kitchen Closed Seçeneği/Reject Order Butonu
    @FindBy(xpath ="(//button[@class='btn btn-green pl-4 pr-4'])[5]")
    public   WebElement rejectOrderButton;
    //Dashboard/Orders/New Orders/Sipariş Özeti Get Direction Linki
    @FindBy(xpath ="//u[text()='Get direction']")
    public   WebElement getDirectionLinki ;
    //Dashboard/Orders/New Orders/Sipariş Özeti Assign Driver Butonu
    @FindBy(xpath ="//button[@class='btn btn-primary']")
    public   WebElement assignDriverButton ;
    //Dashboard/Orders/New Orders/Filtreleme Kutusu
    @FindBy(xpath ="//input[@class='form-control py-2 border-right-0 border']")
    public   WebElement filterTextBox;
    //Dashboard/Orders/New Orders/Filtreleme Kutusu/Clear Butonu
    @FindBy(xpath ="//a[@class='m-0 link font12']")
    public   WebElement clearButton;
    //Dashboard/Orders/New Orders/Order Type Butonu
    @FindBy(xpath ="(//div[@class='filter-option-inner-inner'])[1]")
    public   WebElement orderTypeButton ;
    //Dashboard/Orders/New Orders/Order Type Butonu/Delivery seçeneği
    @FindBy(xpath ="//span[text()='Delivery']")
    public   WebElement deliveryOption ;
    //Dashboard/Orders/New Orders/Payment Status Butonu
    @FindBy(xpath ="(//div[@class='filter-option-inner-inner'])[2]")
    public   WebElement paymentStatusButton;
    //Dashboard/Orders/New Orders/Payment Status Butonu/Unpaid seçeneği
    @FindBy(xpath ="(//span[text()='Unpaid'])[1]")
    public   WebElement unpaidOption ;
    //Dashboard/Orders/New Orders/Payment Sort Butonu
    @FindBy(xpath ="(//div[@class='filter-option-inner-inner'])[3]")
    public   WebElement sortButton;
    //Dashboard/Orders/New Orders/Payment Sort Butonu/OrderID-Ascending seceneği
    @FindBy(xpath ="//span[text()='Order ID - Ascending']")
    public   WebElement orderIDAscendingOption;
    //Dashboard/Orders/New Orders/Accepting Orders Butonu
    @FindBy(xpath ="//div[@class='xd-none xd-lg-block']")
    public   WebElement acceptingOrdersButton;
    //Dashboard/Orders/New Orders/Accepting Orders Butonu/10 min seçeneği
    @FindBy(xpath ="(//button[text()='10 min(s)'])[2]")
    public   WebElement minuteOption  ;
    //Dashboard/Orders/New Orders/Accepting Orders Butonu/Next Butonu
    @FindBy(xpath ="(//button[@class='btn btn-green pl-4 pr-4'])[3]")
    public   WebElement nextButton ;
    //Dashboard/Orders/New Orders/Accepting Orders Butonu/Next Butonu/Store Closed seçeneği
    @FindBy(xpath ="//a[text()='Store closed']")
    public   WebElement storeClosedOption ;
    //Dashboard/Orders/New Orders/Accepting Orders Butonu/Next Butonu/Confirm Butonu
    @FindBy(xpath ="(//button[@class='btn btn-green pl-4 pr-4'])[3]")
    public   WebElement confirmButton;
    //Dashboard/Orders/New Orders/Print Butonu
    @FindBy(xpath ="//button[text()='Print']")
    public   WebElement printButton;
    //Dashboard/Orders/New Orders/Print Butonu/Print Butonu
    @FindBy(xpath ="(//button[@class='btn btn-green'])[2]")
    public   WebElement secondPrintButton;
    //Dashboard/Orders/New Orders/Print Butonu/Print Butonu/Son Yazdır Butonu
    @FindBy(xpath ="(//cr-button[@class='cancel-button'])[6]")
    public   WebElement lastPrintButton;
    //Dashboard/Orders/New Orders/Print Butonu/Print Butonu Yanı/3 Nokta Butonu
    @FindBy(xpath ="(//a[@id='dropdownMenuLink'])[1]")
    public   WebElement threePointButton;
    //Dashboard/Orders/New Orders/Print Butonu/Print Butonu Yanı/3 nokta/Contact Customer Butonu
    @FindBy(xpath ="//a[text()='Contact customer']")
    public   WebElement contactCustomerOption;
    //Dashboard/Orders/New Orders/Print Butonu/Print Butonu Yanı/3 nokta/Contact Customer/Okay Butonu
    @FindBy(xpath ="//button[@class='btn btn-green small pl-4 pr-4 bootbox-accept']")
    public   WebElement contactCustomerOkayButton;
    //Dashboard/Orders/New Orders/Print Butonu/Print Butonu Yanı/3 nokta/Download
    @FindBy(xpath ="//a[text()='Download PDF (A4)']")
    public   WebElement downloadButton;
    //Dashboard/Orders/New Orders/+Add Butonu
    @FindBy(xpath ="//a[@class='btn btn-green small']")
    public   WebElement addButton;
    //Dashboard/Orders/New Orders/+Add Butonu/İlk ürün
    @FindBy(xpath ="(//div[@class='row items no-gutters align-items-center rounded w-100'])[1]")
    public   WebElement firstProduct;
    //Dashboard/Orders/New Orders/+Add Butonu/İlk Ürün/Add to Order Butonu
    @FindBy(xpath ="//button[@class='btn btn-green w-100 add_to_cart']")
    public   WebElement addToOrderButton;
    //Dashboard/Orders/New Orders/+Add Butonu/İlk Ürün/Add to Order Butonu/Close işareti
    @FindBy(xpath ="(//button[@class='close'])[10]")
    public   WebElement closeButton;
    //Dashboard/Orders/New Orders/Summary Bölümü
    @FindBy(xpath ="//div[@class='card-body pt-3']")
    public   WebElement orderSummary;
    //Dashboard/Orders/Orders Processing Sayfası
    @FindBy(xpath ="//a[text()='Orders Processing']")
    public   WebElement ordersProcessingButton;
    //Dashboard/Orders/Orders Processing Sayfası/Ready for Pickup Butonu
    @FindBy(xpath ="//span[text()='Ready for pickup']")
    public   WebElement readyForPickupButton;
    //Dashboard/Orders/Orders Ready
    @FindBy(xpath ="//a[text()='Orders Ready']")
    public   WebElement ordersReadyButton;
    //Dashboard/Orders/Orders Ready /Delivery on its way Butonu
    @FindBy(xpath ="//button[@class='btn-green btn normal mr-2 font13 mb-3 mb-xl-0']")
    public   WebElement deliveryOnItsWayButton;

    //Dashboard/Orders/Orders Ready /Delivery on its way Yazısı
    @FindBy(xpath ="//span[text()='delivery on its way']")
    public   WebElement deliveryOnItsWayText;

    //Dashboard/Orders/Orders Ready/Delivered Butonu
    @FindBy(xpath ="//button[@class='btn-yellow btn normal mr-2 font13 mb-3 mb-xl-0']")
    public   WebElement deliveredButton;
    //Dashboard/Orders/Orders Ready/Delivery Failed Butonu
    @FindBy(xpath ="//button[@class='btn-black btn normal mr-2 font13 mb-3 mb-xl-0']")
    public   WebElement deliveryFailedButton;
    //Dashboard/Orders/New Orders/Meals Center Logosu
    @FindBy(xpath ="//img[@src='https://qa.mealscenter.com/backoffice/../upload/all/8e414c73-c045-11ed-ac97-2cea7f508bb0.webp']")
    public   WebElement mealsCenterLogo;
    //Dashboard/Orders/New Orders/How to manage orders Linki
    @FindBy(xpath ="(//a[text()='How to manage orders'])[1]")
    public   WebElement howToManageOrdersLink;

    //Userpage/Thai Restaurant




  //  @FindBy(xpath ="(//img[@class='rounded'])[23]")
    @FindBy(xpath ="(//img[@class='rounded'])[10]")

    public   WebElement thai;
    //Userpage/Thai Restaurant 1. ürün
    @FindBy(xpath ="(//a[@class='btn btn-grey quantity-add-cart'])[1]")
    public   WebElement firstMeal;
    //Userpage/Thai Restaurant 2. ürün
    @FindBy(xpath ="(//a[@class='btn btn-grey quantity-add-cart'])[2]")
    public   WebElement secondMeal;
    //Userpage/Thai Restaurant/Checkout Butonu
    @FindBy(xpath ="//a[@class='btn btn-green w-100 pointer d-flex justify-content-between']")
    public   WebElement checkoutButton;
    //Userpage/Thai Restaurant/Checkout Butonu/Place Order
    @FindBy(xpath ="//button[@class='btn btn-green w-100 pointer']")
    public   WebElement placeOrderButton;
    //Userpage/Cookie Kabul
    @FindBy(xpath ="//*[text()='Accept']")
    public   WebElement cookieAccept;
    //Userpage//Thai/İlk Yemek/Adres Kutusu
    @FindBy(xpath ="(//input[@placeholder='Enter your address'])[2]")
    public   WebElement deliveryAddressTextBox;
    //Userpage//Thai/İlk Yemek/Adres Kutusu/USA seçeneği
    @FindBy(xpath ="(//h6[@class='m-0'])[1]")
    public   WebElement usaOption;
    //Dashboard/Orders/Completed Butonu
    @FindBy(xpath ="//a[text()='Completed']")
    public   WebElement completedButton;


    //ELİF METHODLAR
    public void newOrdersButtonClick(){
        Merchant_Orders merchant_orders=new Merchant_Orders();

        Driver.getDriver().get(ConfigReader.getProperty("merchantUrl"));

        //kullanıcı giriş sayfasında  username ve passwordu bilgilerini girip giriş yapar
        SignUp_Login_DashboardHomePage signUpLoginDashboardHomePage=new SignUp_Login_DashboardHomePage();
        ReusableMethods.bekle(1);

        SignUp_Login_DashboardHomePage.usernameButton.sendKeys("thaiAdmin");
        ReusableMethods.bekle(1);

        SignUp_Login_DashboardHomePage.passwordButton.sendKeys("1234567");
        SignUp_Login_DashboardHomePage.loginSignInButton.click();
        merchant_orders.ordersButton.click();
        merchant_orders.newOrdersButton.click();
    }
    public void addOrderToCart(){

        Merchant_Orders merchant_orders=new Merchant_Orders();
        Userpage userpage = new Userpage();
        Actions actions=new Actions(Driver.getDriver());
        loginMethods();
        ReusableMethods.wait(2);
      JSUtilities.scrollToElement(Driver.getDriver(),thai);
      JSUtilities.clickWithJS(Driver.getDriver(),thai);
     // merchant_orders.thai.click();
      ReusableMethods.bekle(4);
      merchant_orders.cookieAccept.click();

        merchant_orders.firstMeal.click();
        merchant_orders.deliveryAddressTextBox.click();
        merchant_orders.deliveryAddressTextBox.sendKeys("USA");
        merchant_orders.usaOption.click();
        ReusableMethods.bekle(2);
        merchant_orders.firstMeal.click();
        merchant_orders.checkoutButton.click();
        ReusableMethods.bekle(3);
        merchant_orders.placeOrderButton.click();
    }
    public void ordersProcessingClick(){

        Merchant_Orders merchant_orders=new Merchant_Orders();
        Userpage userpage = new Userpage();
        Actions actions=new Actions(Driver.getDriver());
        loginMethods();
        ReusableMethods.wait(2);
        JSUtilities.scrollToElement(Driver.getDriver(),merchant_orders.thai);
        merchant_orders.thai.click();
        ReusableMethods.bekle(4);
        merchant_orders.cookieAccept.click();

        merchant_orders.firstMeal.click();
        merchant_orders.deliveryAddressTextBox.click();
        merchant_orders.deliveryAddressTextBox.sendKeys("USA");
        merchant_orders.usaOption.click();
        ReusableMethods.bekle(2);
        merchant_orders.firstMeal.click();
        merchant_orders.checkoutButton.click();
        ReusableMethods.bekle(3);
        merchant_orders.placeOrderButton.click();
        newOrdersButtonClick();
        orderListFirstMeal.click();
        acceptedButton.click();
        ordersProcessingButton.click();
        ReusableMethods.wait(3);
        merchant_orders.placeOrderButton.click();
     //   Driver.closeDriver();

    }
    public void ordersReadyClick(){
        Merchant_Orders merchant_orders=new Merchant_Orders();
        Userpage userpage = new Userpage();
        Actions actions=new Actions(Driver.getDriver());
        loginMethods();
        ReusableMethods.wait(2);
        JSUtilities.scrollToElement(Driver.getDriver(),merchant_orders.thai);
        merchant_orders.thai.click();
        ReusableMethods.bekle(4);
        merchant_orders.cookieAccept.click();

        merchant_orders.firstMeal.click();
        merchant_orders.deliveryAddressTextBox.click();
        merchant_orders.deliveryAddressTextBox.sendKeys("USA");
        merchant_orders.usaOption.click();
        ReusableMethods.bekle(2);
        merchant_orders.firstMeal.click();
        merchant_orders.checkoutButton.click();
        ReusableMethods.bekle(3);
        merchant_orders.placeOrderButton.click();
        newOrdersButtonClick();
        orderListFirstMeal.click();
        acceptedButton.click();
        ordersProcessingButton.click();
        merchant_orders.orderListFirstMeal.click();
        merchant_orders.readyForPickupButton.click();
        merchant_orders.ordersReadyButton.click();
    }

































































































































































































































































































































































    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement userHomeFirstSignIn;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement userLoginPageUsername;

    @FindBy(xpath = "//*[text()='Password ']")
    public WebElement userLoginPagePassword;
    @FindBy(xpath = "(//*[text()='Sign in'])[2]")
    public WebElement userLoginPageSecondSignIn;

    public void loginMethods(){
        Merchant_Orders merchant_orders=new Merchant_Orders();
        Userpage userpage=new Userpage();
        Driver.getDriver().get(ConfigReader.getProperty("mealscenterUrl"));

        merchant_orders.userHomeFirstSignIn.click();
        merchant_orders.userLoginPageUsername.sendKeys("aysenuriye27@gmail.com");
        Object merchantOrders = new Merchant_Orders();
       // js.executeScript("arguments[0].scrollIntoView(true)", merchantOrders.userLoginPagePassword);
        ReusableMethods.wait(1);
        // merchant_orders.userLoginPagePassword.click();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB);
        actions.sendKeys("Aa123456").perform();

        merchant_orders.userLoginPageSecondSignIn.click();
    }
@FindBy(xpath = "//button[@class=\"btn-green btn normal mr-2 font13 mb-3 mb-xl-0\"]")
public WebElement newOrdersAccept;
    @FindBy(xpath = "//h5[@class='head m-0']")
    public WebElement comp_Comp_text;
    @FindBy(xpath = "//h5[.='Summary']")
    public WebElement comp_genel;
    @FindBy(xpath = "//a[@href=\"/backoffice/orders/processing\"]")
    public  WebElement order_ProcessingButton;
    @FindBy(xpath = "//a[normalize-space()='Orders Ready']")
    public WebElement orde_OrdersReady_button;
    @FindBy(xpath = "//button[@class='btn-yellow btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement orders_Ready_deliveredButton;












//Orders_Completed sayfası elementler aşağıda

@FindBy(xpath = "//button[text()='Print']")
public WebElement orders_CompletedPrintButton;
    @FindBy(xpath = "(//h5[@id=\"exampleModalLabel\"])[11]")
    public  WebElement orde_COm_Prin_Or;
    @FindBy(xpath = "(//button[@class=\"btn btn-black\"])[4]")
    public WebElement orders_Comp_Prin_Close;
@FindBy(xpath = "//a[@id='dropdownMenuLink']")
public  WebElement orders_CompletedTreeDots;
@FindBy(xpath = "//a[normalize-space()='Contact customer']")
public WebElement comp_Tre_First;
@FindBy(xpath = "//div[@class=\"bootbox-body\"]")
public WebElement Customer_Phone;
@FindBy(xpath = "//button[.='Okay']")
        public WebElement com_treeOkaybutton;
@FindBy (xpath = "//a[normalize-space()='Timeline']")
public WebElement com_tre_Time_;
@FindBy(xpath = "(//a[.='How to manage orders'])[2]")
public WebElement com_Howto_Link;
@FindBy(xpath = "//button[.='Close']")
public WebElement com_tre_close;
@FindBy(xpath = "(//p[@class='m-0'])[3]")
public  WebElement orders_CompletedHowtomanageordersText;
@FindBy(xpath = "//input[@type='search']")
public  WebElement orders_shearchText;
@FindBy (xpath = "//a[.='Clear']")
public WebElement or_CO_Shot_clearButton;
@FindBy (xpath = "//select[@title=\"Payment status\"]")
public WebElement orders_completedPaymentsStatusButton;
@FindBy(xpath = "//a[@href=\"https://www.google.com/maps/dir/?api=1&destination=47.6139854,-122.3171112&origin=37.09024,-95.712891\"]")
public WebElement ordes_completedGetdirectionButton;
@FindBy(xpath = "//h5[text()='Completed Today']")
public WebElement orders_CompletedCompletedtodayButton;
@FindBy (xpath = "//select[@title='Sort']")
public WebElement orders_CompletedShortButton;
@FindBy(xpath = "//div[text()='Order type']")
public WebElement orders_CompletedOrderTypeButton;
@FindBy(xpath = "//a[@id=\"bs-select-1-0\"]")
public WebElement order_type_button_first;
@FindBy(xpath = "//*[@id=\"bs-select-1-1\"]")

public WebElement  order_type_button_second;
@FindBy(xpath = "//a[@id=\"bs-select-1-2\"]")
public WebElement  order_type_button_third;

    @FindBy(xpath = "//a[@href='/backoffice/orders/completed']")
    public WebElement order_completedButonu;
    Attributes_Food attributesFood=new Attributes_Food();
    SignUp_Login_DashboardHomePage signUpLoginDashboardHomePage=new SignUp_Login_DashboardHomePage();

    public  void ordersLink(){
        SignUp_Login_DashboardHomePage signUpLoginDashboardHomePage=new SignUp_Login_DashboardHomePage();
        Attributes_Food attributesFood=new Attributes_Food();
       SignUp_Login_DashboardHomePage.loginMethod();
Merchant_Orders merchantOrders=new Merchant_Orders();
merchantOrders.ordersButton.click();


    }
    public  void ordersCompletedLink(){
        Merchant_Orders merchantOrders=new Merchant_Orders();
        merchantOrders.ordersLink();
        merchantOrders.order_completedButonu.click();
    }
    public void completedOrderFinish(){


        Merchant_Orders merchantOrders = new Merchant_Orders();

        merchantOrders.addOrderToCart();
        ReusableMethods.wait(5);
        merchantOrders.newOrdersButtonClick();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.wait(1);

        merchantOrders.newOrdersAccept.click();
        ReusableMethods.wait(1);
        merchantOrders.order_ProcessingButton.click();
        merchantOrders.newOrdersAccept.click();
        ReusableMethods.wait(1);
        merchantOrders.orde_OrdersReady_button.click();
        ReusableMethods.wait(1);
        merchantOrders.orders_Ready_deliveredButton.click();
        ReusableMethods.wait(1);
        merchantOrders.order_completedButonu.click();
    }



































//serife
    //  Dashboard/Orders Butonu
    @FindBy(xpath ="//li[@class='merchant_orders']")
    public   WebElement OrdersButonu;

    //Dashboard/Order/Scheduled
    @FindBy(xpath = "//a[normalize-space()='Scheduled']")
    public WebElement ScheduledButonu;

  //Dshboard/Order/Scheduled/Accepting Orders
  @FindBy(xpath ="div[@class='xd-none xd-lg-block']")
  public   WebElement AccestingOrdersButonu;

    //Dshboard/Order/Scheduled/Accepting Orders/Pause New Orders/15 min
    @FindBy(xpath ="//button[text()='15 min(s)']")
    public   WebElement MinuteButonu;

    //Dshboard/Order/Scheduled/Accepting Orders/next
    @FindBy(xpath ="(//button[@class='btn btn-green pl-4 pr-4'])[3]")
    public   WebElement nextButonu;

    //Dshboard/Order/Scheduled/Accepting Orders/Problem in restaurant
    @FindBy(xpath ="//a[@class='active text-center list-group-item list-group-item-action']")
    public   WebElement ProblemInRestaurant;

    //Dshboard/Order/Scheduled/Accepting Orders/Confirm
    @FindBy(xpath ="(//button[@class='btn btn-green pl-4 pr-4'])[3]")
    public   WebElement ConfirmButonu;


    //Dshboard/Order/Scheduled/Compled Today
    @FindBy(xpath ="//h5[@class='head m-0']")
    public   WebElement CompletedToday;

    //Dshboard/Order/Scheduled/Order type
    @FindBy(xpath ="//div[contains(text(),'Order type')]")
    public   WebElement OrderTypeButonu;


    //Dshboard/Order/Scheduled/Payment Status
    @FindBy(xpath ="//div[contains(text(),'Payment status')]")
    public   WebElement PaymentStatusButonu;


    //Dshboard/Order/Scheduled/Sort
    @FindBy(xpath ="//div[contains(text(),'Sort')]")
    public   WebElement SortButonu;


    //Dshboard/Order/Scheduled/SearchBox
    @FindBy(xpath ="//input[@class='form-control py-2 border-right-0 border']")
    public   WebElement SearchBoxButonu;

    //Dashboard/Orders/Scheduled/Accept Butonu
    @FindBy(xpath ="//button[@class='btn-green btn normal mr-2 font13 mb-3 mb-xl-0']")
    public   WebElement AcceptButonu;
    //Dashboard/Orders/Scheduled/Reject Butonu
    @FindBy(xpath ="//button[@class='btn-black btn normal mr-2 font13 mb-3 mb-xl-0']")
    public   WebElement RejectButonu;


    //Dshboard/Orders/Scheduled/Print
    @FindBy(xpath ="//button[@class='btn btn-black normal']")
    public   WebElement PrintButonu;


    //Dshboard/Orders/All Olders
    @FindBy(xpath ="//a[normalize-space()='All Orders']")
    public   WebElement AllOldersButonu;

    //Dshboard/Orders/All Olders/Older History
    @FindBy(xpath ="//h5[normalize-space()='Order history']")
    public   WebElement OlderHistoryButonu;

    //Dshboard/Orders/All Olders/Olders
    @FindBy(xpath ="(//div[@class='bg-light p-3 mb-3 rounded'])[1]")
    public   WebElement OldersButonu;

    //Dshboard/Orders/All Olders/Cancel
    @FindBy(xpath ="(//div[@class='bg-light p-3 mb-3 rounded'])[2]")
    public   WebElement CalcelsButonu;

    //Dshboard/Orders/All Olders/Total refund
    @FindBy(xpath ="(//div[@class='bg-light p-3 mb-3 rounded'])[3]")
    public   WebElement TotalRefundButonu;

    //Dshboard/Orders/All Olders/Total Orders
    @FindBy(xpath ="(//div[@class='bg-light p-3 mb-3 rounded'])[4]")
    public   WebElement TotalOldersButonu;

    //Dshboard/Orders/All Olders/DateBox
    @FindBy(xpath ="//input[@placeholder='Start date -- End date']")
    public   WebElement DateBoxButonu;

    //Dshboard/Orders/All Olders/DateBox/Last7Days
    @FindBy(xpath ="//li[normalize-space()='Last 7 Days']")
    public   WebElement Last7DaysButonu;

    //Dshboard/Orders/All Olders/Filters
    @FindBy(xpath ="//div[contains(text(),'Filters')]")
    public   WebElement FiltersButonu;

    //Dshboard/Orders/All Olders/Filters/By customer
    @FindBy(xpath ="(//span[@class='select2-selection select2-selection--single'])[1]")
    public   WebElement ByCustomerButonu;

    //Dshboard/Orders/All Olders/Filters/By Status
    @FindBy(xpath ="(//span[@class='select2-selection select2-selection--single'])[2]")
    public   WebElement ByStatusButonu;

    //Dshboard/Orders/All Olders/Filters/By Order Type
    @FindBy(xpath ="(//span[@class='select2-selection select2-selection--single'])[3]")
    public   WebElement ByOrderTypeButonu;

    //Dshboard/Orders/All Olders/Filters/Apply Filters
    @FindBy(xpath ="//button[@class='btn btn-green w-100']")
    public   WebElement ApplyFiltersButonu;

    //Dshboard/Orders/All Olders/Previous
    @FindBy(xpath ="//li[@id='DataTables_Table_0_previous']")
    public   WebElement PreviousButonu;

    //Dshboard/Orders/All Olders/Next
    @FindBy(xpath ="//li[@class='paginate_button page-item nextpaginate_button page-item next']")
    public   WebElement NextButonu;

    //Dshboard/Orders/All Olders/Actions
    @FindBy(xpath ="(//*[@class='sorting_disabled'])[4]")
    public   WebElement ActionsButonu;

    //Dshboard/Orders/All Olders/Actions/ekleme
    @FindBy(xpath ="//tbody/tr[1]/td[5]/div[1]/a[1]/i[1]")
    public   WebElement UpdateButonu;
@FindBy(xpath ="//input[@placeholder='Search']")
    public   WebElement UpdateMenuButonu;

    //Dshboard/Orders/All Olders/Actions/silme
    @FindBy(xpath ="//i[@class='zmdi zmdi-delete']")
    public   WebElement DeleteButonu;


    //Dshboard/Attributes
    @FindBy(xpath ="//a[text()='Attributes']")
    public   WebElement AttributesButonu;

    //Dshboard/Attributes/Size
    @FindBy(xpath ="//a[text()='Size']")
    public   WebElement SizeButonu;

    //Dshboard/Attributes/Size/Add new
    @FindBy(xpath ="//h5[@class='m-0']")
    public   WebElement AddNewButonu;

    //Dshboard/Attributes/Size/Searchbox
    @FindBy(xpath ="//input[@placeholder='Search']")
    public   WebElement SearchboxButonu;

    //Dshboard/Attributes/Size/Name
    @FindBy(xpath ="(//th[@class='sorting'])[1]")
    public   WebElement NameButonu;

    //Dshboard/Attributes/Size/Name yanindaki Asagi-yukarıisareti
    @FindBy(xpath ="//th[@aria-label='#: activate to sort column ascending']")
    public   WebElement AsagiYUkarıButonu;

    //Dshboard/Attributes/Size/müşteri ismi butonu
    @FindBy(xpath ="//a[@id='dropdownMenuLink']")
    public   WebElement MüşteriİsmiButonu;

    //Dshboard/Attributes/Size/müşteri ismi butonu/profil linki
    @FindBy(xpath ="//a[@class='dropdown-item']")
    public   WebElement ProfilButonu;

    //Dshboard/Attributes/Size/müşteri ismi/profil/Save butonu
    @FindBy(xpath ="//input[@name='yt0']")
    public   WebElement SaveButonu;

    //Dshboard/Attributes/Ingrediends/
    @FindBy(xpath ="//a[normalize-space()='Ingredients']")
    public   WebElement IngrediendsButonu;

    //Dshboard/Attributes/Cooking Reference
    @FindBy(xpath ="//a[normalize-space()='Cooking Reference']")
    public   WebElement CookingReferenceButonu;

    @FindBy(xpath ="(//select)[1]")
    public   WebElement ByCustomerSelect;
   @FindBy(xpath ="(//select)[2]")
    public   WebElement ByStatusSelect;
   @FindBy(xpath ="(//select)[3]")
    public   WebElement ByOrderTypeSelect;

@FindBy(xpath ="//button[@class='btn btn-green w-100']")
    public   WebElement ApplyButonu;


@FindBy(xpath ="//li[text()='Ayse Alcik']")
    public   WebElement AyseAlcikButonu;

@FindBy(xpath ="//*[text()='test test']")
    public   WebElement testTestButonu;
    @FindBy(xpath ="//a[@class='d-block chevron-section transaction-section d-flex align-items-center rounded mb-2']")
    public   WebElement deliveryButton;


    @FindBy(xpath ="//label[text()=' Schedule for later']")
    public   WebElement scheduledForLater;

    @FindBy(xpath ="//select[@class='form-control custom-select mb-3']")
    public   WebElement dateButton;

    @FindBy(xpath ="//select[@id='delivery_time']")
    public   WebElement timeButton;

    @FindBy(xpath ="(//button[@class='btn btn-green w-100'])[2]")
    public   WebElement orderSaveButton;

// JSUtilities.scrollToElement(Driver.getDriver(),merchant_orders.secondMeal);

    public void SelectByVisibleText(WebElement element,String text){
    Select select=new Select(element);
    select.selectByVisibleText(text);
}
public void scheduledPageOrders(){
    Merchant_Orders merchant_orders=new Merchant_Orders();
    Userpage userpage = new Userpage();
    Actions actions=new Actions(Driver.getDriver());
    loginMethods();
    ReusableMethods.wait(2);
    JSUtilities.scrollToElement(Driver.getDriver(),merchant_orders.thai);
    merchant_orders.thai.click();
    ReusableMethods.bekle(4);
    merchant_orders.cookieAccept.click();

    merchant_orders.firstMeal.click();
    merchant_orders.deliveryAddressTextBox.click();
    merchant_orders.deliveryAddressTextBox.sendKeys("USA");
    merchant_orders.usaOption.click();
    ReusableMethods.bekle(2);
    merchant_orders.firstMeal.click();
    merchant_orders.checkoutButton.click();
    merchant_orders.deliveryButton.click();
    merchant_orders.scheduledForLater.click();
    Select select =new Select(dateButton);
    select.selectByIndex(3);
    Select select2 =new Select(timeButton);
    select2.selectByIndex(2);
    merchant_orders.orderSaveButton.click();
    merchant_orders.placeOrderButton.click();
    SignUp_Login_DashboardHomePage.loginMethod();
    merchant_orders.ordersButton.click();
    merchant_orders.ScheduledButonu.click();
}













































































}
