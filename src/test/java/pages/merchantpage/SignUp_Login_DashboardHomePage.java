package pages.merchantpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class SignUp_Login_DashboardHomePage {




    public  SignUp_Login_DashboardHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='report-inner'])[2]")
    public static WebElement dashbordTotalButton;
    @FindBy(xpath = "//*[text()='Merchant Login']")
    public static WebElement merchantLoginText;
    @FindBy(xpath = "//input[@type='text']")//merchant giris urlde cıkan .Username text kısmı
    public static WebElement usernameButton;
    @FindBy(xpath = "//input[@type='password']")//merchant giris url de cıkan password texti
    public static WebElement passwordButton;
    @FindBy(xpath = "//input[@type='submit']")///merchant giris url de cıkan ilk giris sign IN butonu
    public static WebElement loginSignInButton;
































































    public static void loginMethod() {//thai admin login giriş ve ekrana merchant sayfasının gelmesi
        //kullanıcı Merchant giris = https://qa.mealscenter.com/backoffice/auth/login sayfaya gider

        Driver.getDriver().get(ConfigReader.getProperty("merchantUrl"));

        //kullanıcı giriş sayfasında  username ve passwordu bilgilerini girip giriş yapar
        SignUp_Login_DashboardHomePage signUpLoginDashboardHomePage=new SignUp_Login_DashboardHomePage();
        ReusableMethods.bekle(1);

        SignUp_Login_DashboardHomePage.usernameButton.sendKeys("thaiAdmin");
        ReusableMethods.bekle(1);

        SignUp_Login_DashboardHomePage.passwordButton.sendKeys("1234567");
        SignUp_Login_DashboardHomePage.loginSignInButton.click();

    }



























































































































































    /**     ZEYNEP HOCA           * */

    // https://qa.mealscenter.com/backoffice/auth/login sayfasına gidin
    //  driver.get("https://qa.mealscenter.com/backoffice/auth/login");

    // Merchant Login "Username"
    @FindBy(xpath = "(//label[@for='AR_merchant_login_username']")
    public WebElement merchantUsername;

    // Merchant Login"Password"
    @FindBy(xpath = " //label[@for='AR_merchant_login_password']")
    public  WebElement merchantPasswordButton;


    // Merchant Login yazısının altındaki "username"
    //label[@for='AR_merchant_login_username']

    // Merchant Login yazısının altındaki "Password" locator
    //label[@for='AR_merchant_login_password']

    //"Remember me" yazısının görünürlüğü
    //label[@for='AR_merchant_login_rememberMe']

    // "Forgot password" butonu görünür olmalı
    //a[@class='dim underline']



    //  Signin buttonuna tiklayin
    //input[@name='yt0']
    // https://qa.mealscenter.com/ sayfasına gidin
       // driver.get("https://qa.mealscenter.com/");

    // Kullanıcı ismini tıklayın
    // ---> //a[@id='dropdownMenuLink']

    // Seçeneklerden "Addresses" butonuna tıkla
    // --->//a[@class='dropdown-item with-icon-addresses']

    // Açılan sayfada "Add new address" butonua tıkla
    // ---> //a[@class='btn btn-green'][normalize-space()='Add new address']

    // Açılan kutucukta "Enter delivery address" textbox'na istenilen adres bilgilerini girin
    // --->//input[@placeholder='Enter delivery address']

    // Bulunduğunuz eyaleti tıklatın
    // ---> //font[contains(text(),'New Jersey')]

    // Açılan kutuda "Address details" adres detaylarını doldurun
    // ---> (//div[@class='modal-body'])[2]

    // "Save" butonuna tıklayın
    // ---> //button[@class='btn btn-green w-100']

    // "Edit" butonuna tıklayın ve değişiklik yapın
    // ---> //a[@class='btn normal small']

    // "Save" butonuna tıklayın
    // ---> //button[@class='btn btn-green w-100']

    // Silmek için de "Delete" butonuna tıklayın
    // ---> //a[normalize-space()='Delete']

    // "Confirm" yazısının altındaki "yes" buyomuma tıklayın
    // ---> //button[normalize-space()='Yes']




    // https://qa.mealscenter.com/ sayfasına gidin
        //driver.get("https://qa.mealscenter.com/");

    // Kullanıcı ismini tıklayın
    // ---> //a[@id='dropdownMenuLink']

    // Seçeneklerden "Payments Options" butonuna tıklayın
    // ---> //a[@class='dropdown-item with-icon-payments']

    // Açılan sayfada "Add new payment" butonua tıklayın
    // ---> (//a[@class='btn btn-green'])[1]

    // "Add New Payment Method" ödeme seçeneklerini görünürlüğünü doğrulayın
    //---> //div[@class='card-body']

    // "Cash On delivery" butonuna tıklayın
    // ---> (//a[@class='d-block chevron-section medium d-flex align-items-center rounded mb-2'])[1]

    // Çıkan kutucuktaki "Add Cash" butonuna tıklayın
    // ---> //span[normalize-space()='Add Cash']

    // "Stripe" butonuna tıklayın
    // ---> (//a[@class='d-block chevron-section medium d-flex align-items-center rounded mb-2'])[2]

    // Kullanıcıya ait kart numarasını girin
    //---> //input[@name='cardnumber']

    // Kullanıcıya ait kart son kullanma tarihine girin
    // ---> //input[@name='exp-date']

    // Kullanıcıya ait kart "cvc" girin
    // ---> //input[@name='cvc']

    // Kullanıcıya ait kart "ZIP kodu" girin
    // ---> //input[@name='postal']

    // "Add Stripe" butonuna tıklayın
    // ---> //span[normalize-space()='Add Stripe']

    // Ödeme şekilleri "Delete" silin
    // ---> (//a[@class='btn normal small'])[2]





    // https://qa.mealscenter.com/ sayfasına gidin
    //    driver.get("https://qa.mealscenter.com/");

    // Kullanıcı ismini tıklayın
    // ---> //a[@id='dropdownMenuLink']

    // // Seçeneklerden "Saved Stores" butonuna tıkla
    // ---> //a[@class='dropdown-item with-icon-savedstore']

    // "Order now" butonuna tıklayın
    // ---> (//a[@class='btn btn-green'])[1]

    // Beğenilen restaurantın göründüğü doğrulayın
    //---> //div[@class='col-lg-9 col-md-12 column-2']

    //  Before ile "Saved Stores" kayıtlı restaurantları görünürlüğünü doğrulayın
    // ---> //div[@id='main-container']

    // Sayfayı Kapatın







}
