package Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src\\main\\java\\Circles_positive_scenario\\Circles_positive_scenario.feature",
glue= {"Circles_positive_scenario"},
monochrome = true,publish = true)
public class Circles_positive_scenario_runner extends AbstractTestNGCucumberTests {

}