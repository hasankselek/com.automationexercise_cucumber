package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.ContactUsPage;

public class ContactUsStepDefs {

    ContactUsPage contactUsPage = new ContactUsPage();


    @Given("Enter {string} {string} {string} and {string}")
    public void enter_and(String name, String email, String subject, String message) {

        contactUsPage.fillContactUsForm(name, email, subject, message);

    }
    @Given("Upload file")
    public void upload_file() {
        contactUsPage.uploadFile();

    }

    @Given("Click Submit button")
    public void click_submit_button() {
        contactUsPage.submitClick();
    }

    @Given("Click OK button")
    public void click_ok_button() {
        contactUsPage.okButtonClick();
    }
}
