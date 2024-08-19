package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    private WebElement signupLoginButton;

    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    public WebElement websiteLogo;

    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    public WebElement subscriptionLogo;

    @FindBy(id = "susbscribe_email")
    private WebElement emailBox;

    @FindBy(id = "subscribe")
    private WebElement subscribeButton;

    public void openHomePage(String url){

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    public void verifyPage(){

        assertTrue(Driver.getDriver().getCurrentUrl().contains(ConfigReader.getProperty("url")));
    }

    public void verifyHomePageUrl(String url){
        assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty(url));
    }

    public void fillEmailboxAndSearch(String email){
        emailBox.sendKeys(ConfigReader.getProperty(email));
        ReusableMethods.bekle(2);
        subscribeButton.click();

    }






}
