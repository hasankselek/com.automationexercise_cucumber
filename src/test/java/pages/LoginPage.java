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
    public WebElement nameBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement signupEmailBox;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmailBox;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordBox;


    public void fillNewUserSignup(String nameText, String emailText){

        nameBox.sendKeys(ConfigReader.getProperty(nameText));
        signupEmailBox.sendKeys(ConfigReader.getProperty(emailText));

    }

    public void login(String correct_email, String correct_password){
        loginEmailBox.sendKeys(ConfigReader.getProperty(correct_email));
        passwordBox.sendKeys(ConfigReader.getProperty(correct_password));
    }
}
