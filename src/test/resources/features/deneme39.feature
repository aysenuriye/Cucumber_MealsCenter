Feature: US_039 As an admin I would like to have a page in the dashboard sidebar to manage appointments.

  Background:
    Given User goes to "adminUrl"
    Then  Enters "adminUsernameAbdullah" in the username field
    Then  Enters "adminPaswordAbdullah" in the password field
    Then  Clicks on the Sign In Button
    Then  Click on the Appointment link



  @burasıtamdeğil
    Scenario: TC_18 --> US_039 On the Patient Queue page, when the doctor's shift day and slot are selected (suitable for filtering), appointments should be listed.

      Then Click on the Queue button.
      Then Select doctor, shift, date and slot options.
      Then Verify that appointments available for filtering are listed.
      Then Close Browser

  @burasıtamdeğil
  Scenario: TC_14 --> US_039 In the Appointment Details List on the Appointment page, the appointment detail should be displayed under the Action title.

    Then Move to the Approved text under the status heading and click on the three parallel lines that become visible.
    Then Verify that the appointment details are listed.
    Then Close Browser