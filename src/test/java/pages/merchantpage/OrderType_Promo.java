package pages.merchantpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrderType_Promo {

    public OrderType_Promo(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    Attributes_Food attributesFood=new Attributes_Food();
    SignUp_Login_DashboardHomePage signUpLoginDashboardHomePage=new SignUp_Login_DashboardHomePage();

    public  void ordersTypeLink(){
        SignUp_Login_DashboardHomePage signUpLoginDashboardHomePage = new SignUp_Login_DashboardHomePage();
        Attributes_Food attributesFood = new Attributes_Food();
        SignUp_Login_DashboardHomePage.loginMethod();
        DashbordorderTypeButton.click();

    }
    public void orderType_DeliveryButtonLink(){
        OrderType_Promo orderTypePromo=new OrderType_Promo();
        orderTypePromo.orderType_DeliveryButtonLink();
        Dashbords_orderType_DeliveryButton.click();


    }

    //**************************** Order Type --> Delivery  *******************************************
    @FindBy(xpath = "//a[text()='Order Type']")
    public WebElement DashbordorderTypeButton;
    @FindBy(xpath = "//a[text()='Delivery']")
    public WebElement Dashbords_orderType_DeliveryButton;

    //dashboard --> Order Type --> Delivery Settings --> Settings
    @FindBy(xpath = "(//li[@class='active'])[1]")
    public WebElement orderTypeDeliverySettings;

    //dashboard --> Order Type --> Delivery Settings --> Settings --> Enabled Opt in for no contact delivery
    @FindBy(xpath = "//label[@for='merchant_opt_contact_delivery']")
    public WebElement orderTypeDeliverySettingsEnabledOptionsInForNoContactDelivery;

    //dashboard --> Order Type --> Delivery Settings --> Settings --> Free Delivery On First Order
    @FindBy(xpath = "//label[@for='free_delivery_on_first_order']")
    public WebElement orderTypeDeliverySettingsFreeDeliveryOnFirstOrder;

    //dashboard --> Order Type --> Delivery Settings--> Settings --> Delivery Charge Type
    @FindBy(xpath = "//select[@class='form-control custom-select form-control-select merchant_delivery_charges_type']")
    public WebElement orderTypeDeliverySettingsDeliveryChargeType;

    //dashboard --> Order Type --> Delivery Settings --> Settings --> Delivery Charge Type --> Dynamic Rates
    @FindBy(xpath = "//option[@value='dynamic']")
    public WebElement orderTypeDeliverySettingsDeliveryChargeTypeDynamicRates;

    //dashboard --> Order Type --> Delivery Settings --> Settings --> Delivery Charge Type --> Fixed Charge
    @FindBy(xpath = "//option[@value='fixed']")
    public WebElement orderTypeDeliverySettingsDeliveryChargeTypeFixedCharge;

    //dashboard --> Order Type --> Delivery Settings--> Settings --> Delivery Charge Type --> Service Fee
    @FindBy(xpath = "//label[@for='AR_option_merchant_service_fee']")
    public WebElement orderTypeDeliverySettingsDeliveryChargeTypeServiceFee;

    //dashboard --> Order Type --> Delivery Settings--> Settings --> Save
    @FindBy(xpath = "//input[@value='Save']")
    public WebElement orderTypeDeliverySettingsSave;

    //dashboard --> Order Type --> Delivery Settings--> Settings --> Save --> Settings Saved Text
    @FindBy(xpath = "//*[@class='alert alert-success']")
    public WebElement orderTypeDeliverySettingsSaveText;

    //dashboard --> Order Type --> Delivery Settings--> Dynamic Rates
    @FindBy(xpath = "(//a[@href='/backoffice/services/charges_table'])[1]")
    public WebElement orderTypeDeliveryDynamicRates;

    //dashboard --> Order Type --> Delivery Settings--> Dynamic Rates --> Add new
    @FindBy(xpath = "//i[@class='zmdi zmdi-plus']")
    public WebElement orderTypeDeliveryDynamicRatesAddNew;

    //dashboard --> Order Type --> Delivery Settings--> Dynamic Rates --> Add new --> Shipping Type
    @FindBy(xpath = "//select[@id='AR_shipping_rate_shipping_type']")
    public WebElement orderTypeDeliveryDynamicRatesAddNewShippingType;

    //dashboard --> Order Type --> Delivery Settings--> Dynamic Rates --> Add new --> Shipping Type --> From
    @FindBy(xpath = "//input[@id='AR_shipping_rate_distance_from']")
    public WebElement orderTypeDeliveryDynamicRatesAddNewShippingTypeFrom;

    //dashboard --> Order Type --> Delivery Settings--> Dynamic Rates --> Add new --> Shipping Type --> To
    @FindBy(xpath = "/input[@id='AR_shipping_rate_distance_to']")
    public WebElement orderTypeDeliveryDynamicRatesAddNewShippingTypeTo;

    //dashboard --> Order Type --> Delivery Settings--> Dynamic Rates --> Add new --> Units --> Price
    @FindBy(xpath = "//label[@for='AR_shipping_rate_distance_price']")
    public WebElement orderTypeDeliveryDynamicRatesAddNewUnitsPrice;

    //dashboard --> Order Type --> Delivery Settings--> Dynamic Rates --> Add new --> Units --> Delivery estimation
    @FindBy(xpath = "//label[@for='AR_shipping_rate_estimation']")
    public WebElement orderTypeDeliveryDynamicRatesAddNewUnitsDeliveryEstimation;

    //dashboard --> Order Type --> Delivery Settings--> Dynamic Rates --> Add new --> Units --> Minimum Order
    @FindBy(xpath = "//label[@for='AR_shipping_rate_minimum_order']")
    public WebElement orderTypeDeliveryDynamicRatesAddNewUnitsMinimumOrder;

    //dashboard --> Order Type --> Delivery Settings--> Dynamic Rates --> Add new --> Units --> Maximum Order
    @FindBy(xpath = "//label[@for='AR_shipping_rate_maximum_order']")
    public WebElement orderTypeDeliveryDynamicRatesAddNewUnitsMaximumOrder;

    //dashboard --> Order Type --> Delivery Settings--> Dynamic Rates --> Add new --> Save
    @FindBy(xpath = "//input[@value='Save']")
    public WebElement orderTypeDeliveryDynamicRatesAddNewSave;

    //dashboard --> Order Type --> Delivery Settings--> Dynamic Rates --> Update Button
    @FindBy(xpath = "//i[@class='zmdi zmdi-border-color']")
    public WebElement orderTypeDeliveryDynamicRatesUpdateButton;

    //dashboard --> Order Type --> Delivery Settings--> Dynamic Rates --> Delete Button
    @FindBy(xpath = "(//a[@class='btn btn-light datatables_delete tool_tips'])[1]")
    public WebElement orderTypeDeliveryDynamicRatesDeleteButton;




    //**************************      Promo --> Coupon         ********************************************************

    //dashboard --> Promo
    @FindBy(xpath = "//a[normalize-space()='Promo']")
    public WebElement dashboardPromo;

    //dashboard --> Promo --> Coupon
    @FindBy(xpath = "//a[normalize-space()='Coupon']")
    public WebElement dashboardPromoCoupon;

    //dashboard --> Promo --> Coupon --> Search Box
    @FindBy(xpath = "//input[@type='search']")
    public WebElement promoCouponSearchBox;

    //dashboard --> Promo --> Coupon --> Add New
    @FindBy(xpath = "//i[@class='zmdi zmdi-plus']")
    public WebElement promoCouponAddNew;

    //dashboard --> Promo --> Coupon --> Add New --> Add Coupon --> Coupon name
    @FindBy(xpath = "//label[@for='AR_voucher_voucher_name']")
    public WebElement promoCouponAddNewAddCouponCouponName;

    //dashboard --> Promo --> Coupon --> Add New --> Add Coupon --> Coupon Type --> Fixed Amount
    @FindBy(xpath = "//select[@id='AR_voucher_voucher_type']")
    public WebElement promoCouponAddNewAddCouponCouponNameCouponTypeFixedAmount;

    //dashboard --> Promo --> Coupon --> Add New --> Add Coupon --> Amount
    @FindBy(xpath = "//input[@id='AR_voucher_amount']")
    public WebElement promoCouponAddNewAddCouponAmount;

    //dashboard --> Promo --> Coupon --> Add New --> Add Coupon --> Coupon Type --> Min order
    @FindBy(xpath = "//input[@id='AR_voucher_min_order']")
    public WebElement promoCouponAddNewAddCouponMinOrder;

    //dashboard --> Promo --> Coupon --> Add New --> Add Coupon --> Days Available
    @FindBy(xpath = "//span[@class='select2-search select2-search--inline']")
    public WebElement promoCouponAddNewAddCouponDaysAvailable;

    //dashboard --> Promo --> Coupon --> Add New --> Add Coupon --> Days Available --> Thursday
    @FindBy(xpath = "(//li[@class='select2-selection__rendered']")
    public WebElement promoCouponAddNewAddCouponDaysAvailableThursday;


    //dashboard --> Promo --> Coupon --> Add New --> Add Coupon --> Expiration day
    @FindBy(xpath = "(//td[@data-title='r1c5'])[1]")
    public WebElement promoCouponAddNewAddCouponExpirationDay;


    //dashboard --> Promo --> Coupon --> Add New --> Add Coupon --> Coupon Options
    @FindBy(xpath = "//select[@id='AR_voucher_used_once']")
    public WebElement promoCouponAddNewAddCouponCouponOptions;

    //dashboard --> Promo --> Coupon --> Add New --> Add Coupon --> Coupon Options --> 4. Options
    @FindBy(xpath = "//option[@value='4']")
    public WebElement promoCouponAddNewAddCouponCouponOptions4Options;

    //dashboard --> Promo --> Coupon --> Add New --> Add Coupon --> Status
    @FindBy(xpath = "//select[@id='AR_voucher_status']")
    public WebElement promoCouponAddNewAddCouponStatus;

    //dashboard --> Promo --> Coupon --> Add New --> Add Coupon --> Status --> Publish(value)
    @FindBy(xpath = "//option[@value='publish']")
    public WebElement promoCouponAddNewAddCouponStatusValue;

    //dashboard --> Promo --> Coupon --> Add New --> Add Coupon --> Save
    @FindBy(xpath = "//input[@value='Save']")
    public WebElement promoCouponAddNewAddCouponSave;

    //dashboard --> Promo --> Coupon --> Add New --> Entries
    @FindBy(xpath = "//div[@id='DataTables_Table_0_info']")
    public WebElement promoCouponAddNewEntries;

    //Showing 1 to 3 of 3 entries
    //Showing 1 to 2 of 2 entries



































}



