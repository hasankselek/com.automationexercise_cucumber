Feature: User Registration and Account Management

  @ab
  Scenario: It tests basic user management functionality that allows users to create, log in, and delete accounts on a website.

  * Navigate to "url"
  * Verify that home page is visible successfully
  * Click on ' Signup / Login' button
  * Verify 'New User Signup!' is visible
  * Enter "name" and "email" address
  * Click on 'Signup' button
  * Verify that 'Enter Account Information' is visible
  * Fill details: Title, Name, Email, Password, Date of birth
  * Select checkbox 'Sign up for our newsletter!'
  * Select checkbox 'Receive special offers from our partners!'
  * Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
  * Click 'Create Account button'
  * Verify 'ACCOUNT CREATED!' is visible
  * Click on 'Continue' button
  * Verify that 'Logged in as username' is visible
  * Click on 'Delete Account' button
  * Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button