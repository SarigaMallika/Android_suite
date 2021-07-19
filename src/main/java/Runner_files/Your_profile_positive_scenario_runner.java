package Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src\\main\\java\\Your_profile_positive_scenario\\Your_profile_positive_scenario.feature",
glue= {"Your_profile_positive_scenario"},
monochrome = true,publish = true)
public class Your_profile_positive_scenario_runner extends AbstractTestNGCucumberTests {

}