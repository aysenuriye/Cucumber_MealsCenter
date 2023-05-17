Feature: US_039 As an admin I would like to have a page in the dashboard sidebar to manage appointments.

  Background:
    Given User goes to "adminUrl"
    Then  Enters "adminUsernameAbdullah" in the username field
    Then  Enters "adminPaswordAbdullah" in the password field
    Then  Clicks on the Sign In Button
    Then  Click on the Appointment link


    Scenario:TC_03 --> US_039 It should be possible to sort through the titles(Patient Name) in the Appointment Details List on the Appointment page.

      Then Click on the Patient Name link and verify alphabetical order by patient name.
      Then Close Browser

    Scenario: TC_04 --> US_039 It should be possible to sort through the titles(Appointment No) in the Appointment Details List on the Appointment page.

      Then Click on the Appointment No link and verify sorting by appointment no.
      Then Close Browser

    Scenario: TC_07 --> US_039 It should be possible to sort through the titles(Gender) in the Appointment Details List on the Appointment page.

      Then Click on the Gender link verify alphabetical sorting by gender.
      Then Close Browser

    Scenario: TC_08 --> US_039 It should be possible to sort through the titles(Doctor) in the Appointment Details List on the Appointment page.

    Then Click on the Doctor link verify alphabetical sorting by gender.
    Then Close Browser

    Scenario: TC_09 --> US_039 It should be possible to sort through the titles(Priotrity) in the Appointment Details List on the Appointment page.

    Then Click on the Priotrity link verify alphabetical sorting by gender.
    Then Close Browser

    Scenario: TC_10 --> US_039 It should be possible to sort through the titles(Source) in the Appointment Details List on the Appointment page.

    Then Click on the Source link verify alphabetical sorting by gender.
    Then Close Browser

    Scenario: TC_11 --> US_039 It should be possible to sort through the titles(Live Consultant) in the Appointment Details List on the Appointment page.

    Then Click on the Live Consultant link verify alphabetical sorting by gender.
    Then Close Browser


    Scenario: TC_12 --> US_039 It should be possible to sort through the titles(Fees) in the Appointment Details List on the Appointment page.

    Then Click on the Fees link verify alphabetical sorting by gender.
    Then Close Browser


    Scenario: TC_15 --> US_039 Appointment data suitable for filtering should be listed by selecting Doctor and Date on the Doctor Wise Appointment page.

      Then Click on the Doctor Wise button.
      Then Select the doctor whose appointment record will be listed.
      Then Select date to list appointment record.
      Then Click on the search link.
      Then Verify that the doctor appointment list is visible.
      Then Close Browser


    Scenario: TC_16 --> US_039 By selecting a doctor from the Appointment page, there should be a redirect to a page where the appointments made from the relevant doctor can be viewed

      Then Click on the Doctor Wise button.
      Then Verify that the Doctor Wise Appointment page is opened
      Then Close Browser


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