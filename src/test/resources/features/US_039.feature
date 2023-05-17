Feature: US_039 As an admin I would like to have a page in the dashboard sidebar to manage appointments.


  Scenario: TC_01 --> US_039 When click on the Appointment link in the Dashboard sidebar, it should redirect to the relevant page.


    Given Verify that the Appointment page is opened
    Then  Close Browser

  Scenario: TC_02 --> US_039 The Appointment Details List on the Appointment page should have titles (Patient Name, Appointment No, Appointment Date, Phone, Gender, Doctor, Source, Priorty, Fees, Status).

    Given Verify that the relevant titles are visible.
    Then  Close Browser


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

  Scenario: TC_13 --> US_039 In order to search the Appointment Details List on the Appointment page, the page must have a searchBox
    Given Verify that the Searcbox textbox is enabled.
    Then  Close Browser


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



  Scenario: TC_17 --> US_039 There should be a redirection to a page to filter the patients who have made an appointment from the Appointment page.
    Given Click on the Queue button.
    Then  Verify that the Patient Queue page is viisble
    Then  Close Browser




