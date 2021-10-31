package stepDefinition;

import PageObject.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import utility.ClassHelp;
import utility.DefaultData;
import utility.Hooks;
import utility.TestData;

public class LoginStepDefinition {
    WebDriver driver;
    Hooks hooks = new Hooks();
    TestData testData = new TestData();
    Homepage homepage = new Homepage();

    @Given("^Initiate Browser$")
    public void initiate_Browser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        testData.setIsHeadless(ClassHelp.getEnv("DontRunningBrowser"));
        hooks = new Hooks();
        System.out.println("Hooks :" + hooks);
        driver = hooks.openBrowser(ClassHelp.getEnv("browser"));
        System.out.println("Driver : " + driver);
    }

    @Given("^setup SetTestData$")
    public void setup_SetTestData() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        DefaultData.setTestData();
        System.out.println("Setup Data Done");
        driver.manage().window().maximize();
    }
    @Given("^Navigate Bukalapak\\.com$")
    public void navigate_Bukalapak_com()  {
        // Write code here that turns the phrase above into concrete actions
        homepage.GotoMidtransPage();
    }

    @Then("^navigate to login page$")
    public void navigate_to_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homepage.LoginPage();
    }

    @Then("^input email$")
    public void input_username() {
        // Write code here that turns the phrase above into concrete actions
        homepage.InputUsername();
    }

    @Then("^input password$")
    public void input_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homepage.InputPassword();
    }

    @Then("^Click login Button$")
    public void click_login_Button(){
        // Write code here that turns the phrase above into concrete actions
        homepage.clicklogin();
    }

    @Then("^Search \"([^\"]*)\"$")
    public void search(String barang) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homepage.setSearchType(barang);

    }

    @Then("^Add To chart$")
    public void add_To_chart() throws Throwable {
        homepage.setAdtoCharts();
        // Write code here that turns the phrase above into concrete actions
    }
}
