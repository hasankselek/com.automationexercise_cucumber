package pages;


import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Driver;


import static org.junit.Assert.assertTrue;

public class HomePage {



    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signupLoginButton;

    public void openHomePage(String url){

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    public void verifyPage(){
        assertTrue(Driver.getDriver().getCurrentUrl().contains(ConfigReader.getProperty("url")));
    }




}
