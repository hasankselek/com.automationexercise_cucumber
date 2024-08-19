package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.ProductDetailingPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PDPStepDefs {

    ProductDetailingPage page = new ProductDetailingPage();

    @Given("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("firstProductUrl"));

    }

    @Given("Verify that detail detail is visible: {string} {string} {string} {string} {string} {string}")
    public void verify_that_detail_detail_is_visible(String name, String category, String price, String availability, String condition, String brand) {

        page.checkProductInformation(name, category, price, availability, condition, brand);
    }

}
