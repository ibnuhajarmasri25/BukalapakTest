package TestRunner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features/",
        glue = {"stepDefinition"},
        tags = {"@login"},
        plugin = {"html:target/cucumber-report/bukalapak.html","json:target/cucumber-report/bukalapak.json","com.cucumber.listener.ExtentCucumberFormatter:target/Bukalapak-report/Bukalapak.html"},
//        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/Bukalapak-report/Bukalapak.html"},
        dryRun = false,
        monochrome = true
)
public class RunnerTest {
    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig("src/main/java/resources/extent-config.xml");
        Reporter.setSystemInfo("Author ","Ibnu Hazar Masri");
        Reporter.setSystemInfo("Time Zone ", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine ", 	"Windows 10 " + " 64 Bit");
        Reporter.setSystemInfo("CUCUMBER SELENIUM :", "Bukalapak.com" + "BUKALAPAK");
        Reporter.setSystemInfo("Bukalapak ","Bukalapak.com");
    }
}

