package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class PDPStepDefs {

    @Given("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("firstProductUrl"));

    }
    @Given("Verify that detail detail is visible: {string} {string} {string} {string} {string}")
    public void verify_that_detail_detail_is_visible(String string, String string2, String string3, String string4, String string5) {

    }
}
