package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PDPPage {

    public PDPPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
