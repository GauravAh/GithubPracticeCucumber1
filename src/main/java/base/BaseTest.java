package base;

import org.openqa.selenium.WebDriver;

public class BaseTest {

    WebDriver driver;

    public void initializeApplication(){
        driver = DriverFactory.initiateDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");
    }

}
