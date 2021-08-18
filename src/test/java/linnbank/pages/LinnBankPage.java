package linnbank.pages;

import linnbank.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LinnBankPage {
    public LinnBankPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
