Feature: US_039 As an admin I would like to have a page in the dashboard sidebar to manage appointments.


  Scenario: TC_01 --> US_039 When click on the Appointment link in the Dashboard sidebar, it should redirect to the relevant page.


    Given Verify that the Appointment page is opened
    Then  Close Browser

  Scenario: TC_02 --> US_039 The Appointment Details List on the Appointment page should have titles (Patient Name, Appointment No, Appointment Date, Phone, Gender, Doctor, Source, Priorty, Fees, Status).

    Given Verify that the relevant titles are visible.
    Then  Close Browser

  Scenario: TC_13 --> US_039 In order to search the Appointment Details List on the Appointment page, the page must have a searchBox
    Given Verify that the Searcbox textbox is enabled.
    Then  Close Browser

  Scenario: TC_17 --> US_039 There should be a redirection to a page to filter the patients who have made an appointment from the Appointment page.
  Given Click on the Queue button.
  Then  Verify that the Patient Queue page is viisble
  Then  Close Browser

