package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.adminPage.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AdminStepDefinition {

    AdminPage adminPage = new AdminPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("User goes to {string}")
    public void user_goes_to(String Url) {

        Driver.getDriver().get(ConfigReader.getProperty(Url));

    }
    @Then("Enters {string} in the username field")
    public void enters_in_the_username_field(String Username) {
        adminPage.usernameTextboxAdminPage.sendKeys(ConfigReader.getProperty(Username));

    }
    @Then("Enters {string} in the password field")
    public void enters_in_the_password_field(String Password) {
        adminPage.passwordTextboxAdminPage.sendKeys(ConfigReader.getProperty(Password));

    }
    @Then("Clicks on the Sign In Button")
    public void clicks_on_the_sign_in_button() {
        adminPage.signInButtonAdminPage.click();

    }

    @Then("Click on the Appointment link")
    public void clickOnTheAppointmentLink() {
        adminPage.appointmentLinkAdminDashboard.click();
    }

    @Then("Verify that the Appointment page is opened")
    public void verifyThatTheAppointmentPageIsOpened() {
        adminPage.appointmentPageAdminPage.isDisplayed();
    }

    @Then("Close Browser")
    public void closeBrowser() {
        Driver.getDriver().close();
    }

    @Given("Verify that the relevant titles are visible.")
    public void verifyThatTheRelevantTitlesAreVisible() {
        adminPage.appointmentPageSortTitlesAdminPage.isDisplayed();
    }


    // 12.05.2023 ve sonrası
    @Given("Verify that the Searcbox textbox is enabled.")
    public void verifyThatTheSearcboxTextboxIsEnabled() {

        Assert.assertTrue(adminPage.appointmentPageSearchboxAdminPage.isEnabled());
    }

    @Given("Click on the Queue button.")
    public void clickOnTheQueueButton() {
        adminPage.appointmentPageQueueAdminPage.click();
    }

    @Then("Verify that the Patient Queue page is viisble")
    public void verifyThatThePatientQueuePageIsViisble() {
        Assert.assertTrue(adminPage.queuePageVerifyAdminPage.isDisplayed());
    }


}
