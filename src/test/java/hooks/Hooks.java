package hooks;

import base.BaseTest;
import base.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import reporting.ExtentManager;
import reporting.ExtentTestManager;
import utils.ScreenshotUtil;

public class Hooks extends BaseTest {

    @Before
    public void setUp(Scenario scenario){
        ExtentTest test = ExtentManager.getInstance().createTest(scenario.getName());
        ExtentTestManager.setTest(test);
        initializeApplication();
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            String screenshot = ScreenshotUtil.takeScreenshot(scenario.getName());
            ExtentTestManager.getTest().fail("Scenario Failed")
                    .addScreenCaptureFromPath(screenshot);
        }else {
            String screenshot = ScreenshotUtil.takeScreenshot(scenario.getName());
            ExtentTestManager.getTest().pass("Scenario passed")
                    .addScreenCaptureFromPath(screenshot);
        }
        ExtentManager.getInstance().flush();
       // DriverFactory.quitBrowser();
    }

}
