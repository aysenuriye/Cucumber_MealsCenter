package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
        Driver.closeDriver();
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





    // **********************15.05.2023 ve sonrası****************
    @Then("Click on the Patient Name link and verify alphabetical order by patient name.")
    public void clickOnThePatientNameLinkAndVerifyAlphabeticalOrderByPatientName() {

        ReusableMethods.stringListSortTesting(1);
    }

    @Then("Click on the Appointment No link and verify sorting by appointment no.")
    public void clickOnTheAppointmentNoLinkAndVerifySortingByAppointmentNo() {
        ReusableMethods.stringListSortTesting(2);
    }

    @Then("Click on the Gender link verify alphabetical sorting by gender.")
    public void clickOnTheGenderLinkVerifyAlphabeticalSortingByGender() {
        ReusableMethods.stringListSortTesting(5);
    }

    @Then("Click on the Doctor link verify alphabetical sorting by gender.")
    public void clickOnTheDoctorLinkVerifyAlphabeticalSortingByGender() {
        ReusableMethods.stringListSortTestingAbd(6);
    }

    @Then("Click on the Priotrity link verify alphabetical sorting by gender.")
    public void clickOnThePriotrityLinkVerifyAlphabeticalSortingByGender() {
        ReusableMethods.stringListSortTesting(8);
    }

    @Then("Click on the Source link verify alphabetical sorting by gender.")
    public void clickOnTheSourceLinkVerifyAlphabeticalSortingByGender() {
        ReusableMethods.stringListSortTesting(7);
    }

    @Then("Click on the Live Consultant link verify alphabetical sorting by gender.")
    public void clickOnTheLiveConsultantLinkVerifyAlphabeticalSortingByGender() {
        ReusableMethods.stringListSortTesting(9);
    }

    @Then("Click on the Fees link verify alphabetical sorting by gender.")
    public void clickOnTheFeesLinkVerifyAlphabeticalSortingByGender() {
        ReusableMethods.intListSortTesting(10);
    }


    @Then("Move to the Approved text under the status heading and click on the three parallel lines that become visible.")
    public void moveToTheApprovedTextUnderTheStatusHeadingAndClickOnTheThreeParallelLinesThatBecomeVisible() {

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(adminPage.appoinmentPageShowVisibilityAdminPage).perform();
        adminPage.appointmentPageShowButtonAdminPage.click();


    }

    @Then("Verify that the appointment details are listed.")
    public void verifyThatTheAppointmentDetailsAreListed() {

        Assert.assertTrue(adminPage.showSetailsVerifyLocate.isDisplayed());
    }

    @Then("Click on the Doctor Wise button.")
    public void clickOnTheDoctorWiseButton() {
        adminPage.appointmentPageDoctorWiseAdminPage.click();
    }

    @Then("Select the doctor whose appointment record will be listed.")
    public void selectTheDoctorWhoseAppointmentRecordWillBeListed() {
        adminPage.doctorWiseDoctorSectionAdminPage.click();
        actions.sendKeys("Sonia Bush").sendKeys(Keys.ENTER).perform();
    }

    @Then("Select date to list appointment record.")
    public void selectDateToListAppointmentRecord() {
        adminPage.doctorWiseDateSectionAdminPage.click();
        actions.sendKeys("05.05.2023").perform();
    }

    @Then("Verify that the doctor appointment list is visible.")
    public void verifyThatTheDoctorAppointmentListIsVisible() {
        adminPage.doctorWiseAppoinmentVerify.isDisplayed();

    }

    @Then("Click on the search link.")
    public void clickOnTheSearchLink() {
        adminPage.doctorWiseSearchButtonAdminPage.click();
    }

    @Then("Verify that the Doctor Wise Appointment page is opened")
    public void verifyThatTheDoctorWiseAppointmentPageIsOpened() {
        Assert.assertTrue(adminPage.doctorWisePageVerifyAdminPage.isDisplayed());
    }


    // 17.05.2023
    @Then("Select doctor, shift, date and slot options.")
    public void selectDoctorShiftDateAndSlotOptions() {

        adminPage.queuePageDoctorSectionAdminPage.click();
        Select select = new Select(adminPage.queuePageDoctorSectionAdminPage);
        select.selectByValue("2");
        adminPage.queuePageShiftSectionAdminPage.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        adminPage.queuePageDateSectionAdminPage.click();
        actions.sendKeys("17.05.2023").perform();
        adminPage.queuePageSlotSectionAdminPage.click();
        select.selectByValue("710");
        adminPage.queuePageSearchButtonAdminPage.click();


    }
}
