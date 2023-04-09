package pages.homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import java.util.Set;

public class Homepage {

    public Homepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //METHODS

    public static void loginSite(){
        Driver.getDriver().get(ConfigReader.getProperty("mealscenterUrl"));
    }

    public static String cousinMethod(){

        return "//*[@class='col cuisineMainPage']";
    }

    public static void scroolToButtom(){
        Driver.getDriver().get(ConfigReader.getProperty("mealscenterUrl"));
        JSUtilities.scrollToBottom(Driver.getDriver());
    }
    public void contactUs(){
        Driver.getDriver().get(ConfigReader.getProperty("mealscenterUrl"));
        JSUtilities.scrollToBottom(Driver.getDriver());
        JSUtilities.clickWithJS(Driver.getDriver(),contactusLink);
    }

    public static void switchToWindow(){
        Set<String> tumSayfalarWHDSeti= Driver.getDriver().getWindowHandles();
        String ilkSayfaWHD = Driver.getDriver().getWindowHandle();
        String ikinciSayfaWHD="";
        for (String each: tumSayfalarWHDSeti
        ) {
            if (!each.equals(ilkSayfaWHD)){
                ikinciSayfaWHD=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWHD);
    }

    public static String popularNearbyMethod(){
        return "//*[@class='mt-5 mb-5']";
    }

    public void enterenAddressMethod(){
        // click on the “Enter delivery” text box
        enterDeliveryAddresTextBox.click();
        // Enter the location and choose the address
        enterDeliveryAddresTextBox.sendKeys(ConfigReader.getProperty("deliveryAddress"));
        ReusableMethods.waitForClickablility(enteredAdress,5);
        enteredAdress.click();

    }


    // HEADER SECTİON

    @FindBy(xpath = "//*[text()='Decline']")
    public WebElement cookiesDecliner;
    // Meals Center logo on left up
    @FindBy(xpath = " (//*[@class='img-200'])[1]")
    public WebElement headerMealsCenterLogo;

    // Cart link on homepage
    @FindBy(xpath = " //*[text()=' Cart ']")
    public WebElement headerCartLink;

    @FindBy(xpath = "//*[@class='el-drawer__body']")
    public WebElement cartPage;

    @FindBy(xpath = "//*[@class='el-icon el-drawer__close']")
    public WebElement cartPageCloser;

    // Cart icon on homepage
    @FindBy(xpath = "//*[@class='badge small badge-dark rounded-pill']")
    public WebElement headerCartIcon;

    // Sign in link on homepage
    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement homepageSignInLink;

    // Sign up button in Sign in
    @FindBy(xpath = "//*[text()='Sign Up']")
    public WebElement signupInSignin;

    @FindBy(xpath = "//img[@class='img-30 rounded-pill lozad loaded']")
    public WebElement verifyRegistration;

    @FindBy(xpath = "//label[@for='firstname']")
    public WebElement nameTextboxInSignUp;

    // Password textbox in Sign up zone
    @FindBy(xpath = "//*[@type='password_type']")
    public WebElement passwordZone;

    // Eye icon in the Sign up password zone

    @FindBy(xpath = "//*[@class='zmdi zmdi-eye']")
    public WebElement eyeToHidePassword;



    // Locate text box
    @FindBy(xpath = "(//*[@placeholder='Enter delivery address'])[1]")
    public WebElement enterDeliveryAddresTextBox;

    @FindBy(xpath = "//h6[text()='Seattle']")
    public WebElement enteredAdress;

    @FindBy(xpath = "//*[@class='d-inline text-truncate']")
    public WebElement verifyAddress;

    // Locate search logo
    @FindBy(xpath = " (//*[@class='search_placeholder pos-right img-20'])[1]")
    public WebElement searcboxLogo;

    // Remove icon right of the searchbox
    @FindBy(xpath = "“//*[@class='icon-remove']”")
    public WebElement removeIcon;

    //************************************************************************************************

    // FOOTER SECTİON

    @FindBy(xpath = "//*[text()='Contact us']")
    public WebElement contactusLink;

    @FindBy(xpath = "//*[text()='Full name ']")
    public WebElement contactusName;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement messageSent;

    @FindBy(xpath = "//*[text()='Terms and conditions']")
    public WebElement termsAndConditionsLink;

    @FindBy(xpath = "//*[text()='Terms and Conditions']")
    public WebElement termsAndConditionPage;

    @FindBy(xpath = "//*[text()='Orders and Payment']")
    public WebElement ordersAndPaymentText;

    @FindBy(xpath = "//*[text()='Privacy policy']")
    public WebElement privacyPolicyLink;

    @FindBy(xpath = "//h3[text()='Privacy policy']")
    public WebElement privacyPolicyPage;

    @FindBy(xpath = "//*[text()='Become a Partner']")
    public WebElement becomeAPartnerLink;

    @FindBy(xpath = "//*[text()='Discover the Best Vegetarian Food Delivery Options in Your Area']")
    public WebElement vegetarianLink;

    @FindBy(xpath = "//h3[text()='Discover the Best Vegetarian Food Delivery Options in Your Area']")
    public WebElement vegetarianPage;

    @FindBy(xpath = "//*[text()='How to Eat Healthy with Food Delivery']")
    public WebElement eatHealtyLink;

    @FindBy(xpath = "//h3[text()='How to Eat Healthy with Food Delivery']")
    public WebElement eatHealtyPage;

    @FindBy(xpath = "//*[text()='The Benefits of Using a Food Delivery Platform for Your Healthy Lifestyle']")
    public WebElement benefitsLink;

    @FindBy(xpath = "//h3[text()='The Benefits of Using a Food Delivery Platform for Your Healthy Lifestyle']")
    public WebElement benefitsPage;

    @FindBy(xpath = "//*[text()='Discover Healthy Food Delivery Options for Your Whole Family']")
    public WebElement discoverHealtyLink;

    @FindBy(xpath = "//h3[text()='Discover Healthy Food Delivery Options for Your Whole Family']")
    public WebElement discoverHealtyPage;

    @FindBy(xpath = " (//*[@class='img-200'])[2]")
    public WebElement footerMealsCenterLogo;

    @FindBy(xpath = "//*[text()='  © Meals Center Corp. 2023']")
    public WebElement copyrightText;

    @FindBy(xpath = "//*[text()='mealscenter.com']")
    public WebElement mealscenterLink;

    @FindBy(xpath = "//*[@class='zmdi zmdi-facebook']")
    public WebElement facebookIcon;

    @FindBy(xpath = "//*[@class='zmdi zmdi-instagram']")
    public WebElement instagramIcon;

    @FindBy(xpath = "//*[@class='zmdi zmdi-linkedin']")
    public WebElement linkedinIcon;

    @FindBy(xpath = "//*[@class='zmdi zmdi-twitter']")
    public WebElement twitterIcon;

    @FindBy(xpath = "//*[@class='zmdi zmdi-youtube-play']")
    public WebElement youtubeIcon;

    @FindBy(xpath = "(//*[@class='p-2'])[2]")
    public WebElement googlePlayImage;

    @FindBy(xpath = "(//*[@class='p-2'])[1]")
    public WebElement appStoreImage;

    @FindBy(xpath = "//*[text()='info@mealscenter.com']")
    public WebElement contactEmailAddress;

    @FindBy(xpath = "//*[text()='Email address ']")
    public WebElement contactUsEmailTextbox;

    @FindBy(xpath = "//*[text()='1-800-123-4567']")
    public WebElement phoneNumber;

    //*************************************************************

    // BODY SECTİON

    @FindBy(xpath = "//*[@class='col cuisineMainPage']")
    public WebElement cousinClass;

    @FindBy(xpath = "//h4[@class='m-0']")
    public WebElement cousinText;

    // Popular nearby section
    @FindBy(xpath = "//*[@class='mt-5 mb-5']")
    public WebElement popularNearby;

    // First reataurant in Popular nearby list
    @FindBy(xpath = "(//*[text()='McDonalds'])[1]")
    public WebElement popularNearbyFirst;

    // First restaurant in Popular nearby after clicking right arrow key
    @FindBy(xpath = "(//*[text()='Bai Tong Thai Street Cafe'])[1]")
    public WebElement getPopularNearbyFirst1;

    @FindBy(xpath = "//div[@class='d-flex merchant-details']")
    public WebElement thaiPage;

    @FindBy(xpath = "//*[@class='owl-carousel restaurant-carousel rounded-circle owl-loaded owl-drag']")
    public WebElement newRestaurant;

    // First restaurant in New restaurant
    @FindBy(xpath = "(//*[text()='Kosher Restaurant'])[3]")
    public WebElement newRestaurantFirst;

    // First restaurant after clicking right arrow key
    @FindBy(xpath = "(//*[text()='Sichuanese Cuisine'])[3]")
    public WebElement newRestaurantFirst1;

    @FindBy(xpath = "(//*[@class='owl-carousel-nav next'])[1]")
    public WebElement rightArrowKeyPopularNearby;

    @FindBy(xpath = "(//*[@class='owl-carousel-nav next'])[2]")
    public WebElement rigtArrowKeyNewRestaurant;

    @FindBy(xpath = "(//*[@class='owl-carousel-nav prev mr-4'])[1]")
    public WebElement leftArrowKeyPopularNearby;

    @FindBy(xpath = "(//a[@class='owl-carousel-nav prev mr-4'])[2]")
    public WebElement leftArrowKeyNewRestaurant;

    @FindBy(xpath = "(//*[@class='col cuisineMainPage'])[1]")
    public WebElement localCousineAmerican;

    @FindBy(xpath = "(//*[@class='col cuisineMainPage'])[2]")
    public WebElement localCousineMediterranean;

    @FindBy(xpath = "(//*[@class='col cuisineMainPage'])[3]")
    public WebElement localCousineSandwiches;

    @FindBy(xpath = "(//*[@class='col cuisineMainPage'])[4]")
    public WebElement localCousineItalian;

    @FindBy(xpath = "(//*[@class='col cuisineMainPage'])[5]")
    public WebElement localCousineMexican;

    @FindBy(xpath = "(//*[@class='col cuisineMainPage'])[6]")
    public WebElement localCousineBuurgers;

    @FindBy(xpath = "(//*[@class='col cuisineMainPage'])[7]")
    public WebElement localCousineJapanese;

    @FindBy(xpath = "(//*[@class='col cuisineMainPage'])[8]")
    public WebElement localCousineThai;

    @FindBy(xpath = "//*[@id='dropdownCuisine']")
    public WebElement LocalCousineDropdownMenu;

    @FindBy(xpath = "(//*[@class='p-2 pl-2 d-block'])[1]")
    public WebElement ddmChinese;

    @FindBy(xpath = "//div[@class='col-lg-4 mb-3 col-md-6 list-items']")
    public WebElement chineseRestaurants;

    @FindBy(xpath = "(//*[@class='p-2 pl-2 d-block'])[2]")
    public WebElement ddmKosher;

    @FindBy(xpath = "//div[@class='col-lg-4 mb-3 col-md-6 list-items']")
    public WebElement kosherRestaurants;

    @FindBy(xpath = "(//*[@class='p-2 pl-2 d-block'])[3]")
    public WebElement ddmHalal;

    @FindBy(xpath = "//div[@id='vue-feed']")
    public WebElement halalRestaurants;

    @FindBy(xpath = "(//*[@class='p-2 pl-2 d-block'])[4]")
    public WebElement ddmVegatarian;

    @FindBy(xpath = "//div[@class='page-content']")
    public WebElement vegetarianRestaurants;

    @FindBy(xpath = "(//*[text()='Bai Tong Thai Street Cafe'])[1]")
    public WebElement thaiRestaurant;

    @FindBy(xpath = "//*[@class='btn btn-link readButton']")
    public WebElement readButtons;

    @FindBy(xpath = "//*[@class='btn btn-link w25']")
    public WebElement joinButton;

    @FindBy(xpath = "//h3[text()='Become Restaurant partner']")
    public WebElement verifyJoinButton;

    @FindBy(xpath = "//div[@class='section-mobileapp tree-columns-center d-none d-md-block']")
    public WebElement verifyPhoneImageAndOthers;



    @FindBy(xpath = "//a[@class='btn btn-link w25']")
    public WebElement joinbutton;
    @FindBy(xpath = "//input[@id='restaurant_name']")
    public WebElement storename;
    @FindBy(xpath = "//input[@placeholder='Store address']")
    public WebElement storeAdres1;
    @FindBy(xpath = "//h6[.='Atlanta, GA, USA']")
    public WebElement storeAdress;
    @FindBy(xpath = "//input[@data-mask='###################']")
    public WebElement telephone;
    @FindBy(xpath = "//button[@class='el-button el-button--primary el-button--default is-round w-100']")
    public WebElement cookiesButton;
    @FindBy(xpath = "//input[@id='contact_email']")
    public WebElement email;
    @FindBy(xpath = "type=\"text\"")
    public  WebElement emaitext;
    @FindBy(xpath = "//label[.='Email address']")
    public WebElement labelliemail;
    @FindBy(xpath = "//label[@class='custom-control-label']")
    public WebElement comiison;
    @FindBy(xpath = "//button[@class='btn btn-green w-100 mt-3']")
    public WebElement submit;
    //   @FindBy(xpath = "//input[@id='first_name']")
    //   public WebElement firstname;
    @FindBy(xpath = "//*[@id='first_name']")
    public WebElement inputFirstName;

    @FindBy(xpath = "//*[@id='last_name']")
    public WebElement inputLastName;

    @FindBy(xpath = "//*[@id='contact_email']")
    public WebElement inputContactEmail;

    @FindBy(xpath = "//input[@data-mask-inited='true']")
    public WebElement inputNumber;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement inputUsername;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//*[@id='cpassword']")
    public WebElement inputCpassword;

    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement buttonSignup;



}
