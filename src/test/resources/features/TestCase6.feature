Feature: Contact Us Form


  Scenario: User fills contact us form and upload file

    * Navigate to "url"
    * Verify that home page is visible successfully
    * Click on " Contact us" button
    * Verify 'Get In Touch' is visible
    * Enter "Name" "Email" "subject" and "message"
    * Upload file
    * Click Submit button
    * Click OK button
    * Verify success message 'Success! Your details have been submitted successfully.' is visible
    * Click on ' Home' button
    * Verify that home page is visible successfully