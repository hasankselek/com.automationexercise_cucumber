package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class ContactUsPage {

    public  ContactUsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement nameBox;

    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement emailBox;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    private WebElement subjectBox;

    @FindBy(xpath = "//textarea[@id='message']")
    private WebElement messageBox;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    private WebElement successMessage;

    @FindBy(xpath = "//input[@name='upload_file']")
    private WebElement chooseFileButton;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submitButton;

    public  void fillContactUsForm(String name,String email,String subject,String message){
        nameBox.sendKeys(ConfigReader.getProperty(name));
        emailBox.sendKeys(ConfigReader.getProperty(email));
        subjectBox.sendKeys(ConfigReader.getProperty(subject));
        messageBox.sendKeys(ConfigReader.getProperty(message));
    }

    public  void uploadFile(){
        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/test.txt";
        String fullPath = projectPath + "/" + filePath;
        chooseFileButton.sendKeys(fullPath);
    }

    public  void submitClick(){
        submitButton.click();
    }

    public  void okButtonClick(){
        Driver.getDriver().switchTo().alert().accept();
    }

}
