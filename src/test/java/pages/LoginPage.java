package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement name;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement email;


    public void fillNewUserSignup(String nameText, String emailText){

        name.sendKeys(ConfigReader.getProperty(nameText));
        email.sendKeys(ConfigReader.getProperty(emailText));

    }
}
