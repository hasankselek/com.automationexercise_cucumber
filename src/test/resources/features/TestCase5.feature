Feature: User Registration and Account Management

  Scenario: Register User with existing email

    * Navigate to "url"
    * Verify that home page is visible successfully
    * Click on ' Signup / Login' button
    * Verify 'New User Signup!' is visible
    * Enter "Name" and "Email" address
    * Click on 'Signup' button
    * Verify error "Email Address already exist!" is visible