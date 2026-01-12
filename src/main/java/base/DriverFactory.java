package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> lDriver = new ThreadLocal<>();

    public static WebDriver initiateDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        lDriver.set(driver);
        getDriver().manage().window().maximize();
        return getDriver();
    }

    public static WebDriver getDriver(){
        return lDriver.get();
    }

    public static void quitBrowser(){
        if(getDriver()!=null){
            getDriver().quit();
        }
    }

}
