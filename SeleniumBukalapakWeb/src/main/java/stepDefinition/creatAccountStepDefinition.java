package stepDefinition;

import PageObject.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utility.Hooks;

public class creatAccountStepDefinition {
    WebDriver driver;
    Hooks hooks = new Hooks();
    Homepage homepage = new Homepage();
    @Given("^Navigate Registration Page$")
    public void navigate_Registration_Page() throws Throwable {
        homepage.RegistrationPage();
    }


    @Then("^input new email \"([^\"]*)\"$")
    public void input_new_email(String arg1) throws Throwable {
        homepage.newEmail(arg1);
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^input already email \"([^\"]*)\"$")
    public void input_already_email(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homepage.setAlreadyEmail(arg1);
    }

}
