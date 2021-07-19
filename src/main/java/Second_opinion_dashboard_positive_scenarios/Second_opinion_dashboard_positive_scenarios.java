package Second_opinion_dashboard_positive_scenarios;

import org.openqa.selenium.By;
import org.testng.Assert;
import Reusable_functions.Generic_functions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Second_opinion_dashboard_positive_scenarios extends Generic_functions {
	static boolean value;

	/* Application opens and enter URL*/ 	
	@Given("Application is open and clicks on the login button and navigated to the login page")
	public void app_open() throws Exception  {
		try {
			app_launch();
			page_wait(10);
			value = driver.findElement(By.xpath(OR_reader("welcome_page_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("welcome_login");
//			click("login_phone_number");
//			driver.findElement(By.xpath(OR_reader("login_phone_number"))).sendKeys(td_reader("login_phone_number",0));
//			driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password",0));
//			page_wait(10);
//			click("login");
//			page_wait(30);
//			value = driver.findElement(By.xpath(OR_reader("login_page_title"))).isDisplayed();
//			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*  TC_001-Validate that the user is able to click on the Second Opinion tab*/	
	@When("click on the second opinion tab")
	public void second_opinion_positive_dashboard_tc_001() throws Exception {
		try {
			page_wait(20);
			click("services");
			page_wait(20);
			click("second_opinions");
			page_wait(50);
			value=driver.findElement(By.xpath(OR_reader("second_opinions_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			takeScreenShot("second_opinion_positive_dashboard_tc_001");
		}
	}

	/* TC_002-Validate that the user is able to click on Resume Cases and dialogue box is displayed*/
	@Then ("clicks on Resume Cases")
	public void second_opinion_positive_dashboard_tc_002() throws Exception, InterruptedException{
		try{
			page_wait(30);
			stale_click("so_resume_case");
			page_wait(30);
			click("so_switch_ok_button");
			value = driver.findElement(By.xpath(OR_reader("so_resume_case_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			takeScreenShot("second_opinion_positive_dashboard_tc_002");
		}
	}
	
	/* TC_003- Validate that the user is able to click on Plus icon and dialogue box is displayed*/
	@Then ("clicks on plus icon")
	public void second_opinion_positive_dashboard_tc_003() throws Exception, InterruptedException{
		try{
			page_wait(30);
			stale_click("so_plus_icon");
			page_wait(30);
			click("so_switch_ok_button");
			value = driver.findElement(By.xpath(OR_reader("so_resume_case_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			takeScreenShot("second_opinion_positive_dashboard_tc_003");
		}
	}

	/* TC_004 - Validate that User is able to click on Requested tab */
	@Then ("User clicks on the Requested tab")
	public static void second_opinion_positive_dashboard_tc_004() throws Exception, InterruptedException
	{
		try {
			click("so_requested_tab");
			value = driver.findElement(By.xpath(OR_reader("so_requested_msg"))).isDisplayed();
			Assert.assertEquals(true,value);
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("second_opinion_positive_dashboard_tc_004");
		}
	}

	/* TC_005 - Validate that User is able to click on Reviewed tag */
	@Then ("User clicks on the Reviewed tag")
	public static void second_opinion_positive_dashboard_tc_005() throws Exception
	{ 
		try {
			click("so_reviewed_tab"); 
			page_wait(30);
			value = driver.findElement(By.xpath(OR_reader("so_reviewed_msg"))).isDisplayed();			
			Assert.assertEquals(true,value);
			close();
		}
		catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("second_opinion_positive_dashboard_tc_005");
		}
	}

}
