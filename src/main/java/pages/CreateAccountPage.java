package pages;

import base.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateAccountPage {

    WebDriver driver;

    public CreateAccountPage(){
        driver = DriverFactory.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "img[alt='Facebook']")
    private WebElement fbLogo;

    @FindBy(name = "firstname")
    private WebElement firstName;

    @FindBy(name = "lastname")
    private WebElement lastName;

    @FindBy(css = "select[id='day']")
    private WebElement day;

    @FindBy(css = "select[id='month']")
    private WebElement month;

    @FindBy(css = "select[id='year']")
    private WebElement yearS;

    @FindBy(css = "label[class='_58mt']>input[value='2']")
    private WebElement gender;

    @FindBy(css = "input[name='reg_email__']")
    private WebElement emailAdd;

    @FindBy(css = "input[name='reg_passwd__']")
    private WebElement emailPass;

    @FindBy(css = "button[id='u_0_n_2S']")
    private WebElement signUp;

    @FindBy(xpath = "//input[@type='radio' and @value=1]")
    private WebElement femaleRadio;

    @FindBy(xpath = "//input[@type='radio' and @value=2]")
    private WebElement maleRadio;

    @FindBy(xpath = "//input[@type='radio' and @value=2]")
    private WebElement customRadio;

    public void sendFirstName(String fName){
        firstName.sendKeys(fName);
    }

    public void sendSecondName(String lName){
        lastName.sendKeys(lName);
    }

    public void sendDOB(String dVal, String mVal, String yVal){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(day));

        Select daySelect = new Select(day);
        daySelect.selectByVisibleText(dVal);

        Select monthSelect = new Select(month);
        monthSelect.selectByVisibleText(mVal);

        Select yearSelect = new Select(yearS);
        yearSelect.selectByVisibleText(yVal);
    }

    public void selectGender(String gender){
        if(gender.equals("Male")){
            maleRadio.click();
        }else if(gender.equals("Female")){
            femaleRadio.click();
        }else {
            customRadio.click();
        }
    }

    public void sendMobileNo(String mobileNo) {
        emailAdd.sendKeys(mobileNo);
    }
    public void sendPassword(String pass) {
        emailPass.sendKeys(pass);
    }
    public boolean fbLogoDisplayed(){
        return fbLogo.isDisplayed();
    }

}
