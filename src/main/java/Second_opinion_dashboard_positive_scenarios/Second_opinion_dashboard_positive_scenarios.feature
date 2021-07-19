Feature: User should be able to click on the Services tab and  navigates to Services page

  Scenario: Validate that the user is able to login with valid credentials
    Given Application is open and clicks on the login button and navigated to the login page
    
  Scenario: Validate that the user is able to click on the Second Opinion tab
    When click on the second opinion tab
    
    Scenario: Validate that the user is able to click on Resume Cases and dialogue box is displayed
    Then clicks on Resume Cases
    
    Scenario: Validate that the user is able to click on Plus icon and dialogue box is displayed
    Then clicks on plus icon
    
    Scenario: Validate that User is able to click on Requested tab
    Then clicks on the Requested tab
    
    Scenario: Validate that User is able to click on Reviewed tag
    Then clicks on the Reviewed tag