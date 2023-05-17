package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.adminPage.AdminPage;
import pages.doctorPage.DoctorPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class DoctorStepDefinition {

    DoctorPage doctorPage = new DoctorPage();


    // 12.05.2023

    @Then("Click on the Bllod Bank Link")
    public void click_on_the_bllod_bank_link() {
        doctorPage.bloodBankDoctorPage.click();

    }


    @Then("Verify that the blood blank page is enabled.")
    public void verifyThatTheBloodBlankPageIsEnabled() {
        Assert.assertTrue(doctorPage.bloodBankPageVerifyDoctorPage.isDisplayed());
    }


    @Then("Click on the Blood Issue Details link.")
    public void clickOnTheBloodIssueDetailsLink() {
        doctorPage.bloodBankBloodIssueDetailsDoctorPage.click();
    }

    @Then("Verify that the Blood Issue Details page is opened.")
    public void verifyThatTheBloodIssueDetailsPageIsOpened() {
        doctorPage.bloodBankBloodIssueDetailsVerifyDoctorPage.isDisplayed();
    }

    @Then("Verify that the titles and their details is displayed.")
    public void verifyThatTheTitlesAndTheirDetailsIsDisplayed() {
        doctorPage.bloodBankBloodIssueDetailsTitlesDoctorPage.isDisplayed();
    }

    @Then("Click on the any blood group.")
    public void clickOnTheAnyBloodGroup() {

        doctorPage.bloodGroupBloodBankPageDoctorPage.click();
    }

    @Then("Verify that the clicked blood group information is displayed.")
    public void verifyThatTheClickedBloodGroupInformationIsDisplayed() {
        doctorPage.bloodGroupAndComponentDoctorPage.isDisplayed();
    }

    @Then("Verify that the searchbox is clickable.")
    public void verifyThatTheSearchboxIsClickable() {
        doctorPage.bloodBankBloodIssueDetailsSearcboxDoctorPage.isEnabled();
    }

    @Then("Click on the Component Issue link.")
    public void clickOnTheComponentIssueLink() {
        doctorPage.bloodBankComponentIssueDoctorPage.click();
    }

    @Then("Verify that the Component Issue Details page is opened.")
    public void verifyThatTheComponentIssueDetailsPageIsOpened() {
        doctorPage.bloodBankComponentIssueVerifyDoctorPage.isDisplayed();
    }

    @Then("Verify that the Component Issue Details titles are visible.")
    public void verifyThatTheComponentIssueDetailsTitlesAreVisible() {
        doctorPage.bloodBankComponentIssueTitlesVerifyDoctorPage.isDisplayed();
    }

    @Then("Verify that the search textbox is displayed.")
    public void verifyThatTheSearchTextboxIsDisplayed() {
        doctorPage.bloodBankBloodIssueDetailsSearcboxDoctorPage.isDisplayed();
    }

    @Then("Click on the Components link.")
    public void clickOnTheComponentsLink() {
        doctorPage.bloodBankComponentIssuesComponentsDoctorPage.click();
    }

    @Then("Verify that the Components List page is opened.")
    public void verifyThatTheComponentsListPageIsOpened() {
        doctorPage.bloodBankComponentIssueComponentsListVerifyDoctorPage.isDisplayed();
    }

    @Then("Verify that the Name, Blood Group, Bags, Lot, Institution titles are opened.")
    public void verifyThatTheNameBloodGroupBagsLotInstitutionTitlesAreOpened() {
        doctorPage.bloodBankComponentIssueComponentsListVerifyDoctorPage.isDisplayed();
    }


    // 13.05.2023 ve sonrası



    @Then("Click on the {string} text under Issue Component and verify that the selected options are sorted .")
    public void clickOnTheTextUnderIssueComponentAndVerifyThatTheSelectedOptionsAreListed(String option) {
        ReusableMethods.allOr100OptionSelect(1,ConfigReader.getProperty(option));
    }

    @Then("Click on the {string} text under Issue Blood and verify that the options are clickable.")
    public void clickOnTheTextUnderIssueBloodAndVerifyThatTheOptionsAreClickable(String option) {
        ReusableMethods.allOr100OptionSelect(1,ConfigReader.getProperty(option));
    }

    @Then("Click on the option")
    public void clickOnTheOption() {
        doctorPage.allor100Option.click();
    }



    // 16.05.2023 ve sonrası



    @Then("Click on the Biil No title and verify that the sorting is by number.")
    public void clickOnTheBiilNoTitleAndVerifyThatTheSortingIsByNumber() {
        ReusableMethods.intListSortTesting(1);
    }

    @Then("Click on the Received To title verify that the sorting is by alphabetical.")
    public void clickOnTheReceivedToTitleVerifyThatTheSortingIsByAlphabetical() {
        ReusableMethods.stringListSortTestingAbd(4);
    }

    @Then("Click Donor Name title and verify that the donor names are sorted by alphabetical.")
    public void clickDonorNameTitleAndVerifyThatTheDonorNamesAreSortedByAlphabetical() {
        ReusableMethods.stringListSortTestingAbd(8);
    }

    @Then("Click on the Name title verify that the names are sorted by alphatical.")
    public void clickOnTheNameTitleVerifyThatTheNamesAreSortedByAlphatical() {
        ReusableMethods.stringListSortTestingAbd(1);
    }
}
