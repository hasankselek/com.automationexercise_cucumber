package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.ProductListingPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class PLPStepDefs {

    ProductListingPage productsPage = new ProductListingPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("The products list is visible")
    public void the_products_list_is_visible() {

        productsPage.allProductsVisible();
    }

    @Given("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {

        productsPage.clickViewProductFirstButton();
    }

    @Given("Enter {string} in search input and click search button")
    public void enter_in_search_input_and_click_search_button(String product) {

        productsPage.searchProduct(product);
    }

    @Given("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible(String product) {

        productsPage.allSearchedProductsVisible(product);
    }

    @Given("Hover over product and click Add to Cart")
    public void hover_over_product_and_click_add_to_cart() {

        actions.moveToElement().
    }

}
