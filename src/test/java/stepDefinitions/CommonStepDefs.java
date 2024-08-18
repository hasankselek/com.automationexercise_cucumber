package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class CommonStepDefs {

    HomePage homePage = new HomePage();

    @Given("Verify error {string} is visible")
    public void verify_error_is_visible(String errorMessage) {
        ReusableMethods.verifyElement(errorMessage);
    }

    @Given("Click on {string} button")
    public void click_on_button(String buttonName) {

        ReusableMethods.clickElement(buttonName);
    }

    @Given("Verify {string} is visible")
    public void verify_is_visible(String visibleName) {

        ReusableMethods.verifyElement(visibleName);
    }

    @Given("Select checkbox {string}")
    public void select_checkbox(String string) {

        ReusableMethods.clickElement(string);
    }

    @Given("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String successMessage) {
        ReusableMethods.verifyElement(successMessage);

    }

    @Given("Verify user is navigated to {string} page successfully")
    public void verify_user_is_navigated_to_page_successfully(String url) {
        String expectedUrl = ConfigReader.getProperty(url);
        Assert.assertEquals(expectedUrl, Driver.getDriver().getCurrentUrl());
    }

    @Given("Scroll down page to bottom")
    public void scroll_down_page_to_bottom() {
        JSUtilities.scrollToElement(Driver.getDriver(), homePage.subscriptionLogo);
    }

    @Given("Scroll up page to top")
    public void scroll_up_page_to_top() {
        JSUtilities.scrollToTop(Driver.getDriver());
    }

    @Given("Verify that page is scrolled up and {string} text is visible on screen")
    public void verify_that_page_is_scrolled_up_and_text_is_visible_on_screen(String text) {
        ReusableMethods.verifyElementDisplayed(homePage.websiteLogo);
        ReusableMethods.verifyElement(text);
    }
}
