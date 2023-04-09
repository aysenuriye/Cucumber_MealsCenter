package pages.userpage;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class Userpage {
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Faker faker = new Faker();
    Driver driver;

    public Userpage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    // User HomePage ilk giriş için Sign in Butonu
    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement userHomeFirstSignIn;

    // UserPage'deki Username(Email) textbox'ı
    @FindBy(xpath = "//*[@id='username']")
    public WebElement userLoginPageUsername;

    // UserPage'deki Password textbox'ı
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[2]")
    public WebElement userLoginPagePassword;

    //UserPage'deki ikinci Sign in butonu
    @FindBy(xpath = "(//*[text()='Sign in'])[2]")
    public WebElement userLoginPageSecondSignIn;

    //UserPage'deki isime tıklanınca çıkan Logout butonu
    @FindBy(xpath = "//*[text()=' Logout ']")
    public WebElement userLoginPageLogout;

    // UserPage'deki Password textbox'ındaki göz iconu
    @FindBy(xpath = "(//a[@href='javascript:;'])[3]")
    public WebElement userLoginPageEye;

    //UserPage'deki Remember Butonu
    @FindBy(xpath = "//label[@for='rememberme']")
    public WebElement userLoginPageRememberMe;

    //UserPage'deki Forgot Password Butonu
    @FindBy(xpath = "//a[@class='a-12']")
    public WebElement userLoginPageForgotPassword;

    //UserPage'deki Sign Up butonu
    @FindBy(xpath = "//a[text()='Sign Up']")
    public WebElement userLoginPageSignUp;

    //Kullanıcı girişi yaptıktan sonra kullanıcı ismi bölümü
    @FindBy(xpath = "//*[@id='dropdownMenuLink']")
    public WebElement userNameButton;

    //Kullanıcı girişi yaptıktan sonra HomePage den Restaurant seçimi
    @FindBy(xpath = "(//a[@href='https://qa.mealscenter.com/bai-tong-thai-street-cafe'])[1]")
    public WebElement userRestaurantChoose;

    //Restaurant seçiminden sonra menüden ürün seçimi
    @FindBy(xpath = "(//a[@href='javascript:;'])[31]")
    public WebElement userMenuAddtoCart;

    //Menüden seçilen restaurantın cart'a eklenmesi
    @FindBy(xpath = "//span[@class='item-summary']")
    public WebElement userMenuAddCart2;

    //Login sayfası doğrulama yazısı
    @FindBy(xpath = "//*[text()='Login']")
    public WebElement userLoginPageGetText;

    //yanlış login uyarı alert
    @FindBy(xpath = "//*[@class='alert alert-warning']")
    public WebElement userLoginPageUnable;

    //Forgot Password page verify text
    @FindBy(xpath = "//h5[@class='text-center mb-4']")
    public WebElement userForgotPasswordText;

    //Sign Up Button running text
    @FindBy(xpath = "//h5[@class='text-center mb-4']")
    public WebElement userPageSignUpText;

    //PopularNearby area
    @FindBy(xpath = "(//*[@class='mt-5 mb-5'])[1]")
    public WebElement populerNearby;

    //Resteurant Choose verify text
    @FindBy(xpath = "//h5[text()='Menu']")
    public WebElement resteurantChooseVerify;

    //Delivery adres
    @FindBy(xpath = "(//input[@placeholder='Enter your address'])[2]")
    public WebElement deliveryAdress;

    //Choose Adress send keys
    @FindBy(xpath = "(//a[@href='javascript:;'])[32]")
    public WebElement sendKeysAdress;

    //Checkout button
    @FindBy(xpath = "//div[text()='Checkout']")
    public WebElement checkoutButton;

    //Choose restaurant in New restaurant part
    @FindBy(xpath = "(//a[@href='https://qa.mealscenter.com/vegan-season'])[3]")
    public WebElement newRestaurantChoose;

    //Verify the choosing New Restaurant
    @FindBy(xpath = "//h5[text()='Vegan Season']")
    public WebElement newRestaurantChooseVerify;

    //visible of cousine part
    @FindBy(xpath = "//div[@class='row no-gutters list-inline']")
    public WebElement cousinePart;

    //Random Kitchen Page Text
    @FindBy(xpath = "//h4[@class='m-0']")
    public WebElement randomKitchenPage;

    //cousine DDM
    @FindBy(xpath = "(//a[@href='javascript:;'])[4]")
    public WebElement cousineDDM;

    //DDM Table
    @FindBy(xpath = "//div[@class='dropdown-menu show']")
    public WebElement cousineDDMTable;

    //DDM vegetarian
    @FindBy(xpath = "(//a[@href='https://qa.mealscenter.com/cuisine/vegetarian'])[1]")
    public WebElement cousineVegetarian;

    //Delivery Type
    @FindBy(xpath = "(//a[@href='javascript:;'])[2]")
    public WebElement deliveryTypeButton;

    //Delivery Type window
    @FindBy(xpath = "(//div[@class='modal-body'])[2]")
    public WebElement deliveryTypeWindow;

    // Add new Adress
    @FindBy(xpath = "//*[text()='Add new address']")
    public WebElement addNewAdress;

    //Save button from Add new adress
    @FindBy(xpath = "(//*[text()='Save'])[4]")
    public WebElement saveButtonAdress;

    //Send Adress info box
    @FindBy(xpath = "//input[@placeholder='Enter delivery address']")
    public WebElement newAdressBox;

    //send keys adress 2
    @FindBy(xpath = "(//a[@href='javascript:;'])[264]")
    public WebElement sendKeysAdress2;

    //Add Adress verify
    @FindBy(xpath = "(//div[@class='flexcol'])[5]")
    public WebElement addAdressVerify;

    //Cash on delivery button
    @FindBy(xpath = "//span[text()='Cash On delivery']")
    public WebElement cashOnDeliveryButton;

    // Add Cash method
    @FindBy(xpath = "//span[text()='Add Cash']")
    public WebElement addCashButton;

    // Add stripe method
    @FindBy(xpath = "//span[text()='Stripe']")
    public WebElement addStripeButton;

    // Cart number iframe
    @FindBy(xpath = "//iframe[@title='Güvenli kart ödeme giriş çerçevesi']")
    public WebElement cartNumberBoxiFrame;

    // Cart number part 1
    @FindBy(xpath = "//input[@name='cardnumber']")
    public WebElement cartNumberOne;

    // Cart number part 2
    @FindBy(xpath = "//input[@name='exp-date']")
    public WebElement cartNumberTwo;

    // Cart number part 3
    @FindBy(xpath = "//input[@name='cvc']")
    public WebElement cartNumberThree;

    // Cart number part 4
    @FindBy(xpath = "//input[@name='postal']")
    public WebElement cartNumberFour;

    // Add stripe window
    @FindBy(xpath = "//span[text()='Add Stripe']")
    public WebElement addStripeWindow;

    //Cash on delivery verifiy
    @FindBy(xpath = "(//span[text()='Cash On delivery'])[1]")
    public WebElement cashOnDeliveryVerifiy;

    //Place Older Button
    @FindBy(xpath = "//*[text()='Place Order']")
    public WebElement placeOlderButton;

    //Verifiy Order
    @FindBy(xpath = "//h5[text()='Confirming your order']")
    public WebElement verifyOrder;

    //Manage My Account Button
    @FindBy(xpath = "//*[text()=' Manage my account ']")
    public WebElement manageMyAccountButton;
    @FindBy(xpath = "//a[@class='btn btn-sm dropdown-toggle text-truncate shadow-none width-100']")
    public WebElement managemyAccountfirstButton;

    //change first name
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstnameTextbox;

    //change last name
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastnameTextbox;

    //change email
    @FindBy(xpath = "//input[@id='email_address']")
    public WebElement emailMMATextbox;

    //Submit button of MMa
    @FindBy(xpath = "(//*[text()='Submit'])[2]")
    public WebElement submitButtonMMA;

    //verify user info change
    @FindBy(xpath = "//h4[text()='2-Step Verification']")
    public WebElement verifyChangeUserinfo;

    //Change password
    @FindBy(xpath = "(//*[text()='Change Password'])[2]")
    public WebElement changePasswordButton;

    //old password
    @FindBy(xpath = "//input[@id='old_password']")
    public WebElement oldPasswordBox;

    //New Password
    @FindBy(xpath = "//input[@id='new_password']")
    public WebElement newPassword;

    //Confirm Password
    @FindBy(xpath = "//input[@id='confirm_password']")
    public WebElement confirmPassword;

    // submit password change
    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement submitPasssworChange;

    //Password Change Verify
    @FindBy(xpath = "//*[text()='Password change']")
    public WebElement verifyPasswordChange;

    public void LoginMethod() {
        Driver.getDriver().get(ConfigReader.getProperty("mealscenterUrl"));
        userHomeFirstSignIn.click();
        userLoginPageUsername.sendKeys(ConfigReader.getProperty("userMail"));
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(ConfigReader.getProperty("userPassword")).perform();
        userLoginPageSecondSignIn.click();
    }

    public void LoginMethodWithRMeButton() {
        Driver.getDriver().get(ConfigReader.getProperty("mealscenterUrl"));
        userHomeFirstSignIn.click();
        userLoginPageUsername.sendKeys(ConfigReader.getProperty("userMail"));
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(ConfigReader.getProperty("userPassword")).perform();
        userLoginPageRememberMe.click();
        ReusableMethods.wait(2);
        userLoginPageSecondSignIn.click();
    }


    public void UserLogoutMethod() {
        ReusableMethods.wait(1);
        js.executeScript("arguments[0].scrollIntoView(true)", userNameButton);
        ReusableMethods.wait(1);
        userNameButton.click();
        userLoginPageLogout.click();
    }

    public void LoginMethodWithoutEnterance() {
        Driver.getDriver().get(ConfigReader.getProperty("mealscenterUrl"));
        userHomeFirstSignIn.click();
        userLoginPageUsername.sendKeys(ConfigReader.getProperty("userMail"));
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(ConfigReader.getProperty("userPassword")).perform();
    }

    public void PopularRestaurantChooseMethod() {
        ReusableMethods.wait(2);
        JSUtilities.scrollToElement(Driver.getDriver(), userRestaurantChoose);
        ReusableMethods.wait(2);
        userRestaurantChoose.click();
    }

    public void MenuAddToCartMethod() {
        ReusableMethods.wait(2);
        JSUtilities.scrollToElement(Driver.getDriver(), userMenuAddtoCart);
        ReusableMethods.wait(2);
        userMenuAddtoCart.click();
    }

    public void NewRestaurantChooseMethod() {
        ReusableMethods.wait(2);
        JSUtilities.scrollToElement(Driver.getDriver(), newRestaurantChoose);
        ReusableMethods.wait(2);
        newRestaurantChoose.click();
    }

    public void DeliveryAdressMethod() {
        deliveryAdress.sendKeys("newyork");
        ReusableMethods.wait(2);
        sendKeysAdress.click();
    }

    public void NewAdressAddMethod() {
        newAdressBox.sendKeys("los angeles");
        ReusableMethods.wait(2);
        sendKeysAdress2.click();
    }

    public void CashOnDeliveryMethod() {
        ReusableMethods.wait(1);
        js.executeScript("arguments[0].scrollIntoView(true)", cashOnDeliveryButton);
        ReusableMethods.wait(1);
        cashOnDeliveryButton.click();
        ReusableMethods.wait(2);
        addCashButton.click();
    }

    public void StripeMethod() {
        ReusableMethods.wait(2);
        JSUtilities.scrollToElement(Driver.getDriver(), addStripeButton);
        ReusableMethods.wait(2);
        addStripeButton.click();
        ReusableMethods.wait(7);
        Driver.getDriver().switchTo().frame(cartNumberBoxiFrame);
        ReusableMethods.wait(3);
        cartNumberOne.sendKeys("4242 4242 4242 4242");
        cartNumberTwo.sendKeys("04 / 24");
        cartNumberThree.sendKeys("242");
        cartNumberFour.sendKeys("42424");
        Driver.getDriver().switchTo().parentFrame();
        addStripeWindow.click();
        ReusableMethods.wait(1);
        js.executeScript("arguments[0].scrollIntoView(true)", cashOnDeliveryVerifiy);
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();

    }

    public void PlaceOlderMethod() {
        ReusableMethods.wait(1);
        js.executeScript("arguments[0].scrollIntoView(true)", placeOlderButton);
        ReusableMethods.wait(1);
        placeOlderButton.click();
        ReusableMethods.wait(1);
    }

    public void UsernameButtonMethod() {
        ReusableMethods.wait(1);
        js.executeScript("arguments[0].scrollIntoView(true)", userNameButton);
        ReusableMethods.wait(1);
        userNameButton.click();
    }
}