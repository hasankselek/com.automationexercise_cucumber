Feature: User Registration and Account Management

  Background: Common Steps

    * Navigate to "url"
    * Verify that home page is visible successfully
    * Click on ' Signup / Login' button
    * Verify 'New User Signup!' is visible
    * Enter "Name" and "Email" address
    * Click on 'Signup' button


  Scenario: It tests basic user management functionality that allows users to create, log in, and delete accounts on a website.

    * Verify that 'Enter Account Information' is visible
    * Fill details: "Title" "Name" "Password"
    * Select checkbox 'Sign up for our newsletter!'
    * Select checkbox 'Receive special offers from our partners!'
    * Fill details: "Firstname" "Lastname" "Company" "Address" "Country" "State" "City" "Zipcode" "MobileNumber"
    * Click on 'Create Account' button
    * Verify 'Account Created!' is visible
    * Click on 'Continue' button
    * Verify ' Logged in as ' is visible
    * Click on ' Delete Account' button
    * Verify 'Account Deleted!' is visible
    * Click on 'Continue' button


  Scenario: It tests basic user management functionality that allows users to create

    * Verify that 'Enter Account Information' is visible
    * Fill details: "Title" "Name" "Password"
    * Select checkbox 'Sign up for our newsletter!'
    * Select checkbox 'Receive special offers from our partners!'
    * Fill details: "Firstname" "Lastname" "Company" "Address" "Country" "State" "City" "Zipcode" "MobileNumber"
    * Click on 'Create Account' button
    * Verify 'Account Created!' is visible
    * Click on 'Continue' button
    * Click on ' Logout' button

