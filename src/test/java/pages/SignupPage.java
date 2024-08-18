package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class SignupPage {

    public SignupPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    static LoginPage loginPage = new LoginPage();

    @FindBy(xpath = "//label[@for='id_gender1']")
    public WebElement maleGender;

    @FindBy(id = "name")
    public WebElement nameBox;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(id = "first_name")
    public WebElement firstNameBox;

    @FindBy(id = "last_name")
    public WebElement lastNameBox;

    @FindBy(id = "company")
    public WebElement companyBox;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement addressBox;

    @FindBy(id = "state")
    public WebElement stateBox;

    @FindBy(id = "city")
    public WebElement cityBox;

    @FindBy(id = "zipcode")
    public WebElement zipCodeBox;

    @FindBy(id = "mobile_number")
    public WebElement mobileNumberBox;

    @FindBy(id = "newsletter")
    public WebElement newsletterCheckbox;

    @FindBy(id = "optin")
    public WebElement optinCheckbox;

    @FindBy(id = "days")
    public WebElement selectDays;

    @FindBy(id="months")
    public WebElement selectMonth;

    @FindBy(id="years")
    public WebElement selectYear;

    @FindBy(id = "country")
    public WebElement selectCountry;


    public void userSignupFirst(String title,String name,String password){
        maleGender.click();
        nameBox.clear();
        ReusableMethods.bekle(1);
        Assert.assertEquals(maleGender.getText(),ConfigReader.getProperty(title));
        nameBox.sendKeys(ConfigReader.getProperty(name));
        ReusableMethods.bekle(1);
        passwordBox.sendKeys(ConfigReader.getProperty(password));
        selectBirthday();


    }

    public void userSignupSecond(String firstname, String lastname, String company, String address, String country, String state, String city, String zipcode, String mobilenumber){

        JSUtilities.scrollToElement(Driver.getDriver(),selectCountry);
        firstNameBox.sendKeys(ConfigReader.getProperty(firstname));
        lastNameBox.sendKeys(ConfigReader.getProperty(lastname));
        companyBox.sendKeys(ConfigReader.getProperty(company));
        ReusableMethods.bekle(1);
        addressBox.sendKeys(ConfigReader.getProperty(address));
        JSUtilities.scrollToElement(Driver.getDriver(),mobileNumberBox);
        Select countrySelect = new Select(selectCountry);
        countrySelect.selectByVisibleText(ConfigReader.getProperty(country));
        stateBox.sendKeys(ConfigReader.getProperty(state));
        ReusableMethods.bekle(1);
        cityBox.sendKeys(ConfigReader.getProperty(city));
        zipCodeBox.sendKeys(ConfigReader.getProperty(zipcode));
        mobileNumberBox.sendKeys(ConfigReader.getProperty(mobilenumber));
        JSUtilities.scrollToBottom(Driver.getDriver());






    }

    public void selectBirthday(){

        Select days = new Select(selectDays);
        days.selectByVisibleText(ConfigReader.getProperty("Day"));

        Select months = new Select(selectMonth);
        months.selectByVisibleText(ConfigReader.getProperty("Month"));

        Select years = new Select(selectYear);
        years.selectByVisibleText(ConfigReader.getProperty("Year"));
   }


}
