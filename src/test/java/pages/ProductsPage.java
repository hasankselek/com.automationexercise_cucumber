package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProductsPage {

    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='features_items']//div[@class='col-sm-4']")
    private List<WebElement> productsList;

    @FindBy(xpath = "(//*[text()='View Product'])[1]")
    private WebElement viewProductFirstButton;

    public void allProductsVisible(){
        for (int i = 0; i < productsList.size(); i++) {
            Assert.assertTrue(productsList.get(i).isDisplayed());
        }
    }

    public void clickViewProductFirstButton(){
        viewProductFirstButton.click();
    }
}
