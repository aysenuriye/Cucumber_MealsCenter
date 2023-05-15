package pages.doctorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Base;
import utilities.ConfigReader;
import utilities.Driver;

public class DoctorPage extends Base {

    // **********************US 63 LOCATERS*****************************//

    // Doctor Page Blood Bank Link Locate
    @FindBy(xpath = "//span[text()='Blood Bank']")
    public WebElement bloodBankDoctorPage;

    // Doctor Blood Bank Page Verify Locate
    @FindBy (xpath = "//h3[text()='Blood Bank Status']")
    public WebElement bloodBankPageVerifyDoctorPage;

    // Doctor Blood Bank Page Selected Blood Group Locate
    @FindBy (xpath = "//a[text()='AB+']")
    public WebElement bloodGroupBloodBankPageDoctorPage;

    // Doctor Blood Bank Page Blood Group and Component Verify
    @FindBy (xpath = "//div[@class='tab-content']")
    public WebElement bloodGroupAndComponentDoctorPage;

    // Doctor-->Blood Bank-->Blood Issue Details Locate
    @FindBy (xpath = "//a[text()=' Blood Issue Details']")
    public WebElement bloodBankBloodIssueDetailsDoctorPage;

    // Doctor-->Blood Bank-->Blood Issue Details Page Verify Locate
    @FindBy (xpath = "//h3[text()='Blood Issue Details']")
    public WebElement bloodBankBloodIssueDetailsVerifyDoctorPage;

    // Doctor-->Blood Bank-->Blood Issue Details-->Titles Locate
    @FindBy (xpath = "(//tr[@role='row'])[1]")
    public WebElement bloodBankBloodIssueDetailsTitlesDoctorPage;

    // Doctor-->Blood Bank-->Blood Issue Details-->Biil No Locate
    @FindBy (xpath = "//th[text()='Bill No']")
    public WebElement bloodBankBloodIssueDetailsBillNoDoctorPage;

    // Doctor-->Blood Bank-->Blood Issue Details-->Received To Locate
    @FindBy (xpath = "//th[text()='Received To']")
    public WebElement bloodBankBloodIssueDetailsReceivedToDoctorPage;

    // Doctor-->Blood Bank-->Blood Issue details-->Searchbox Locate
    @FindBy (xpath = "//input[@type='search']")
    public WebElement bloodBankBloodIssueDetailsSearcboxDoctorPage;

    // Doctor-->Blood Bank-->Blood Issue Details-->100 Locate
    @FindBy (xpath = "//select[@name='DataTables_Table_0_length']")
    public WebElement bloodBankBloodIssueDetails100DoctorPage;

    // Doctor-->Blood Bank-->Blood Issue Details-->First Row Locate
    @FindBy (xpath = "(//tr[@class='odd'])[1]")
    public WebElement bloodBankBloodIssueDetailsFirstRowDoctorPage;

    // Doctor-->Blood Bank-->Blood Issue Details-->Show Button Locate
    @FindBy (xpath = "(//i[@class='fa fa-reorder'])[1]")
    public WebElement bloodBankBloodIssueDetailsShowButtonDoctorPage;

    // Doctor-->Blood Bank-->Blood Issue Details-->Show-->Details Page Locate
    @FindBy (xpath = "//div[@class='modal-body min-h-3']")
    public WebElement bloodBankBloodIssueDetailsShowDetailsDoctorPage;

    // Doctor-->Blood Bank-->Blood Issue Details-->Add Payment Locate
    @FindBy (xpath = "(//i[@class='fa fa-plus'])[2]")
    public WebElement bloodBankBloodIssueDetailsAddPaymentDoctorPage;

    // Doctor-->Blood Bank-->Blood Issue Details-->Add Payments Verify Locate
    @FindBy (xpath = "//h4[text()='Payments']")
    public WebElement bloodBankBloodIssueDetailsAddPaymentsVerifyDoctorPage;

    // Doctor-->Blood Bank-->Component Issue Locate
    @FindBy (xpath = "//a[text()=' Component Issue']")
    public WebElement bloodBankComponentIssueDoctorPage;

    // Doctor-->Blood Bank-->Component Issue-->Component Issue Page Verify Locate
    @FindBy (xpath = "//h3[text()='Components Issue Details']")
    public WebElement bloodBankComponentIssueVerifyDoctorPage;

    // Doctor-->Blood Bank-->Component Issue-->Component Issue Details Page Titles Locate
    @FindBy (xpath = "(//tr[@role='row'])[1]")
    public WebElement bloodBankComponentIssueTitlesVerifyDoctorPage;

    // Doctor-->Blood Bank-->Component Issue-->Component Issue Details-->Donor Name Locate
    @FindBy (xpath = "//th[text()='Donor Name']")
    public WebElement bloodBankComponentIssueDetailsDonorNameDoctorPage;

    // Doctor-->Blood Bank-->Component Issue-->Components Locate
    @FindBy (xpath = "//a[text()=' Components']")
    public WebElement bloodBankComponentIssuesComponentsDoctorPage;

    // Doctor-->Blood Bank-->Component Issue-->Components-->Components List Page Verify Locate
    @FindBy (xpath = "//div[@class='box-body']")
    public WebElement bloodBankComponentIssueComponentsListVerifyDoctorPage;

    // Doctor-->Blood Bank-->Component Issue-->Components-->Name Locate
    @FindBy (xpath = "//th[text()='Name']")
    public WebElement bloodBankComponentIssueComponentsNameDoctorPage;


        //DoctorPage-->Login-->UsernameTextBox
        @FindBy(xpath = "//input[@id='email']")
        private WebElement usernameTextBoxDoctorPage;
        //DoctorPage-->Login-->PasswordTextBox
        @FindBy(xpath = "//input[@id='password']")
        private WebElement passwordTextBoxDoctorPage;
        //DoctorPage-->Login-->SignInButton
        @FindBy(xpath = "//button[text()='Sign In']")
        private WebElement signInButtonDoctorPage;

        //DoctorPage-->Login-->ForgotPasswordLink
        @FindBy(xpath = "//a[@class='forgot']")
        private WebElement forgotPasswordLinkDoctorPage;

        //DoctorPage-->Login-->ForgotPasswordLink-->EmailTextBox
        @FindBy(xpath = "//input[@id='form-username']")
        private WebElement emailTextBoxForgotPasswordLink;

        //DoctorPage-->Login-->ForgotPasswordLink-->SubmitButton
        @FindBy(xpath = "//button[text()='Submit']")
        private WebElement submitButtonForgotPasswordLink;

        //DoctorPage-->Login-->ForgotPasswordLink-->AdminLoginLink
        @FindBy(xpath = "//a[text()=' Admin Login']")
        private WebElement adminLoginForgotPasswordLink ;


        public void doctorLogin(){
            Driver.getDriver().get(ConfigReader.getProperty("doctorPageUrl"));
            usernameTextBoxDoctorPage.sendKeys(ConfigReader.getProperty("doctorMail"));
            passwordTextBoxDoctorPage.sendKeys(ConfigReader.getProperty("doctorPassword"));
            signInButtonDoctorPage.click();


        }
        //DoctorPage-->Ambulance Link
        @FindBy(xpath = "//span[text()=' Ambulance']")
        private WebElement doctorPageAmbulanceLink ;

        //DoctorPage-->Ambulance-->Add Ambulance Call Button
        @FindBy(xpath ="//a[@class='btn btn-primary btn-sm ambulancecall']")
        private WebElement ambulanceAddAmbulanceCallButton ;

        //DoctorPage-->Ambulance-->Ambulance List Button
        @FindBy(xpath = "//a[text()=' Ambulance List']")
        private WebElement ambulanceAmbulanceListButton ;

        //DoctorPage-->Ambulance-->Search Box
        @FindBy(xpath = "//input[@type='search']")
        private WebElement ambulanceSearchBox ;





        //***************************** US-068 *************************//
        //TC_01


        //doctor page Messaging link
        @FindBy(xpath = "(//a)[35]")
        public WebElement messagingnLinkDoctor;

        //doctor page Messaging published in the Notice Board section
        @FindBy(xpath = "//div[@class='box-group']")
        public WebElement messagingNoticeBoardSectionDoctor;



        //TC_02
        //There are similar steps in the previous use story

        //doctor pageMessaging Post New Message
        @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
        public WebElement messagingPostNewMessageDoctor;


        //doctor pageMessaging Post New Message title
        @FindBy(xpath = "(//input[@class='form-control'])[1]")
        public WebElement messagingPostNewMessageTitleDoctor;


        //doctor pageMessaging Post New Message box
        @FindBy(xpath = "//body[@spellcheck='false']")
        public WebElement messagingPostNewMessageBoxDoctor;


        //doctor pageMessaging Post New Message Notice Date
        @FindBy(xpath = "(//input[@class='form-control date'])[1]")
        public WebElement messagingPostNewMessageNoticeDateDoctor;

        //doctor pageMessaging Post New Message Publish On
        @FindBy(xpath = "(//input[@class='form-control date'])[2]")
        public WebElement messagingPostNewMessagePublishOnDoctor;

        //doctor pageMessaging Post New Message To
        @FindBy(xpath = "(//input[@type='checkbox'])[2]")
        public WebElement messagingPostNewMessageToDoctor;


        //doctor pageMessaging Post New Message Send button
        @FindBy(xpath = "(//button[@type='submit'])[3]")
        public WebElement messagingPostNewMessageSendDoctor;


        //doctor pageMessaging Post New Message Record Saved Successfully alert
        @FindBy(xpath = "//div[@class='alert alert-success']")
        public WebElement messagingPostNewMessageRecordSavedSuccessfullyAlertDoctor;



        //TC_03
        //There are similar steps in the previous use story

        //doctor pageMessaging Send SMS
        @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[2]")
        public WebElement messagingSendSMSDoctor;


        //doctor pageMessaging Send SMS title
        @FindBy(xpath = "(//input[@class='form-control'])[1]")
        public WebElement messagingSendSMSTitleDoctor;


        //doctor pageMessaging  Send Through * SMS
        @FindBy(xpath = "(//input[@name='group_send_by[]'])[1]")
        public WebElement messagingSendThroughSMSDoctor;


        //doctor pageMessaging  message area
        @FindBy(xpath = "//textarea[@id='group_msg_text']")
        public WebElement messagingMessageAreaDoctor;



        //doctor pageMessaging Send SMS Message to doctor
        @FindBy(xpath = "(//input[@type='checkbox'])[6]")
        public WebElement messagingSendSMSMessageToDoctor;


        //doctor pageMessaging Send SMS Send button
        @FindBy(xpath = "(//button[@type='submit'])[3]")
        public WebElement messagingSendSMSSendDoctor;




        //TC_04
        //There are similar steps in the previous use story

        //doctor pageMessaging Send Email
        @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[3]")
        public WebElement messagingSendEmailDoctor;

        //doctor pageMessaging Send Email title
        @FindBy(xpath = "(//input[@class='form-control'])[1]")
        public WebElement messagingSendEmailTitleDoctor;


        //doctor pageMessaging Send Email box
        @FindBy(xpath = "//body[@spellcheck='false']")
        public WebElement messagingSendEmailBoxDoctor;


        //doctor pageMessaging Send Email Message to nurse
        @FindBy(xpath = "(//input[@type='checkbox'])[10]")
        public WebElement messagingSendEmailNurseToDoctor;

        //doctor pageMessaging Send Email Send button
        @FindBy(xpath = "(//button[@type='submit'])[3]")
        public WebElement messagingSendEmailSendButtonDoctor;


        // 13.05.2023

        @FindBy(xpath = "//select[@name='DataTables_Table_0_length']")
        public WebElement allor100Option;


    }




