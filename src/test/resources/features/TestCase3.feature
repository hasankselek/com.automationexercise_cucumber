Feature:  User Login Fail

  Scenario: Login User with incorrect email and incorrect password

    * Navigate to "url"
    * Verify that home page is visible successfully
    * Click on ' Signup / Login' button
    * Verify 'Login to your account' is visible
    * Enter "incorrect_email" address and "incorrect_password"
    * Click on 'Login' button
    * Verify error 'Your email or password is incorrect!' is visible