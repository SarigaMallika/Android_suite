package Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src\\main\\java\\Circles_negative_scenario\\Circles_negative_scenario.feature",
glue= {"Circles_negative_scenario"},
monochrome = true,publish = true)
public class Circles_negative_scenario_runner extends AbstractTestNGCucumberTests {

}