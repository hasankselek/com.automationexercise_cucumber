package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;
import utilities.ReusableMethods;

public class AutomationExercies {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SignupPage signupPage = new SignupPage();


    @Given("Navigate to {string}")
    public void navigate_to(String url) {

        homePage.openHomePage(url);
    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

        homePage.verifyPage();
    }

    @Given("Click on {string} button")
    public void click_on_button(String buttonName) {

        ReusableMethods.clickElement(buttonName);
    }

    @Given("Verify {string} is visible")
    public void verify_is_visible(String visibleName) {

        ReusableMethods.verifyElement(visibleName);
    }

    @Given("Enter {string} and {string} address")
    public void enter_name_and_email_address(String name, String email) {

        loginPage.fillNewUserSignup(name,email);
    }


    @Given("Verify that {string} is visible")
    public void verify_that_is_visible(String visibleName) {

        ReusableMethods.verifyElement(visibleName);
    }
    @Given("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        signupPage.userSignup();

    }
    @Given("Select checkbox {string}")
    public void select_checkbox(String string) {

    }
    @Given("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {

    }
    @Given("Click {string}")
    public void click(String string) {

    }
    @Given("Verify that {string} is visible and click {string} button")
    public void verify_that_is_visible_and_click_button(String string, String string2) {

    }

}
