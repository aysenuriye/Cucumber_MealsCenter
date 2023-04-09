package pages.adminpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Adminpage {
    public Adminpage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //dashboard --> Total Sales
    @FindBy(xpath = "//div[@class='report-inner'])[1]")
    public WebElement dashboardTotalSalesAndValue;

    //dashboard --> Total Merchant
    @FindBy(xpath = "//div[@class='report-inner'])[2]")
    public WebElement dashboardTotalMerchant;

    //dashboard --> Total Commission
    @FindBy(xpath = "//div[@class='report-inner'])[3]")
    public WebElement dashboardTTotalCommission;

    //dashboard --> Total Subscriptions
    @FindBy(xpath = "//div[@class='report-inner'])[4]")
    public WebElement dashboardTTotalSubscriptions;

    //dashboard --> Commission This Week
    @FindBy(xpath = "(//h6[@class='m-0 position-relative'])[1]")
    public WebElement dashboardCommissionThisWeek;

    //dashboard --> Commission This Month
    @FindBy(xpath = "(//h6[@class='m-0 position-relative'])[2]")
    public WebElement dashboardCommissionThisMonth;

    //dashboard --> Subscriptions This Month
    @FindBy(xpath = "(//h6[@class='m-0 position-relative'])[3]")
    public WebElement dashboardSubscriptionsThisMonth;

    //dashboard --> Order Received
    @FindBy(xpath = "//h3[@class='mb-1 text-danger']")
    public WebElement dashboardOrderReceived;

    //dashboard -->Today Delivered
    @FindBy(xpath = "//h3[@class='mb-1 text-green']")
    public WebElement dashboardTodayDelivered;

    //dashboard --> New Costumer
    @FindBy(xpath = "//h3[@class='mb-1 text-violet']")
    public WebElement dashboardNewCustomer;

    //dashboard --> Total Refund
    @FindBy(xpath = "//h3[@class='mb-1 text-orange']")
    public WebElement dashboardTotalRefund;

    //dashboard --> Sales Overview
    @FindBy(xpath = "//*[@class='highcharts-background']")
    public WebElement dashboardSalesOverview;

    //dashboard --> Top Customers
    @FindBy(xpath = "(//table[@class='table'])[4]")
    public WebElement dashboardTopCustomers;

    //dashboard --> Overview Of Review
    @FindBy(xpath = "//h2[@class='font-medium mt-2 mb-0']")
    public WebElement dashboardOverviewOfReview;

    //dashboard --> Overview Of Review --> Checkout All Review
    @FindBy(xpath = "//a[@class='w-100 btn btn-lg btn-info waves-effect waves-light mb-3']")
    public WebElement dashboardCheckoutAllReview;

    //dashboard --> Overview Of Review --> Checkout All Review --> Review List
    @FindBy(xpath ="//div[@class='container']" )
    public WebElement dashboardCheckoutAllReviewReviewList;


    //dashboard --> Recent Payout
    @FindBy(xpath = "(//div[@class='card-body'])[14]")
    public WebElement dashboardRecentPayout;

    //dashboard --> Last orders --> All
    @FindBy(xpath = "(//a[@class='nav-link py-1 px-3'])[1]")
    public WebElement dashboardLastOrdersAll;

    //dashboard --> Last orders --> Processing
    @FindBy(xpath = "(//a[@class='nav-link py-1 px-3'])[2]")
    public WebElement dashboardLastOrdersProcessing;

    //dashboard --> Last orders --> Ready
    @FindBy(xpath = "(//a[@class='active nav-link py-1 px-3'])[1]")
    public WebElement dashboardLastOrdersReady;

    //dashboard --> Last orders --> Completed
    @FindBy(xpath = "(//a[@class='nav-link py-1 px-3'])[3]")
    public WebElement dashboardLastOrdersCompleted;

    //dashboard --> Popular Items --> Popular Items
    @FindBy(xpath = "(//a[@class='active nav-link py-1 px-3'])[2]")
    public WebElement dashboardPopularItems;

    //dashboard --> Popular Items --> Last 30 days sales
    @FindBy(xpath = "(//a[@class='nav-link py-1 px-3'])[4]")
    public WebElement dashboardLast30DaysSales;

    //dashboard --> Popular Items --> Last 30 days sales --> Graph
    @FindBy(xpath = "(//*[@class='highcharts-background'])[1]")
    public WebElement dashboardLast30DaysSalesGraph;

    //dashboard --> Popular Merchants --> Popular Merchants
    @FindBy(xpath = "(//a[@class='nav-link py-1 px-3'])[5]")
    public WebElement dashboardPopularMerchants;

    //dashboard --> Popular Merchants --> Popular By Review
    @FindBy(xpath = "(//a[@class='active nav-link py-1 px-3'])[3]")
    public WebElement dashboardPopularByReview;

    //login --> Username
    @FindBy (xpath = "//label[@for='LoginForm_username']")
    public WebElement loginUsername;

    //login --> Password
    @FindBy (xpath = "//label[@for='LoginForm_password']")
    public WebElement loginPassword;

    //login --> Sign In
    @FindBy(xpath = "//input[@class='btn btn-green btn-full']")
    public WebElement loginSignIn;

    //login --> Remember Me Checkbox
    @FindBy(xpath = "//label[@class='dim custom-control-label']")
    public WebElement loginRememberMeCheckbox;

    //label[@for='AR_merchant_login_rememberMe']

    //login --> Forgot Password
    @FindBy(xpath = "//a[@class='dim underline']")
    public WebElement loginForgotPassword;

    //dashboard --> Admin(Sumeyye Alakabak)
    @FindBy(xpath = "(//a[@id='dropdownMenuLink'])[1]")
    public WebElement dashboardAdmin;

    //dashboard --> Admin(Sumeyye Alakabak) --> Logout
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement dashboardAdminLogout;

    //login --> Forgot Password --> Email address
    @FindBy(xpath = "//label[@for='AR_AdminUser_email_address']")
    public WebElement loginForgotPasswordEmailAddress;

    //login --> Forgot Password --> Request Email
    @FindBy(xpath = "//input[@value='Request E-mail']")
    public WebElement loginForgotPasswordRequestEmail;

    //login --> Forgot Password --> "E-mail has been sent to your account." text
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement loginForgotPasswordEmailHasBeenSentToYourAccountText;

    //login --> Forgot Password --> Login here
    @FindBy(xpath = "//a[@class='dim underline']")
    public WebElement loginForgotPasswordLoginHere;

    //dashboard --> Last orders --> Table
    @FindBy(xpath = "//div[@class='mt-3 table-orders table-responsive']")
    public WebElement dashboardLastOrdersTable;

    //dashboard --> Popular Items --> Table
    @FindBy(xpath = "//div[@class='mt-3 table-item']")
    public WebElement dashboardPopularItemsTable;

    //dashboard --> Popular Merchants --> Table
    @FindBy(xpath = "//div[@class='mt-3 table-item table-responsive']")
    public WebElement dashboardPopularMerchantsTable;

    //dashboard --> Popular By Review --> Table
    @FindBy(xpath = "//div[@class='table-responsive-md']")
    public WebElement getDashboardPopularByReviewTable;

    //dashboard --> Overview Of Review --> Checkout All Review --> Review Table
    @FindBy(xpath ="//div[@class='table-responsive-md']" )
    public WebElement dashboardCheckoutAllReviewReviewTable;

























































    //Dashboard kategorisini içerir
    @FindBy(xpath = "//li[@class='admin_dashboard active']")
    public WebElement RayDashboardClick;

    //Dashboard-->>Merchant
    @FindBy(xpath = "//li[@class='merchant']")
    public WebElement RayMerchant;

    //Dashboard-->>Merchant-->>List
    @FindBy(xpath = "//li[@class='position-relative vendor_list']")
    public WebElement RayMerchantListClick;

    //Dashboard-->>Merchant-->>List-->>All Merchant
    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement RayAllMerchant;

    //Dashboard-->>Merchant-->>All Merchant-->>Add New
    @FindBy(xpath = "//a[@class='btn btn-black btn-circle']")
    public WebElement RayMerchantAllMerchantAddNew;

    //Dashboard-->>Merchant-->>All Merchant-->>Add New
    @FindBy(xpath = "//div[@class='container']")
    public WebElement RayMerchantAddNew403;

    ///Dashboard-->>Merchant-->>List-->>Edit
    @FindBy (xpath = "//i[@class='zmdi zmdi-border-color']")
    public WebElement RayMerchantListEdit;


    //Dashboard-->>Merchant-->>List-->>Edit/Jospeh Hill
    @FindBy(xpath = "//font[*=\"jospeh hilll\"]")
    public WebElement RayMerchantListEditJospehHill;


    //Dashboard-->>Merchant-->>List-->>Edit-->>Result Name/Clik
    @FindBy(xpath = "//label[@for=\"AR_merchant_restaurant_name\"]")
    public WebElement RayMerchantListEditResultNameClick;


    ////Dashboard-->>Merchant-->>List-->>Edit-->>Result Name/Write
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement RayMerchantListEditResultNameWrite;


    //Dashboard-->>Merchant-->>List-->>Edit-->>Result Slug/Click
    @FindBy(xpath = "//label[@for=\"AR_merchant_restaurant_slug\"]")
    public WebElement RayMerchantListEditResultSlug;

    //Dashboard-->>Merchant-->>List-->>Edit-->>Result Slug/Write
    @FindBy(xpath = "(//input[@class=\"form-control form-control-text\"])[2]")
    public WebElement RayMerchantListEditResultSlugWrite;


    //Dashboard-->>Merchant-->>List-->>Edit-->>Contact Name/Click
    @FindBy(xpath = "//label[@for=\"AR_merchant_contact_name\"]")
    public WebElement RayMerchantListEditContactNameClick;


    //Dashboard-->>Merchant-->>List-->>Edit-->>Contact Name/Write
    @FindBy(xpath = "(//input[@class=\"form-control form-control-text\"])[3]")
    public WebElement RayMerchantListEditContactWrite;


    //Dashboard-->>Merchant-->>List-->>Edit-->>Contact Phone/Click
    @FindBy(xpath = "//label[@for=\"AR_merchant_contact_phone\"]")
    public WebElement RayMerchantListEditContactPhoneClick;


    //Dashboard-->>Merchant-->>List-->>Edit-->>Contact Phone/Write
    @FindBy(xpath = "//input[@class=\"form-control form-control-text mask_mobile\"]")
    public WebElement RayMerchantListEditContactPhoneWrite;


    //Dashboard-->>Merchant-->>List-->>Edit-->>Contact email/Click
    @FindBy(xpath = "//label[@for=\"AR_merchant_contact_email\"]")
    public WebElement RayMerchantListEditContactEmailClick;

    //Dashboard-->>Merchant-->>List-->>Edit-->>Contact email/Write
    @FindBy(xpath = "(//input[@class=\"form-control form-control-text\"])[4]")
    public WebElement RayMerchantListEditContactEmailWrite;


    //Dashboard-->>Merchant-->>List-->>Edit-->Logo/Browse/Click ---------EROR
    @FindBy(xpath = "(//button[@type=\"button\"])[3]")
    public WebElement RayMerchantListEditLogoBrowseClick;


    //Dashboard-->>Merchant-->>List-->>Edit-->Header/Browse/Click -------EROR
    @FindBy(xpath = "(//button[@type=\\\"button\\\"])[8]\"")
    public WebElement RayMerchantListEditHeaderBrowseClick;


    //Dashboard-->>Merchant-->>List-->>About/Click-Write
    @FindBy(xpath = "//div[@class=\"note-editable card-block\"]")
    public WebElement RayMerchantListAboutClickWrite;


    //Dashboard-->>Merchant-->>List-->>Short About/Click-Write
    @FindBy(xpath = "//textarea[@class=\"form-control form-control-text textarea_min\"]")
    public WebElement RayMerchantListShortAboutClickWrite;

    //Dashboard-->>Merchant-->>List-->>Cuisine/Click
    @FindBy(xpath = "(//span[@class=\"select2-search select2-search--inline\"])[1]")
    public WebElement RayMerchantListCuisineClick;

    //Dashboard-->>Merchant-->>List-->>Cuisine/Click-Bugers
    @FindBy(xpath = "(//span[@class=\"select2-selection select2-selection--multiple\"])[1]")
    public WebElement RayMerchantListCuisineClickBugers;


    //Dashboard-->>Merchant-->>List-->>Services/Click
    @FindBy(xpath = "(//span[@class=\"select2-selection select2-selection--multiple\"])[2]")
    public WebElement RayMerchantListServicesClick;


    //Dashboard-->>Merchant-->>List-->>Services/Delivery-Click
    //@FindBy(xpath = "(//span[@class="select2-selection__choice__display"])[2]")
    public WebElement RayMerchantListServicesDeliveryClick;


    //Dashboard-->>Merchant-->>List-->>Services/Seçim /Deliveriy
    @FindBy(xpath = "//span[@class=\"select2-selection select2-selection--multiple\"]")
    public WebElement RayMerchantListServicesSecimDelivery;


    //Dashboard-->>Merchant-->>List-->>Tags-Click
    @FindBy(xpath = "(//span[@class=\"select2-selection select2-selection--multiple\"])[3]")
    public WebElement RayMerchantListTagsClick;

    //Dashboard-->>Merchant-->>List-->>Tags-Click
    @FindBy(xpath = "//span[@class=\"select2-selection select2-selection--multiple\"])[3]") //şüpheli
    public WebElement RayMerchantListTagsClickk;


    //Dashboard-->>Merchant-->>List-->>Tags/No Result
    @FindBy(xpath = "//li[@class=\"select2-results__option select2-results__message\"]")
    public WebElement RayMerchantListTagsNoResultClick;


    //Dashboard-->>Merchant-->>List-->>Featured
    @FindBy (xpath = "(//h6[@class=\"mb-4\"])[3]")
    public WebElement RayMerchantListFeatured;


    //Dashboard-->>Merchant-->>List-->>Featured-Click
    @FindBy(xpath = "(//span[@class=\"select2-selection select2-selection--multiple\"])[4]")
    public WebElement RayMerchantListFeaturedClick;


    //Dashboard-->>Merchant-->>List-->>Delivery Distance Covered
    @FindBy(xpath = "(//input[@class=\"form-control form-control-text\"])[5]")
    public WebElement RayMerchantListDeliveryDistanceCovered;


    //Dashboard-->>Merchant-->>List-->>Kilometres
    @FindBy(xpath = "(//select[@class=\"form-control custom-select form-control-select\"])[1]")
    public WebElement RayMerchantListKilometre;


    //Dashboard-->>Merchant-->>List-->>Published Merchant-Click
    @FindBy(xpath = "//label[@class=\"custom-control-label\"]")
    public WebElement RayMerchantListPublishedMerchantClick;

    //Dashboard-->>Merchant-->>List-->>Pending for approval-Click
    @FindBy(xpath = "(//select[@class=\"form-control custom-select form-control-select\"])[2]")
    public WebElement RayMerchantListPendingForApprovalClick;


    //Dashboard-->>Merchant-->>List-->>Save-Click
    @FindBy(xpath = "//input[@class=\"btn btn-green btn-full\"]")
    public WebElement RayMerchantListSaveClick;


    //Dashboard-->>Merchant-->>List-->>Delete-Soğansız Memenemen yemeyenler
    @FindBy(xpath = "//div[@class=\"btn-group btn-group-actions\"]")
    public WebElement RayMerchantListDeleteSogansizMenemenYemeyenler;


    //Dashboard-->>Merchant-->>List-->>Delete
    @FindBy(xpath = "(//tr[@class='odd'])[1]")
    public WebElement RayMerchantListDelete;


    //Dashboard-->>Merchant-->>List-->>Order-Click
    @FindBy(xpath = "(//a[@href=\"javascript:;\"])[2]")
    public WebElement RayMerchantListOrderClick;


    //Dashboard-->>Merchant-->>Order-->>All Order-Click
    @FindBy(xpath = "//a[@href=\"/backoffice/order/list\"]")
    public WebElement RayMerchantOrderAllOrderClick;


    //Dashboard-->>Merchant-->>Order-->>All Order-Click-Açıldığının doğrulanması
    @FindBy(xpath = "//a[@class=\"navbar-brand\"]")
    public WebElement RayMerchantOrderAllOrderClickAcildigininDogrulanmasi;


    //Dashboard-->>Merchant-->>Order-->>All Order/Filters-Click
    @FindBy(xpath = "//input[@class=\"form-control py-2 border-right-0 border\"]")
    public WebElement RayMerchantOrderAllOrderFiltersClick;


    //Dashboard-->>Merchant-->>Order-->>All Order/Filters/Last 7 Days-Click
    @FindBy(xpath = "//li[@*=\"Last 7 Days\"]")
    public WebElement RayMerchantOrderAllOrderFiltersLast7DaysClick;


    //Dashboard-->>Merchant-->>Order-->>All Order/Filters/ButtonClick
    @FindBy(xpath = "//button[@class='ml-2 btn btn-yellow normal']")
    public WebElement  RayMerchantOrderAllOrderFiltersButtonClick;


    //Dashboard-->>Merchant-->>Order-->>All Order/Filters-ByMerchant
    @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[1]")
    public WebElement RayMerchantOrderAllOrderFiltersByMerchant;

    //Dashboard-->>Merchant-->>Order-->>All Order/Filters-ByMerchant
    @FindBy(xpath = "(//span[@aria-readonly])[1]")
    public WebElement RayMerchantOrderAllOrderFiltersSubway;


    //(//span[@aria-readonly])[1]

    //(//span[@class="select2-selection select2-selection--single"])[1]


    //Dashboard-->>Merchant-->>Order-->>All Order/Filters-ByMerchant-McDonals
    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[1]")
    public WebElement DashboardMerchantOrderAllOrderFiltersByMerchantMcDonals;









    //Dashboard-->>Merchant-->>Order-->>All Order/Filters-ByCustomer
    @FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[2]")
    public WebElement RayMerchantOrderAllOrderFiltersByCustomer;


    //Dashboard-->>Merchant-->>Order-->>All Order/Filters-ByStatus
    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[3]")
    public WebElement RayMerchantOrderAllOrderFiltersByStatus;

    //Dashboard-->>Merchant-->>Order-->>All Order/Filters-By Order Typee
    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[4]")
    public WebElement RayMerchantOrderAllOrderFiltersByOrderType;


    //Dashboard-->>Merchant-->>Order-->>All Order/Filters-Aplly Filters
    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement RayMerchantOrderAllOrderFiltersApllyFilters;


    //Dashboard-->>Merchant-->>Order-->>All Order/OrderID
    @FindBy(xpath = "//th[@class='sorting sorting_desc']") //buradayız
    public WebElement RayMerchantOrderAllOrderOrderIDClick;


    //Dashboard-->>Merchant-->>Order-->>All Order/Listedekilerden birini seç
    @FindBy(xpath = "(//tr[@class=\"even\"])[1]")
    public WebElement RayMerchantOrderAllOrderListedekilerdenBiriniSec;


    //Dashboard-->>Merchant-->>Order-->>All Order/Görülebilir olduğu
    @FindBy(xpath = "//i[@*=\"zmdi zmdi-eye\"]")
    public WebElement RayMerchantOrderAllOrderGörülebilirOldugu;

/*
    //Dashboard-->>Merchant-->>Order-->>All Order/İndirilebilir olduğu
    @FindBy (xpath = "(//i[@class=\"zmdi zmdi-download\"])[2]")
    public WebElement RayMerchantOrderAllOrderİndirilebilirOlduguClick;

 */



    //Dashboard-->>Merchant-->>Order-->>All Order/İndirilebilir olduğu
    @FindBy (xpath = "(//a[@class='dropdown-item'])[7]")
    public WebElement RayMerchantOrderAllOrderİndirilebilirOlduguClick;
























































































































































































































































    // Dashboard --> Earnings
    @FindBy(xpath = "//li[@class='admin_earnings']")
    public WebElement dashboardEarnings;


    // Dashboard-->Earnings-->MerchantEarnings
    @FindBy(xpath = "(//ul[@class='sidebar-nav-sub-menu'])[3]")
    public WebElement dashboardMerchantEarnings;

    // Dashboard-->Earnings-->MerchantEarnings-->MerchantEarnings yazısı
    @FindBy (xpath = "//a[@class='navbar-brand']")
    public WebElement MerchantEarningsText;

    // Dashboard-->Earnings-->MerchantEarnings-->CreateaTransaction
    @FindBy (id = "dropdownMenuButton")
    public WebElement CreateaTransactionButton;

    // Dashboard-->Earnings-->MerchantEarnings-->CreateaTransaction-->Adjustment
    @FindBy(xpath = "(//a[@class='dropdown-item'])[5]")
    public WebElement AdjustmentSubtab;

    // Dashboard-->Earnings-->MerchantEarnings-->CreateaTransaction-->Adjustment
    @FindBy (xpath = "(//h5[@class='modal-title'])[2]")
    public WebElement CreateadjustmentText;

    // Dashboard-->Earnings-->MerchantEarnings-->CreateaTransaction-->Adjustment
    @FindBy(xpath = "//span[@class='select2-selection select2-selection--single']")
    public WebElement CreateadjustmentMerchant;

    @FindBy (xpath = "//li[@class='select2-results__option select2-results__option--selectable']")
    public WebElement CreateadjustmentMerchantBaiTong;

    // Dashboard-->Earnings-->MerchantEarnings-->CreateaTransaction-->Adjustment
    @FindBy (xpath = "//input[@type='text']")
    public WebElement TransactionDescriptionBox;

    // Dashboard-->Earnings-->MerchantEarnings-->CreateaTransaction-->Adjustment
    @FindBy (xpath = "//select[@class='form-control custom-select form-control-select mb-3']")
    public WebElement CreditandDebitBox;
    // Dashboard-->Earnings-->MerchantEarnings-->CreateaTransaction-->Adjustment
    @FindBy (xpath = "(//option[@value='credit'])[2]")
    public WebElement CreditButton;
    // Dashboard-->Earnings-->MerchantEarnings-->CreateaTransaction-->Adjustment
    @FindBy (xpath = "(//option[@value='debit'])[2]")
    public WebElement DebitButton;
    // Dashboard-->Earnings-->MerchantEarnings-->CreateaTransaction-->Adjustment
    @FindBy (xpath = "(//input[@type='text'])[2]")
    public WebElement AmountBox;
    // Dashboard-->Earnings-->MerchantEarnings-->CreateaTransaction-->Adjustment
    @FindBy (xpath = "//button[@class='btn btn-green pl-4 pr-4']")
    public WebElement SubmitButton;
    // Dashboard-->Earnings-->MerchantEarnings-->CreateaTransaction-->Adjustment
    @FindBy(xpath = "//button[@class='btn btn-black']")
    public WebElement CloseButton;
    // Dashboard-->Earnings-->MerchantEarnings
    @FindBy (xpath = "//th['sorting_disabled sorting_desc']")
    public WebElement MerchantButton;

    // Dashboard-->Earnings-->MerchantEarnings
    @FindBy(xpath = "//th[@class='sorting']")
    public WebElement BalanceButton;

    // Dashboard-->Earnings-->MerchantEarnings
    @FindBy (xpath = "(//i[@class='zmdi zmdi-eye'])[1]")
    public WebElement FirstActionsButton;

    // Dashboard-->Earnings-->MerchantEarnings-->actions
    @FindBy (xpath = "(//h6[text()='Merchant Info'])[1]")
    public WebElement MerchantInfoText;

    // Dashboard-->Earnings-->MerchantEarnings-->ActionsButton
    @FindBy (xpath = "//input[@class='form-control py-2 border-right-0 border']")
    public WebElement StartdateEnddateBox;

    // Dashboard-->Earnings-->MerchantEarnings-->ActionsButton
    @FindBy(xpath = "//li[@data-range-key='Today']")
    public WebElement StartdateEnddateTodayBox;

    // Dashboard-->Earnings-->MerchantEarnings-->ActionsButton
    @FindBy (xpath = "//li[@data-range-key='Yesterday']")
    public  WebElement StartdateEnddateYesterdayBox;

    // Dashboard-->Earnings-->MerchantEarnings-->ActionsButton
    @FindBy (xpath = "//li[@data-range-key='Last 7 Days']")
    public WebElement StartdateEnddateLast7DaysBox;

    // Dashboard-->Earnings-->MerchantEarnings-->ActionsButton
    @FindBy (xpath = "//li[@data-range-key='Last 30 Days']")
    public WebElement StartdateEnddateLast30DaysBox;

    // Dashboard-->Earnings-->MerchantEarnings-->ActionsButton
    @FindBy (xpath = "//li[@data-range-key='This Month']")
    public WebElement  StartdateEnddateThisMonthBox;

    // Dashboard-->Earnings-->MerchantEarnings-->ActionsButton
    @FindBy (xpath = "//li[@data-range-key='Last Month']")
    public WebElement StartdateEnddateLastMonthBox;

    // Dashboard-->Earnings-->MerchantEarnings-->ActionsButton
    @FindBy (xpath = "(//td[@class='available'])[1]")
    public WebElement calendardayoption;

    // Dashboard-->Earnings-->MerchantEarnings-->ActionsButton
    @FindBy (xpath = "//div[@class='filter-option-inner-inner']")
    public  WebElement Alltransactionsbox;

    // Dashboard-->Earnings-->MerchantEarnings-->ActionsButton
    @FindBy(xpath = "(//a[@role='option'])[1]")
    public WebElement AlltransactionsCredit;

    // Dashboard-->Earnings-->MerchantEarnings-->ActionsButton
    @FindBy(xpath = "(//a[@role='option'])[2]")
    public WebElement AlltransactionsDebit;

    // Dashboard-->Earnings-->MerchantEarnings-->ActionsButton
    @FindBy(xpath = "(//a[@role='option'])[3]")
    public WebElement AlltransactionsPayout;

    // Dashboard-->Earnings-->MerchantEarnings-->ActionsButton
    @FindBy(xpath = "(//a[@role='option'])[4]")
    public WebElement AlltransactionsCashin;

    // Dashboard-->Earnings-->MerchantEarnings-->ActionsButton
    @FindBy (xpath = "(//div[@class='dataTables_info'])[2]")
    public WebElement searchresulttext;

    // Dashboard-->Earnings-->MerchantEarnings-->ActionsButton
    @FindBy (xpath = "//span[@aria-hidden='true']")
    public WebElement ActionsPageCloseButton;

    // Dashboard-->Earnings-->MerchantEarnings
    @FindBy (xpath = "(//div[@class='col-sm-12 col-md-6'])[2]")
    public WebElement MerchantEarningsSearchBox;

    // Dashboard-->Earnings-->MerchantEarnings
    @FindBy(xpath = "(//a[@class='page-link'])[3]")
    public WebElement MerchantEarningsNextButton;

    // Dashboard-->Earnings-->MerchantEarnings
    @FindBy (xpath = "(//a[@class='page-link'])[1]")
    public WebElement MerchantEarningsPreviousButton;

    // Dashboard-->Buyers
    @FindBy (xpath ="//li[@class='buyer']" )
    public  WebElement DashboardBuyersTab;

    // Dashboard-->Buyers-->Review
    @FindBy (xpath = "//li[@class='position-relative buyer_review_list']")
    public WebElement DashboardBuyersReviewTab;
    // Dashboard-->Buyers
    @FindBy (xpath = "//a[text()='Customers']")
    public WebElement DashboardBuyersCustomers;

    // Dashboard-->Buyers-->Review
    @FindBy (xpath = "//a[@class='navbar-brand']")
    public WebElement ReviewText;

    // Dashboard-->Buyers-->Review
    @FindBy (xpath = "//input[@placeholder='Search']")
    public WebElement ReviewSearchBox;

    // Dashboard-->Buyers-->Review
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement ReviewSearchBoxClick;

    // Dashboard-->Buyers-->Review
    @FindBy (xpath = "//div[@class='dataTables_info']")
    public WebElement ReviewSearchResult;

    // Dashboard-->Buyers-->Review-->UpdateButton
    @FindBy (xpath = "(//i[@class='zmdi zmdi-border-color'])[1]")
    public WebElement ReviewUpdateButton;

    // Dashboard-->Buyers-->Review-->UpdateButton
    @FindBy (xpath = "//div[@class='breadcrumbs']")
    public WebElement AllReviewUpdateReviewText;

    // Dashboard-->Buyers-->Review-->UpdateButton
    @FindBy(xpath = "//textarea[@class='form-control form-control-text']")
    public WebElement ReviewUpdateCustomerReviewsBox;

    // Dashboard-->Buyers-->Review-->UpdateButton
    @FindBy(xpath = "//label[@class='required']")
    public WebElement  ReviewUpdateratingsBox;

    // Dashboard-->Buyers-->Review-->UpdateButton
    @FindBy (xpath = "//select[@class='form-control custom-select form-control-select']")
    public  WebElement  ReviewUpdateStatusBox;

    // Dashboard-->Buyers-->Review-->UpdateButton
    @FindBy (xpath = "//option[@value='draft']")
    public WebElement  ReviewUpdateStatusdraft;

    // Dashboard-->Buyers-->Review-->UpdateButton
    @FindBy (xpath = "//option[@value='pending']")
    public  WebElement ReviewUpdateStatusPendingReview;

    // Dashboard-->Buyers-->Review-->UpdateButton
    @FindBy (xpath = "//option[@value='publish']")
     public WebElement ReviewUpdateStatuspublish;

    // Dashboard-->Buyers-->Review-->UpdateButton
    @FindBy (xpath = "//input[@class='btn btn-green btn-full mt-3']")
    public WebElement  ReviewUpdateSaveButton;

    @FindBy (xpath = "//div[@class='alert alert-success']")
    public WebElement ReviewSuccesfullyupdatedText;

    // Dashboard-->Buyers-->Review-->DeleteButton
    @FindBy (xpath = "(//i[@class='zmdi zmdi-delete'])[1]")
    public WebElement ReviewDeleteButton;

    // Dashboard-->Buyers-->Review-->DeleteButton
    @FindBy(xpath = "//a[@class='btn btn-green item_delete']")
    public WebElement ReviewDeleteConfirmationDelete;

    // Dashboard-->Buyers-->Review-->DeleteButton
    @FindBy (xpath = "//button[@class='btn']")
    public WebElement ReviewDeleteConfirmationCancel;

    // Dashboard-->Buyers-->Review
    @FindBy (xpath = "(//th[@class='sorting'])[2]")
    public WebElement ReviewMerchantButton;

    // Dashboard-->Buyers-->Review
    @FindBy (xpath = "(//th[@class='sorting'])[3]")
    public WebElement ReviewReviewButton;

    // Dashboard-->Buyers-->Review-->
    @FindBy (xpath = "(//th[@class='sorting'])[4]")
    public WebElement ReviewActionsButton;

    @FindBy (xpath = "(//td[text()='7-Eleven'])[1]")
    public WebElement SevenElevenText;

    @FindBy (xpath = "(//td[text()='Burger King'])[1]")
    public WebElement BurgerKingText;

    @FindBy (xpath = "(//b[text()='2374.00$'])[1]")
    public WebElement BalanceBurgerKing;

    @FindBy (xpath = "(//b[text()='-50.00$'])[1]")
    public WebElement BalanceSevenEleven;



}
