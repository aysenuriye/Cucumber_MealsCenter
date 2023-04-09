package pages.adminpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class AdminPage3 {

    public AdminPage3(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public static void AdminGirisPanelim(){



        // --Browser başlatılır
        // --"https://qa.mealscenter.com/backoffice/login"
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        AdminPage3 adminpage = new AdminPage3();

        //--Geçerli username ve password ile sign in olunabilmeli
        adminpage.AdminUsername.sendKeys(ConfigReader.getProperty("adminRamazanUsername"));
        adminpage.AdminPassword.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminpage.SigninButton.click();

    }


    //AdminLogin --> (ramazan ay) --> Username TextBox
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement AdminUsername;

    //AdminLogin --> (ramazan ay) --> Password TextBox
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[2]")
    public WebElement AdminPassword;

    //AdminLogin --> (ramazan ay) -->Sign in Button
    @FindBy(xpath = "//input[@class='btn btn-green btn-full']")
    public WebElement SigninButton;

    //Dashboard --> (ramazan ay) -->Promo Button
    @FindBy(xpath = "//li[@class='promo']")
    public WebElement PromoButton;

    //Dashboard --> (ramazan ay) --> Promo Button --> Coupon Button
    @FindBy(xpath = "//a[text()='Coupon']")
    public WebElement CouponButton;

    //Dashboard --> (ramazan ay) -->Promo Button --> Coupon Button --> CoupunListText
    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement CoupunListText;

    //Dashboard --> (ramazan ay) -->Promo Button --> Coupon Button -->AddNew Button
    @FindBy(xpath = "//a[@class='btn btn-black btn-circle']")
    public WebElement CouponAddNewButton;

    //Dashboard --> (ramazan ay) -->Promo Button --> Coupon Button -->AddNew Button -->AddCouponText
    @FindBy(xpath = " //span[text()='Add Coupon']")
    public WebElement AddCouponText;


    //Dashboard -->(ramazan ay) --> Promo Button --> Coupon Button -->AddNew Button -->AddCouponText
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement AddCouponName;



}

