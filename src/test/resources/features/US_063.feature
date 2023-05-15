Feature: US_063 As a doctor, I want to access the hospital's stock information on blood and components as well as blood donation data from the Blood Bank page on the Dashboard Sidebar.

  Background:
      Given User goes to "adminUrl"
      Then  Enters "doctorUsernameAbdullah" in the username field
      Then  Enters "adminPaswordAbdullah" in the password field
      Then  Clicks on the Sign In Button
      Then  Click on the Bllod Bank Link


  Scenario: TC_19 --> US_063 When the Blood Bank link on the Dashboard Sidebar is clicked, it should lead to the relevant page.

      Then  Verify that the blood blank page is enabled.
      Then  Close Browser

  Scenario: TC_20 --> US_063 There should be a redirect on the Blood Issue Details page from the Blood Bank Status page.

      Then  Click on the Blood Issue Details link.
      Then  Verify that the Blood Issue Details page is opened.
      Then  Close Browser

  Scenario: TC_21 --> US_063 Blood Issue Details List on the Blood Issue Details page should be visible.

      Then  Click on the Blood Issue Details link.
      Then  Verify that the titles and their details is displayed.
      Then  Close Browser

  Scenario: TC_24 --> US_063 Blood and components stock information of all blood groups should be displayed on the Blood Bank Status page.

      Then  Click on the any blood group.
      Then  Verify that the clicked blood group information is displayed.
      Then  Close Browser

  Scenario: TC_25 --> US_063 Blood Issue Details Must have a searchBox to easily search the contents of the LIst.

      Then  Click on the Blood Issue Details link.
      Then  Verify that the searchbox is clickable.
      Then  Close Browser

  Scenario:  TC_29 --> US_063 There should be a redirect on the Components Issue Details page from the Blood Bank Status page.
      Then  Click on the Component Issue link.
      Then  Verify that the Component Issue Details page is opened.
      Then  Close Browser

  Scenario: TC_30 --> US_063 On the Components Issue Details page, Components Issue Details List should be displayed.

      Then Click on the Component Issue link.
      Then Verify that the Component Issue Details titles are visible.
      Then Close Browser

  Scenario: TC_32 --> US_063 Components Issue Details Must have a searchBox to easily search the contents of the LIst.
      Then Click on the Component Issue link.
      Then Verify that the search textbox is displayed.
      Then Close Browser

  Scenario: TC_35 --> US_063  There should be a redirect from the Components Issue Details page to the Components page

      Then Click on the Component Issue link.
      Then Click on the Components link.
      Then Verify that the Components List page is opened.
      Then Close Browser

  Scenario: TC_36 --> US_063 The Components List titles should be visible

      Then Click on the Component Issue link.
      Then Click on the Components link.
      Then Verify that the Name, Blood Group, Bags, Lot, Institution titles are opened.
      Then Close Browser

  Scenario: TC_38 --> US_063 In order to easily search among the contents in the Components List, there must be a searchBox.

      Then Click on the Component Issue link.
      Then Click on the Components link.
      Then Verify that the search textbox is displayed.
      Then Close Browser


  Scenario: TC_33 --> In the Components List, the number of content to be displayed on a page (as 100 or All) should be selected.
    Then Click on the Component Issue link.
    Then Click on the "option100" text under Issue Component and verify that the selected options are sorted .
    Then Close Browser


  Scenario: TC_26 --> In the Components List, the number of content to be displayed on a page (as 100 or All) should be selected.

    Then Click on the Blood Issue Details link.
    Then Click on the "optionAll" text under Issue Blood and verify that the options are clickable.
    Then Close Browser

  Scenario: TC_39 --> US_063 In the Components List, the number of content to be displayed on a page (as 100 or All) should be selected.
    Then Click on the Component Issue link.
    Then Click on the Components link.
    Then Click on the option
    Then Click on the "option100" text under Issue Component and verify that the selected options are sorted .
    Then Close Browser