package pages.adminPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Base;

public class AdminPage extends Base {

    // UserLogin(Admin) Username Locate
    @FindBy(id = "email")
    public WebElement usernameTextboxAdminPage;

    // UserLogin(Admin) Password Locate
    @FindBy (id = "password")
    public WebElement passwordTextboxAdminPage;

    // UserLogin(Admin) Sign In Locate
    @FindBy (xpath = "//button[text()='Sign In']")
    public WebElement signInButtonAdminPage;


    // ***********************US 39 LLOCATERS******************************** //

    // Admin Dashboard Appointment Locate
    @FindBy (xpath = "//span[text()='Appointment']")
    public WebElement appointmentLinkAdminDashboard;

    // Admin Appointment Details Page Verify Locate
    @FindBy (xpath = "//h3[text()='Appointment Details']")
    public WebElement appointmentPageAdminPage;

    // Admin Appointment Details Page Sort Titles
    @FindBy(xpath = "(//tr[@role='row'])[1]")
    public WebElement appointmentPageSortTitlesAdminPage;

    // Admin Appointment Details Page Searchbox Locate
    @FindBy (xpath = "//input[@type='search']")
    public WebElement appointmentPageSearchboxAdminPage;

    // Admin Appointmen Details Page Action Show Button Zone Locate
    @FindBy (xpath = "(//tr[@class='odd'])[1]")
    public WebElement appoinmentPageShowVisibilityAdminPage;

    @FindBy (xpath = "(//i[@class='fa fa-reorder'])[3]")
    public WebElement appointmentPageShowButtonAdminPage;

    // Admin Appointment Details Page Doctor Wise Locate
    @FindBy (xpath = "//a[text()=' Doctor Wise']")
    public WebElement appointmentPageDoctorWiseAdminPage;

    // Admin-->Appointment Details-->Doctor Wise-->Doctor Wise Appointment Page Locate
    @FindBy (xpath = "//h3[text()='Doctor Wise Appointment']")
    public WebElement doctorWisePageVerifyAdminPage;

    // Admin-->Appoinment-->Doctor Wise-->Doctor Locate
    @FindBy (id = "select2-doctor-container")
    public WebElement doctorWiseDoctorSectionAdminPage;

    // Admin-->Appoinment-->Doctor Wise-->Date Locate
    @FindBy (xpath = "//input[@name='date']")
    public WebElement doctorWiseDateSectionAdminPage;

    // Admin-->Appoinment-->Doctor Wise-->Search Button Locate
    @FindBy (xpath = "//button[text()='Search']")
    public WebElement doctorWiseSearchButtonAdminPage;

    // Admin Appointment Details Page Queue Locate
    @FindBy (xpath = "//a[text()=' Queue']")
    public WebElement appointmentPageQueueAdminPage;

    // Admin-->Appointment Details-->Queue-->Patient Queue Page Locate
    @FindBy(xpath = "//h3[text()='Patient Queue']")
    public WebElement queuePageVerifyAdminPage;

    // Admin-->Appointment Details-->Queue-->Patient Queue Page Doctor Locate
    @FindBy (id = "doctor")
    public WebElement queuePageDoctorSectionAdminPage;

    // Admin-->Appointment Details-->Queue-->Patient Queue Page Shift Locate
    @FindBy (id = "global_shift")
    public WebElement queuePageShiftSectionAdminPage;

    // Admin-->Appointment Details-->Queue-->Patient Queue Page Date Locate
    @FindBy (id = "datetimepicker")
    public WebElement queuePageDateSectionAdminPage;

    // Admin-->Appointment Details-->Queue-->Patient Queue Page Slot Locate
    @FindBy (id = "slot")
    public WebElement queuePageSlotSectionAdminPage;

    // Admin-->Appointment Details-->Queue-->Patient Queue Page Search Button Locate
    @FindBy (xpath = "//button[text()='Search']")
    public WebElement queuePageSearchButtonAdminPage;

    // Admin Appointment Details List Patient Name Locate
    @FindBy (xpath = "(//th[text()='Patient Name'])[1]")
    public WebElement appointmentDetailsListPatientNameAdminPage;

    // Admin Appointment Details List Appointment No Locate
    @FindBy (xpath = "(//th[text()='Appointment No'])[1]")
    public WebElement appointmentDetailsListAppointmentNoAdminPage;

    // Admin Appointment Details List Appointment Date Locate
    @FindBy (xpath = "(//th[text()='Appointment Date'])[1]")
    public WebElement appointmentDetailsListAppointmentDateAdminPage;

    // Admin Appointment Details List Phone Locate
    @FindBy (xpath = "(//th[text()='Phone'])[1]")
    public WebElement appointmentDetailsListPhoneAdminPage;

    // Admin Appointment Details List Gender Locate
    @FindBy (xpath = "(//th[text()='Gender'])[1]")
    public WebElement appointmentDetailsListGenderAdminPage;

    // Admin Appointment Details List Doctor Locate
    @FindBy (xpath = "(//th[text()='Doctor'])[1]")
    public WebElement appointmentDetailsListDoctorAdminPage;

    // Admin Appointment Details List Source Locate
    @FindBy (xpath = "(//th[text()='Source'])[1]")
    public WebElement appointmentDetailsListsourceAdminPage;

    // Admin Appointment Details List Priority Locate
    @FindBy (xpath = "(//th[text()='Priority'])[1]")
    public WebElement appointmentDetailsListPriorityAdminPage;

    // Admin Appointment Details List Live Consultant Locate
    @FindBy (xpath = "(//th[text()='Live Consultant'])[1]")
    public WebElement appointmentDetailsListLiveConsultantAdminPage;

    // Admin Appointment Details List Fees Locate
    @FindBy (xpath = "(//th[text()='Fees'])[1]")
    public WebElement appointmentDetailsListFeesAdminPage;

    // **********************US 39 LOCATERS***************************** //

    //------------------------------------------------------------------//


}
