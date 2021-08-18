package linnbank.pages;

import linnbank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.openqa.selenium.support.PageFactory.initElements;

public class GMIBankUserInfoPage {
    public GMIBankUserInfoPage(){
       initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "firstName")
    public WebElement firstNameTextBox;

    @FindBy(id = "lastName")
    public WebElement lastNameTextBox;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "langKey")
    public WebElement languageTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

}
