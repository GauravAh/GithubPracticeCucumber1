package stepdefinitions;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.CreateAccountPage;
import pages.DashboardPage;

import java.time.Duration;
import java.util.List;

public class DashboardStep {

    WebDriver driver;
    DashboardPage dashboardPage;
    CreateAccountPage crPage;

    @Given("I am on flipkart page")
    public void i_am_on_flipkart_page() throws InterruptedException {
        Thread.sleep(2000);
        driver = DriverFactory.getDriver();
       /* dashboardPage = new DashboardPage();
        Assert.assertTrue(dashboardPage.isLogoDisplayed(), "Flipkart logo not displayed");
        Assert.assertTrue(dashboardPage.validateLogo());*/
        crPage = new CreateAccountPage();
        System.out.println("Running DashboardStep");
        Assert.assertTrue(crPage.fbLogoDisplayed(),"Facebook logo is not displayed");

    }

    @When("I hover mouse over menu tab")
    public void i_hover_mouse_over_menu_tab() {
       /* Assert.assertTrue(dashboardPage.isMenuFaishonDisplayed(), "Faishon Menu not displayed");
        Actions actions = new Actions(driver);
        actions.moveToElement(dashboardPage.hoverMouseFashion()).perform();*/
    }

    @Then("The fashion section should be displayed")
    public void the_fashion_section_should_be_displayed() {

    }

    @Then("User clicks on Mens T-shirt")
    public void user_clicks_on_mens_t_shirt() {
        /*List<WebElement> allList = dashboardPage.getAllElements();
        for(WebElement fashionList : allList){
            String textVal = fashionList.getText();
            if (textVal.equalsIgnoreCase("Men's Casual Shirts")) {

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

                WebElement link = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.xpath("//a[contains(@href,'mens-casual-shirts')]")
                        )
                );

                link.click();
            }
        }*/

        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Locate and click immediately
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[text()=\"Men's Casual Shirts\"]")
        )).click();*/

    }
    @Then("User should be navigated to Mens T-Shirt page")
    public void user_should_be_navigated_to_mens_t_shirt_page() {

    }

}
