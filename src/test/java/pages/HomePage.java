package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.*;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    public WebElement websiteLogo;

    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    public WebElement subscriptionLogo;

    @FindBy(xpath = "//a[@href='/products']")
    private WebElement productsButton;

    public void openHomePage(String url){

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    public void verifyPage(){
        assertTrue(Driver.getDriver().getCurrentUrl().contains(ConfigReader.getProperty("url")));
    }

    public void verifyHomePageUrl(String url){
        assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty(url));
    }

    public WebElement getProductsButton() {
        return productsButton;
    }
}
