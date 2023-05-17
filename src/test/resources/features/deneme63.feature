Feature: US_063 As a doctor, I want to access the hospital's stock information on blood and components as well as blood donation data from the Blood Bank page on the Dashboard Sidebar.

  Background:
    Given User goes to "adminUrl"
    Then  Enters "doctorUsernameAbdullah" in the username field
    Then  Enters "adminPaswordAbdullah" in the password field
    Then  Clicks on the Sign In Button
    Then  Click on the Bllod Bank Link

  @buasıtamdeğil
  Scenario: TC_37 --> US_063 In the Components List, the list contents should be sorted by the column headings.

    Then Click on the Component Issue link.
    Then Click on the Components link.
    Then Click on the Name title verify that the names are sorted by alphatical.
    Then Close Browser
