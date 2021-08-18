package linnbank.pages;

import linnbank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.openqa.selenium.support.PageFactory.initElements;

public class GMIBankPasswordPage {
    public GMIBankPasswordPage(){
        initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "currentPassword")
    public WebElement currentPasswordTextBox;

    @FindBy(id = "newPassword")
    public  WebElement newPasswordTextBox;

    @FindBy(id = "confirmPassword")
    public WebElement confirmPasswordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;
}
