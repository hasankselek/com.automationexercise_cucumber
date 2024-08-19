package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import java.util.List;

public class ProductListingPage {

    public ProductListingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    Actions action = new Actions(Driver.getDriver());

    @FindBy(xpath = "//div[@class='features_items']//div[@class='col-sm-4']")
    private List<WebElement> productsList;

    @FindBy(xpath = "(//*[text()='View Product'])[1]")
    private WebElement viewProductFirstButton;

    @FindBy(css = "[id=search_product]")
    private WebElement searchProductBox;

    @FindBy(id = "submit_search")
    private WebElement searchButton;

    @FindBy(xpath = "(//img[@alt='ecommerce website products'])[1]")
    private WebElement firstProductImage;

    @FindBy(xpath = "(//img[@alt='ecommerce website products'])[2]")
    private WebElement secondProductImage;

    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])")
    private List<WebElement> addToCartButtonList;



    public void allProductsVisible(){
        for (int i = 0; i < productsList.size(); i++) {
            Assert.assertTrue(productsList.get(i).isDisplayed());
        }
    }

    public void allSearchedProductsVisible(String productName){
        for (int i = 0; i < productsList.size(); i++) {
            ReusableMethods.verifyElementDisplayed(productsList.get(i));
            Assert.assertTrue(productsList.get(i).getText().toLowerCase().contains(productName.toLowerCase()));
        }
    }

    public void clickViewProductFirstButton(){
        JSUtilities.scrollToElement(Driver.getDriver(), viewProductFirstButton);
        viewProductFirstButton.click();
    }

    public void searchProduct(String searchText){
        searchProductBox.sendKeys(searchText);
        searchButton.click();
    }

    public void addTwoProductsCart(){

        action.moveToElement(firstProductImage).click(addToCartButtonList.get(0))

    }
}
