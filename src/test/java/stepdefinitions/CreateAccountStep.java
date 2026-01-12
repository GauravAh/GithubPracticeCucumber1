package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CreateAccountPage;

import java.util.List;
import java.util.Map;

public class CreateAccountStep {

    CreateAccountPage crPage;

    @Given("I am on a facebook create account page")
    public void i_am_on_a_facebook_create_account_page() {
        crPage = new CreateAccountPage();
        System.out.println("Running CreateAccountStep");
        Assert.assertTrue(crPage.fbLogoDisplayed(),"Facebook logo is not displayed");
    }
    @When("I enter firstname {string} in name field")
    public void i_enter_firstname_in_name_field(String fName) {
        crPage.sendFirstName(fName);
    }
    @When("I enter surname {string} in name field")
    public void i_enter_surname_in_name_field(String lName) {
        crPage.sendSecondName(lName);
    }
    @When("I select date of birth from dropdown list")
    public void i_select_date_of_birth_from_dropdown_list() {
        crPage.sendDOB("14","Sep","1989");
    }
    @When("I select gender {string}>")
    public void i_select_gender(String gender) {
        crPage.selectGender(gender);
    }
    @When("I enter mobile no {string}> in text field")
    public void i_enter_mobile_no_in_text_field(String mobileNo) {
        crPage.sendMobileNo(mobileNo);
    }
    @When("I enter new password {string}")
    public void i_enter_new_password(String string) {

    }
    @When("I click on signup button")
    public void i_click_on_signup_button() {

    }
    @Then("Validation should be displayed")
    public void validation_should_be_displayed() {

    }

    @When("I enter below registration details")
    public void i_enter_below_registration_details(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String,String>> data = dataTable.asMaps();
        for(Map<String,String> hData : data){
            crPage.sendFirstName(hData.get("FirstName"));
            crPage.sendSecondName(hData.get("LastName"));
            crPage.sendMobileNo(hData.get("MobileNo"));
            crPage.sendPassword(hData.get("NewPassword"));
        }
    }

    @When("I select gender from radio button")
    public void i_select_gender_from_radio_button() {

    }

}
