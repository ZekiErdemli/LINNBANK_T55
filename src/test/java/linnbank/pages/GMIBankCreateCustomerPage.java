package linnbank.pages;

import linnbank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.openqa.selenium.support.PageFactory.initElements;

public class GMIBankCreateCustomerPage {
    public GMIBankCreateCustomerPage(){
        initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "search-ssn")
    public WebElement ssnSearchTextBox;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchButton;

    @FindBy(id = "tp-customer-firstName")
    public WebElement firstnameTextBox;

    @FindBy(id = "tp-customer-lastName")
    public WebElement lastnameTextBox;

    @FindBy(id = "tp-customer-middleInitial")
    public WebElement middleInitialTextBox;

    @FindBy(id = "tp-customer-email")
    public WebElement emailTextBox;

    @FindBy(id = "tp-customer-mobilePhoneNumber")
    public WebElement phoneNumberTextBox;

    @FindBy(id = "tp-customer-zipCode")
    public WebElement zipCodeTextBox;

    @FindBy(id = "tp-customer-address")
    public WebElement addressTextBox;

    @FindBy(id = "tp-customer-city")
    public WebElement cityTextBox;

    @FindBy(id = "tp-customer-ssn")
    public WebElement ssnTextBox;

    @FindBy(id = "tp-customer-createDate")
    public WebElement createDateTextBox;

    @FindBy(id = "tp-customer-country")
    public WebElement countryList;

    @FindBy(id = "tp-customer-state")
    public WebElement stateTextBox;

    @FindBy(id = "tp-customer-user")
    public WebElement userList;

    @FindBy(id = "tp-customer-account")
    public WebElement accountList;

    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement zelleCheckBox;

    @FindBy(id = "cancel-save")
    public WebElement backButton;

    @FindBy(id = "save-entity")
    public WebElement saveButton;
}
