Feature:  User Logout

  @logout
  Scenario: Logout User

    * Navigate to "url"
    * Verify that home page is visible successfully
    * Click on ' Signup / Login' button
    * Verify 'Login to your account' is visible
    * Enter "correct_email" address and "correct_password"
    * Click on 'Login' button
    * Verify ' Logged in as ' is visible
    * Click on ' Logout' button
    * Verify that user is navigated to "login_url"