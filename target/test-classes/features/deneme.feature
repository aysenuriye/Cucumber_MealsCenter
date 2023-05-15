Feature: US_063 As a doctor, I want to access the hospital's stock information on blood and components as well as blood donation data from the Blood Bank page on the Dashboard Sidebar.

  Background:
    Given User goes to "adminUrl"
    Then  Enters "doctorUsernameAbdullah" in the username field
    Then  Enters "adminPaswordAbdullah" in the password field
    Then  Clicks on the Sign In Button
    Then  Click on the Bllod Bank Link


    Scenario: TC_33 --> In the Components List, the number of content to be displayed on a page (as 100 or All) should be selected.
    Then Click on the Component Issue link.
    Then Click on the "option100" text under Issue Component and verify that the selected options are sorted .
    Then Close Browser


    Scenario: TC_26 --> In the Components List, the number of content to be displayed on a page (as 100 or All) should be selected.

      Then Click on the Blood Issue Details link.
      Then Click on the "optionAll" text under Issue Blood and verify that the options are clickable.
      Then Close Browser
  @wip
    Scenario: TC_39 --> US_063 In the Components List, the number of content to be displayed on a page (as 100 or All) should be selected.
      Then Click on the Component Issue link.
      Then Click on the Components link.
      Then Click on the option
      Then Click on the "option100" text under Issue Component and verify that the selected options are sorted .
      Then Close Browser
