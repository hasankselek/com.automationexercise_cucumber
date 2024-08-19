package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomepageStepDefs {

    HomePage homePage = new HomePage();

    @Given("Verify that user is navigated to {string}")
    public void verify_that_user_is_navigated_to(String url) {
        homePage.verifyHomePageUrl(url);

    }

    @Given("Navigate to {string}")
    public void navigate_to(String url) {

        homePage.openHomePage(url);
    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

        homePage.verifyPage();
    }

    @Given("Enter {string} in input and click arrow button")
    public void enter_in_input_and_click_arrow_button(String email) {

        homePage.fillEmailboxAndSearch(email);

    }
}
