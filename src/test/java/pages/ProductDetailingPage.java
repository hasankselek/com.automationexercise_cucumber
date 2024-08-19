package pages;

import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class ProductDetailingPage {

    public ProductDetailingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "div[class='product-information'] h2")
    private WebElement productName;

    @FindBy(xpath = "((//div[@class='product-information'])/p)[1]")
    private WebElement categoryName;

    @FindBy(css = "div[class='product-information'] span span")
    private WebElement productPrice;

    @FindBy(xpath = "((//div[@class='product-information'])/p)[2]")
    private WebElement productAvailability;

    @FindBy(xpath = "((//div[@class='product-information'])/p)[3]")
    private WebElement productCondition;

    @FindBy(xpath = "((//div[@class='product-information'])/p)[4]")
    private WebElement productBrand;

    public void checkProductInformation(String name,String category,String price,String availability,String condition,String brand){
        ReusableMethods.verifyElementDisplayed(productName);
        Assert.assertEquals(productName.getText(),name);

        ReusableMethods.verifyElementDisplayed(categoryName);
        Assert.assertTrue(categoryName.getText().contains(category));

        ReusableMethods.verifyElementDisplayed(productPrice);
        Assert.assertTrue(productPrice.getText().contains(price));

        ReusableMethods.verifyElementDisplayed(productAvailability);
        Assert.assertTrue(productAvailability.getText().contains(availability));

        ReusableMethods.verifyElementDisplayed(productCondition);
        Assert.assertTrue(productCondition.getText().contains(condition));

        ReusableMethods.verifyElementDisplayed(productBrand);
        Assert.assertTrue(productBrand.getText().contains(brand));

    }


}
