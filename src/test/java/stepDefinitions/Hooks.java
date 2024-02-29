package stepDefinitions;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import factory.C_BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

 
public class Hooks {

	 WebDriver driver;
	 Properties p;
	 public static TakesScreenshot ts;

	@Before
    public void setup() throws IOException
    {
    	driver=C_BaseClass.initilizeBrowser();
    	p=C_BaseClass.getProperties();
    	driver.get(p.getProperty("appURL"));
    	driver.manage().window().maximize();
	}


    @After
    public void tearDown(Scenario scenario) {
       driver.quit();
    }
 
    @AfterStep
    public void addScreenshot(Scenario scenario) {
    	// this is for cucumber junit report
        if(scenario.isFailed()) {
        	ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
        }

        else {
        	ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
        }

    }

}