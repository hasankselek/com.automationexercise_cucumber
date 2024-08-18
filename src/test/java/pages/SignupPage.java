package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class SignupPage {

    public SignupPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    HomePageFaker hpf = new HomePageFaker();
    LoginPage loginPage = new LoginPage();

    @FindBy(id = "id_gender1")
    public WebElement maleGender;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;



    public void userSignup(){

        maleGender.click();
        passwordBox.sendKeys(hpf.getFakePassword());



    }


}
