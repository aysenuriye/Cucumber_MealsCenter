package pages.adminpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class Adminpage2 {

    public static WebElement RayMerchantAddNew403;
    public WebElement errorMessage;


    public Adminpage2(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
public static void AdminGirisPaneli(){


    // --Browser başlatılır
    // --"https://qa.mealscenter.com/backoffice/login"
    Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

    Adminpage2 adminpage=new Adminpage2();

    //     --Geçerli username ve password ile sign in olunabilmeli
    adminpage.AdminUsername.sendKeys(ConfigReader.getProperty("adminInciUsername"));
    adminpage.AdminPassword.sendKeys(ConfigReader.getProperty("adminPassword"));
    adminpage.SigninButton.click();
}


    //AdminLogin --> (inci cakmak) --> Username TextBox
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement AdminUsername;

    //AdminLogin --> (inci cakmak) --> Password TextBox
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[2]")
    public WebElement AdminPassword;

    //AdminLogin --> (inci cakmak) -->Sign in Button
    @FindBy(xpath = "//input[@class='btn btn-green btn-full']")
    public WebElement SigninButton;

    //Dashboard --> (inci cakmak) -->Promo Button
    @FindBy(xpath = "//li[@class='promo']")
    public WebElement PromoButton;

    //Dashboard --> (inci cakmak) --> Promo Button --> Coupon Button
    @FindBy(xpath = "//a[text()='Coupon']")
    public WebElement CouponButton;

    //Dashboard --> (inci cakmak) -->Promo Button --> Coupon Button --> CoupunListText
    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement CoupunListText;

    //Dashboard --> (inci cakmak) -->Promo Button --> Coupon Button -->AddNew Button
    @FindBy(xpath = "//a[@class='btn btn-black btn-circle']")
    public WebElement CouponAddNewButton;

    //Dashboard --> (inci cakmak) -->Promo Button --> Coupon Button -->AddNew Button -->AddCouponText
    @FindBy(xpath = " //span[text()='Add Coupon']")
    public WebElement AddCouponText;


    //Dashboard -->(inci cakmak) --> Promo Button --> Coupon Button -->AddNew Button -->AddCouponText
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement AddCouponName;

    //Dashboard --> Promo Button --> Coupon Button -->Update Button
    @FindBy(xpath = " //tbody/tr[1]/td[4]/div[1]/a[1]/i[1]")
    public WebElement AddCouponUpdateButton;

    //Dashboard --> Promo Button --> Coupon Button -->Update Button-->Coupon Name
    @FindBy(xpath = "//label[@for='AR_voucher_voucher_name']")
    public WebElement AddCouponUpdateCouponName;
    //Dashboard --> Promo Button --> Coupon Button -->Update Button-->Update All CouponText
    @FindBy(xpath = "//a[normalize-space()='All Coupon']")
    public WebElement AddCouponUpdateAllCouponText;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->AddCouponNameType
    @FindBy(xpath = "(//select[@class='form-control custom-select form-control-select'])[1]")
    public WebElement AddCouponType;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->AddCouponAmount
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[2]")
    public WebElement AddCouponAmount ;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->AddCouponMinOrder
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[3]")
    public WebElement AddCouponMinOrder;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->AddCouponMinOrder
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[3]")
    public WebElement AddCoupon;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->AddCouponDaysAvalible
    @FindBy(xpath = "(//span[@class='select2-selection select2-selection--multiple'])[1]")
    public WebElement AddCouponDaysAvalible;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->AddCouponApplicabletomerchant
    @FindBy(xpath = "(//span[@class='select2-selection select2-selection--multiple'])[2]")
    public WebElement AddCouponApplicabletomerchant;


    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->AddCouponExpiration
    @FindBy(xpath = "//label[@for='AR_voucher_expiration']")
    public WebElement AddCouponExpiration;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->AddCouponExpirationRightButton
    @FindBy(xpath = "//label[@for='AR_voucher_expiration']")
    public WebElement AddCouponExpirationRightButton;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->AddCouponExpirationLeftButton
    @FindBy(xpath = "//th[@class='prev available']")
    public WebElement AddCouponExpirationLeftButton;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->AddCouponExpirationDaysButton
    @FindBy(xpath = "(//td[@class='available'])[1]")
    public WebElement AddCouponExpirationDaysButton;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->AddCouponCouponOptions
    @FindBy(xpath = "//select[@id='AR_voucher_used_once']")
    public WebElement AddCouponCouponOptions;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->AddCouponStatus
    @FindBy(xpath = "//select[@id='AR_voucher_status']")
    public WebElement AddCouponStatus;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->AddCouponSave
    @FindBy(xpath = " //input[@class='btn btn-green btn-full mt-3']")
    public WebElement AddCouponSave;


    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->DaysAvaible -->Monday
    @FindBy(xpath = "//li[@id='select2-AR_voucher_days_available-result-i49n-monday']")
    public WebElement AddCouponDaysAvalibleMonday;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->DaysAvaible -->Tuesday
    @FindBy(xpath = "(//li[@class='select2-results__option select2-results__option--selectable'])[2]")
    public WebElement AddCouponDaysAvalibleTuesday;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->DaysAvaible -->Wednasday
    @FindBy(xpath = "(//li[@class='select2-results__option select2-results__option--selectable'])[3]")
    public WebElement AddCouponDaysAvalibleWednasday;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->ApplicableToMerchant -->McDonals
    @FindBy(xpath = "(//li[@class='select2-results__option select2-results__option--selectable'])[1]")
    public WebElement AddCouponApplicableToMerchantMcDonals;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->ApplicableToMerchant -->Kosher Restaurant
    @FindBy(xpath = "(//li[@class='select2-results__option select2-results__option--selectable'])[4]")
    public WebElement AddCouponApplicableToMerchantKosher;
    //li[@data-select2-id='select2-data-164-yb6p']
//Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->ApplicableToMerchant -->Umi Sake Restaurant
    @FindBy(xpath = "(//li[@class='select2-results__option select2-results__option--selectable'])[6]")
    public WebElement AddCouponApplicableToMerchantUmi;

    //Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->Coupon Options-->Unlimited for all user
    @FindBy(xpath = "//option[text()='Unlimited for all user']")
    public WebElement AddCouponOptionUnlimitedforalluser;
    //option[text()='Once per user']
//Dashboard --> Promo Button --> Coupon Button -->AddNew Button -->Coupon Options-->Unlimited for all user
    @FindBy(xpath = "//option[text()='Unlimited for all user']")
    public WebElement AddCouponOptionOnceperuser;

    //Dashboard --> Promo Button --> Coupon Button -->Search
    @FindBy(xpath = "//input[@class='form-control rounded search w-25']")
    public WebElement PromoCoupunSearch;

    //Dashboard --> Promo Button --> Coupon Button -->Search Control
    @FindBy(xpath = "//button[@class='input-group-text border-0 ml-2 btn-black normal search_close']")
    public WebElement PromoCoupunSearchControl;

    //Dashboard --> Promo Button --> Coupon Button -->Search Button
    @FindBy(xpath = "//button[@class='submit input-group-text border-0 ml-2 normal']")
    public WebElement PromoCoupunSearchButton;
    //Dashboard --> Report Button
    @FindBy(xpath = "//li[@class='reports']")
    public WebElement ReportButton;

    //Dashboard --> Report Button --> Order earnings
    @FindBy(xpath = "//li[@class='position-relative reports_order_earnings']")
    public WebElement ReportOrderEarningsButton;

    //Dashboard --> Report Button--> Order earnings--> Order Earnings Text
    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement ReportOrderEarningsText;

    //Dashboard --> Report Button--> Order earnings--> All Report Visit
    @FindBy(xpath = "//div[@class='col-sm-12']")
    public WebElement ReportOrderEarningsAllReportVisit;

    //Dashboard --> Report Button--> Order earnings--> Search Button
    @FindBy(xpath = "//input[@class='form-control form-control-sm']")
    public WebElement ReportOrderEarningsSearchButton;

    //Dashboard --> Report Button--> Order earnings--> Count Text
    @FindBy(xpath = "(//div[@class='bg-light p-3 mb-3 rounded'])[1]")
    public WebElement ReportOrderEarningsCountText;

    //Dashboard --> Report Button--> Order earnings--> Meals Center earned Text
    @FindBy(xpath = "(//div[@class='bg-light p-3 mb-3 rounded'])[2]")
    public WebElement ReportOrderEarningsMealsCenterearnedText;

    //Dashboard --> Report Button--> Order earnings--> Merchant earned Text
    @FindBy(xpath = "(//div[@class='bg-light p-3 mb-3 rounded'])[3]")
    public WebElement ReportOrderEarningsMerchantearnedText;

    //Dashboard --> Report Button--> Order earnings--> Total Sell Text
    @FindBy(xpath = "(//div[@class='bg-light p-3 mb-3 rounded'])[4]")
    public WebElement ReportOrderEarningsTotalSellText;

    //Dashboard --> Report Button--> Order earnings--> Start Date--End Date
    @FindBy(xpath = "//input[@class='form-control py-2 border-right-0 border']")
    public WebElement ReportOrderEarningsStartDateEndDate;

    //Dashboard --> Report Button--> Order earnings--> Start Date--End Date--> Custom Range
    @FindBy(xpath = "//li[@data-range-key='Custom Range']")
    public WebElement ReportOrderEarningsStartEndCustomRange;

    //Dashboard --> Report Button--> Order earnings--> Start Date--End Date--> Last Month
    @FindBy(xpath = "//li[@data-range-key='Last Month']")
    public WebElement ReportOrderEarningsStartEndLastMonth;

    //Dashboard --> Report Button--> Order earnings--> OrderID
    @FindBy(xpath = "//th[@class='sorting']")
    public WebElement ReportOrderEarningsOrderIDButton;

    //Dashboard --> Report Button--> Order earnings--> OrderID-->First
    @FindBy(xpath = "//a[text()='10246']")
    public WebElement ReportOrderEarningsOrderIDFirst;

    //Dashboard --> Report Button--> Order earnings--> OrderID-->Second
    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement ReportOrderEarningsOrderIDSecond;
    //tr[@class='odd']
    //Dashboard --> Report Button--> Order earnings--> OrderID-->Satir Table
    @FindBy(xpath = "(//tr[@class='odd'])[2]")
    public WebElement ReportOrderEarningsOrderSatirTable;

    //Dashboard --> Report Button--> Order earnings--> OrderID-->SUbtotal-->First
    @FindBy(xpath = "(//td[@class='text-right sorting_1'])[1]")
    public WebElement ReportOrderEarningsSubtotalFirst;

    //Dashboard --> Report Button--> Order earnings--> OrderID-->SUbtotal-->Second
    @FindBy(xpath = "(//td[@class='text-right sorting_1'])[1]")
    public WebElement ReportOrderEarningsSubtotalSecond;

    //Dashboard --> Report Button--> Order earnings--> SUbtotalButton
    @FindBy(xpath = "(//th[@aria-controls='DataTables_Table_0'])[2]")
    public WebElement ReportOrderEarningsSubtotalButton;

    //Dashboard --> Report Button--> Order earnings-->Total Button
    @FindBy(xpath = "(//th[@aria-controls='DataTables_Table_0'])[3]")
    public WebElement ReportOrderEarningsTotalButton;

    //Dashboard --> Report Button--> Order earnings--> Merchant Earnings Button
    @FindBy(xpath = "(//th[@aria-controls='DataTables_Table_0'])[4]")
    public WebElement ReportOrderEarningsMerchantEarningButton;

    //Dashboard --> Report Button--> Order earnings--> Admin Commission Button
    @FindBy(xpath = "(//th[@aria-controls='DataTables_Table_0'])[5]")
    public WebElement ReportOrderEarningsAdminCommissionButton;

    //Dashboard --> Report Button--> Order earnings-->  Total First
    @FindBy(xpath = "//td[normalize-space()='1994.30$']")
    public WebElement ReportOrderEarningsTotalFirst;

    //Dashboard --> Report Button--> Order earnings-->  Total Second
    @FindBy(xpath = "//td[contains(@class,'text-right sorting_1')][normalize-space()='5.29$']")
    public WebElement ReportOrderEarningsTotalSecond;

    //Dashboard --> Report Button--> Order earnings--> OrderID--> Merchant Earnings First
    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public WebElement ReportOrderEarningsMerchantEarningsFirst;

    //Dashboard --> Report Button--> Order earnings--> Merchant Earnings Second
    @FindBy(xpath = "//td[normalize-space()='-4.71$']")
    public WebElement ReportOrderEarningsMerchantEarningsSecond;

    //Dashboard --> Report Button--> Order earnings--> OrderID-->Admin Commission First
    @FindBy(xpath = "//tbody/tr[10]/td[5]")
    public WebElement ReportOrderEarningsAdminCommissionFirst;

    //Dashboard --> Report Button--> Order earnings--> Merchant Earnings Second
    @FindBy(xpath = "//td[normalize-space()='1.28$']")
    public WebElement ReportOrderEarningsAdminCommissionSecond;

    //Dashboard --> Report Button--> Merchant Sales
    @FindBy(xpath = "//a[normalize-space()='Merchant Sales']")
    public WebElement ReportMerchantSales;

    //Dashboard --> Report Button--> Merchant Sales -->Merchant Sales Report
    @FindBy(xpath = "//a[normalize-space()='Merchant Sales']")
    public WebElement ReportMerchantSalesReportText;

    //Dashboard --> Report Button--> Merchant Sales -->Merchant Sales Report List
    @FindBy(xpath = "//div[@class='col-sm-12']")
    public WebElement ReportMerchantSalesReportList;

    //Dashboard --> Report Button--> Merchant Sales -->Merchant Sales Report Start Date -- End Date
    @FindBy(xpath = "//input[@placeholder='Start date -- End date']")
    public WebElement ReportMerchantSalesStartEndDate;

    //Dashboard --> Report Button--> Merchant Sales -->Start Date -- End Date Control
    @FindBy(xpath = "//div[@class='nicescroll-rails nicescroll-rails-vr']")
    public WebElement ReportMerchantSalesStartEndDateControl;

    //Dashboard --> Report Button--> Merchant Sales -->Start Date -- End Date Control-->Last 30 Days
    @FindBy(xpath = "//li[normalize-space()='Last 30 Days']")
    public WebElement ReportMerchantSalesStartEndDateLast30Days;

    //Dashboard --> Report Button--> Merchant Sales -->Start Date -- End Date Control-->Last 30 Days-->Attibute
    @FindBy(xpath = "//input[@class='form-control py-2 border-right-0 border']")
    public WebElement ReportMerchantSalesStartEndDateLast30DaysFirst;

    //Dashboard --> Report Button--> Merchant Sales --> Order ID First
    @FindBy(xpath = "//td[normalize-space()='10710']")
    public WebElement ReportMerchantSalesOrderIDFirst;

    //Dashboard --> Report Button--> Merchant Sales --> Order ID Second
    @FindBy(xpath = " //td[normalize-space()='10000']")
    public WebElement ReportMerchantSalesOrderIDSecond;
    //td[normalize-space()='10000']
    //Dashboard --> Report Button--> Merchant Sales --> Order ID Button
    @FindBy(xpath = "//th[@aria-label='Order ID: activate to sort column ascending']")
    public WebElement ReportMerchantSalesOrderIDButton;

    //Dashboard --> Report Button--> Merchant Sales -->Start Date -- End Date -->Today
    @FindBy(xpath = "//li[@class='active']")
    public WebElement ReportMerchantSalesStartEndDateToday;

    //li[@data-range-key='Yesterday']
    //Dashboard --> Report Button--> Merchant Sales --> Start Date --End Date --> YESTERDAY First
    @FindBy(xpath = "//input[@placeholder='Start date -- End date']")
    public WebElement ReportMerchantSalesYesterdayFirst;

    //Dashboard --> Report Button--> Merchant Sales -->Start Date -- End Date -->Yestarday Second
    @FindBy(xpath = "//input[@placeholder='Start date -- End date']")
    public WebElement ReportMerchantSalesYesterdaySecond;
    //td[normalize-space()='10000']
    //Dashboard --> Report Button--> Merchant Sales -->Start Date -- End Date--> Yestarday Button
    @FindBy(xpath = "//li[@data-range-key='Yesterday']")
    public WebElement ReportMerchantSalesYesterdayButton;

    //Dashboard --> Promo Button--> Coupon -->Name Button
    @FindBy(xpath = "//th[@aria-label='Name: activate to sort column ascending']")
    public WebElement CouponNameButton;

    //Dashboard --> Promo Button--> Coupon -->Name Button , Used Button --> First text
    @FindBy(xpath = "//td[normalize-space()='197']")
    public WebElement CouponNameButtonFirstText;

    //Dashboard --> Promo Button--> Coupon -->Name Button, Used Button--> Second text
    @FindBy(xpath = "//td[normalize-space()='58']")
    public WebElement CouponNameButtonSecondText;

    //Dashboard --> Promo Button--> Coupon -->Used Button
    @FindBy(xpath = "//th[@aria-label='#Used: activate to sort column descending']")
    public WebElement CouponUsedButton;

    //Dashboard --> Promo Button--> Coupon -->Delete Button
    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/a[2]/i[1]")
    public WebElement CouponDeleteButton;

    //Dashboard --> Promo Button--> Coupon -->Delete FirstCoupon
    @FindBy(xpath = "(//p[text()='Voucher Type. fixed amount'])[1]")
    public WebElement CouponDeleteFirst;

    //Dashboard --> Promo Button--> Coupon -->Delete Second Coupon
    @FindBy(xpath = "(//p[text()='Voucher Type. fixed amount'])[2]")
    public WebElement CouponDeleteSecond;

    //Dashboard --> Promo Button--> Coupon -->Delete Confirmation Text
    @FindBy(xpath = "//h5[@class='modal-title']")
    public WebElement DeleteConfirmationText;

    //Dashboard --> Promo Button--> Coupon -->Delete Open Window Delete
    @FindBy(xpath = "//a[@class='btn btn-green item_delete']")
    public WebElement CouponDeleteOpenWindow;

    //Dashboard --> Promo Button--> Coupon -->Delete Open Window Delete Frame
    @FindBy(xpath = "//div[@class='modal-content']")
    public WebElement CouponDeleteOpenWindowFrame;

    //Dashboard --> Reports Button
    @FindBy(xpath = "//a[normalize-space()='Reports']")
    public WebElement ReportsButton;

    //Dashboard --> Reports Button -->Merchant Registration
    @FindBy(xpath = "//a[normalize-space()='Merchant Registration']")
    public WebElement ReportsMerchantRegistrationButton;

    //Dashboard --> Reports Button -->Merchant Registration Text
    @FindBy(xpath = "//h5[normalize-space()='Merchant Registration']")
    public WebElement ReportsMechantRegistrationText;

    //Dashboard --> Reports Button -->Merchant Registration Liste
    @FindBy(xpath = "//div[@class='main-container-wrap']")
    public WebElement ReportsMechantRegistrationListe;
//input[@placeholder='Start date -- End date']

    //Dashboard --> Reports Button -->Merchant Registration -->Start Date End Date Button
    @FindBy(xpath = "//input[@placeholder='Start date -- End date']")
    public WebElement ReportsMechantRegistrationStartEndDateButton;

    //Dashboard --> Reports Button -->Merchant Registration -->Start Date End Date Button-->Yestarday
    @FindBy(xpath = "//li[@data-range-key='Yesterday']")
    public WebElement ReportsMechantRegistrationStartEndDateButtonYestarday;

    //Dashboard --> Reports Button -->Merchant Registration -->Start Date End Date Button-->Previous 15
    @FindBy(xpath = "//a[normalize-space()='15']")
    public WebElement ReportsMechantRegistrationStartEndDateButtonControl;

    //Dashboard --> Reports Button -->Merchant Registration -->All Status Button
    @FindBy(xpath = "//div[@class='filter-option-inner-inner']")
    public WebElement ReportsMechantRegistrationAllStatusButton;

    //Dashboard --> Reports Button -->Merchant Registration -->All Status Button-->Active
    @FindBy(xpath = "//span[normalize-space()='active']")
    public WebElement ReportsMechantRegistrationAllStatusButtonActive;

    //Dashboard --> Reports Button -->Merchant Registration -->All Status Button-->Filteleme Button
    @FindBy(xpath = "//button[@class='ml-2 btn btn-yellow normal']")
    public WebElement ReportsMechantRegistrationAllStatusFiltelemeButton;

    //Dashboard --> Reports Button -->Merchant Registration -->All Status Button-->Filteleme By Merchant Button
    @FindBy(xpath = "//span[@role='combobox']")
    public WebElement ReportsMechantRegistrationAllStatusFiltelemeByMerchantButton;

    //Dashboard --> Reports Button -->Merchant Registration -->All Status Button-->Filteleme By Merchant Thai
    @FindBy(xpath = "(//li[@class='select2-results__option select2-results__option--selectable'])[1]")
    public WebElement ReportsMechantRegistrationAllStatusFiltelemeByMerchantThai;

    //Dashboard --> Reports Button -->Merchant Registration -->All Status Button-->Active Control
    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]")
    public WebElement ReportsMechantRegistrationAllStatusButtonActiveControl;

    //Dashboard --> Reports Button -->Merchant Registration -->All Status Button-->Filteleme By Merchant Apply Filters
    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement ReportsMechantRegistrationAllStatusFiltelemeByMerchantApplyFilters;

    //Dashboard --> Reports Button -->Merchant Registration -->All Status Button-->Filteleme Control
    @FindBy(xpath = "//p[normalize-space()='A101 harca harca bitmez']")
    public WebElement ReportsMechantRegistrationAllStatusFiltelemeControl;

    //Dashboard --> Reports Button -->Merchant Registration -->Total Registered
    @FindBy(xpath = "//p[normalize-space()='Total Registered']")
    public WebElement ReportsMechantRegistrationTotalRegistered;

    //Dashboard --> Reports Button -->Merchant Registration -->Commission Total
    @FindBy(xpath = "//p[normalize-space()='Commission Total']")
    public WebElement ReportsMechantRegistrationCommissionTotal;

    //Dashboard --> Reports Button -->Merchant Registration -->Membership Total
    @FindBy(xpath = "//p[normalize-space()='Membership Total']")
    public WebElement ReportsMechantRegistrationMembershipTotal;

    //Dashboard --> Reports Button -->Merchant Registration -->Total Active
    @FindBy(xpath = "//p[normalize-space()='Total Active']")
    public WebElement ReportsMechantRegistrationTotalActive;

    //Dashboard --> Reports Button -->Merchant Registration -->Total Inactive
    @FindBy(xpath = "//p[normalize-space()='Total Inactive']")
    public WebElement ReportsMechantRegistrationTotalInactive;

    //Dashboard --> Reports Button -->Merchant Registration -->Name Button
    @FindBy(xpath = "//th[@aria-label='Name: activate to sort column descending']")
    public WebElement ReportsMechantRegistrationNameButton;

    //Dashboard --> Reports Button -->Merchant Registration -->Name Button control
    @FindBy(xpath = "//p[normalize-space()='67899']")
    public WebElement ReportsMechantRegistrationNameButtonControl;

    //Dashboard --> Buyers Button -
    @FindBy(xpath = "//a[normalize-space()='Buyers']")
    public WebElement BuyersButton;

    //Dashboard --> Reports Button -->Customers Button
    @FindBy(xpath = "//a[normalize-space()='Customers']")
    public WebElement BuyersCustomersButton;

    //Dashboard --> Reports Button -->Customers Button-->Customer list Text
    @FindBy(xpath = "//h5[normalize-space()='Customer list']")
    public WebElement BuyersCustomersButtonCustomerListText;


    //Dashboard --> Reports Button -->Customers Button-->Customer list
    @FindBy(xpath = "//div[@class='container']")
    public WebElement BuyersCustomersButtonCustomerList;

    //Dashboard --> Reports Button -->Customers Button-->Name Button
    @FindBy(xpath = " //th[@aria-label='Name: activate to sort column ascending']")
    public WebElement BuyersCustomersNameButton;

    //Dashboard --> Reports Button -->Customers Button-->Name Button First
    @FindBy(xpath = "(//p[@class='dim'])[2]")
    public WebElement BuyersCustomersNameButtonFirst;

    //Dashboard --> Reports Button -->Customers Button-->Name Button Second
    @FindBy(xpath = "(//p[@class='dim'])[3]")
    public WebElement BuyersCustomersNameButtonSecond;

    //Dashboard --> Reports Button -->Customers Button-->Add NEW Button-->First name
    @FindBy(xpath = "//label[@for='AR_client_first_name']")
    public WebElement BuyersCustomersAddNewButtonFirstName;

    //Dashboard --> Reports Button -->Customers Button-->Add NEW Button
    @FindBy(xpath = "//a[@type='button']")
    public WebElement BuyersCustomersAddNewButton;

    //Dashboard --> Reports Button -->Customers Button-->Customers First
    @FindBy(xpath = "//h6[text()='JuttaNA Gorczany ']")
    public WebElement BuyersCustomersAddNewCustomersFirst;

    //Dashboard --> Reports Button -->Customers Button--> Update Button
    @FindBy(xpath = "(//a[@class='btn btn-light tool_tips'])[1]")
    public WebElement BuyersCustomersUpdateButton;

    //Dashboard --> Reports Button -->Customers Button--> Update Button-->First Name
    @FindBy(xpath = "//input[@id='AR_client_first_name']")
    public WebElement BuyersCustomersUpdateFirstNameButton;

    //Dashboard --> Reports Button -->Customers Button--> Update Button-->Update Control
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement BuyersCustomersUpdateControl;

    //Dashboard --> Reports Button -->Customers Button--> Delete Button
    @FindBy(xpath = "(//a[@class='btn btn-light datatables_delete tool_tips'])[1]")
    public WebElement BuyersCustomersDeleteButton;

    //Dashboard --> Reports Button -->Customers Button--> Delete Button-->Open Window Delete
    @FindBy(xpath = "//a[@class='btn btn-green item_delete']")
    public WebElement BuyersCustomersDeleteOpenWindowButton;

    //Dashboard --> Reports Button -->Customers Button--> Delete Control
    @FindBy(xpath = "(//p[@class='dim'])[2]")
    public WebElement BuyersCustomersDeleteControl;

    //Dashboard --> Reports Button -->Customers Button--> Search Button
    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement BuyersCustomersSearchButonu;

    //Dashboard --> Reports Button -->Customers Button--> Search Button Control
    @FindBy(xpath = "//td[@class='dataTables_empty']")
    public WebElement BuyersCustomersSearchButonuControl;

    //Dashboard --> Promo Button -->Coupon Button--> Add New Button -->Save Button
    @FindBy(xpath = "//input[@name='yt0']")
    public WebElement PromoCouponAddNewSaveButton;

    //Dashboard --> Promo Button -->Coupon Button--> Add New Button -->Expiration day Button
    @FindBy(xpath = "//td[@class='today available']")
    public WebElement PromoCouponAddNewExpirationButton;


}
