package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.LoginPage;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("Enter {string} and {string} address")
    public void enter_name_and_email_address(String name, String email) {

        loginPage.fillNewUserSignup(name,email);
    }

    @Given("Enter {string} address and {string}")
    public void enter_address_and(String correct_email, String correct_password) {
        loginPage.login(correct_email, correct_password);

    }


}
