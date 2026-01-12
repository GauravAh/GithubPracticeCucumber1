package pages;

import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DashboardPage {

    private static WebDriver driver;

    public DashboardPage(){
        this.driver = DriverFactory.getDriver();
    }

    By fbLogo = By.cssSelector("img[src*='fkheaderlogo']");
    By fashionMenuTab = By.xpath("//span[contains(text(),'Fashion')]");
    By fashionMenusList = By.cssSelector("div[class^='QAl8n6']>div:nth-of-type(2)>object>a");
    By fashionMenusList1 = By.xpath("//div[starts-with(@class,'QAl8n6')]/div[2]/object/div/following-sibling::a");

    public boolean isLogoDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(fbLogo)).isDisplayed();
    }

    public boolean validateLogo(){
        return driver.findElement(fbLogo).isDisplayed();
    }

    public boolean isMenuFaishonDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(fashionMenuTab)).isDisplayed();
    }

    public List<WebElement> getAllElements(){
        return driver.findElements(fashionMenusList1);
    }

    public WebElement hoverMouseFashion(){
        return driver.findElement(fashionMenuTab);
    }

}
