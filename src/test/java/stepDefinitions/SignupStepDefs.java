package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.SignupPage;

public class SignupStepDefs {

    SignupPage signupPage = new SignupPage();

    @Given("Fill details: {string} {string} {string}")
    public void fill_details(String title, String name, String password) {
        signupPage.userSignupFirst(title, name, password);
    }

    @Given("Fill details: {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void fill_details(String firstname, String lastname, String company, String address, String country, String state, String city, String zipcode, String mobilenumber) {

        signupPage.userSignupSecond(firstname, lastname, company, address, country, state, city, zipcode, mobilenumber);
    }
}
