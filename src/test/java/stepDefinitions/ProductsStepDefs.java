package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.ProductsPage;

public class ProductsStepDefs {

    ProductsPage productsPage = new ProductsPage();

    @Given("The products list is visible")
    public void the_products_list_is_visible() {
        productsPage.allProductsVisible();

    }

    @Given("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {
       productsPage.clickViewProductFirstButton();
    }

}
