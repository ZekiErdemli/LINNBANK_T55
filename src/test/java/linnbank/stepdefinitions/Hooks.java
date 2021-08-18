package linnbank.stepdefinitions;




import cucumber.api.Scenario;
import linnbank.utilities.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setup() {
      //  System.out.println("setUp Calisti");

    }
    @After
    public void tearDown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.embed(screenshot, "image/png");

        }
        Driver.closeDriver();
    }


}
