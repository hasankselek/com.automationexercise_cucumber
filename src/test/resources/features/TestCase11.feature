Feature: Verify Scroll Up without 'Arrow' button and Scroll Down functionality

  @ab
  Scenario: Verify Scroll Up without 'Arrow' button and Scroll Down functionality

    * Navigate to "url"
    * Verify that home page is visible successfully
    * Click on " Cart" button
    * Scroll down page to bottom
    * Verify 'Subscription' is visible
    * Enter "Email" in input and click arrow button
    * Verify success message "You have been successfully subscribed!" is visible