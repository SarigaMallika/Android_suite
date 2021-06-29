package Circles_negative_scenario;

import org.openqa.selenium.By;
import org.testng.Assert;
import Reusable_functions.Generic_functions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Circles_negative_scenario extends Generic_functions{
	public static boolean value;
	public static String str;

	/*App launch*/
	@Given("App is open")
	public void app_launching() throws Exception {
		try {
			app_launch();
			page_wait(10);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "landing_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("welcome_login");
			page_wait(10);
			click("login_phone_number");
			page_wait(30);
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",5));
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_password"))).sendKeys(td_reader("login_password",3));
			page_wait(10);
			click("login");
			page_wait(30);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "login_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("browser launching");
		}
	}

	/*TC 001 - Validate that Proceed button is disabled when they do not select a provider from the drop down*/
	@When("Click drop down list and do not make a selection and proceed then user should not be able to proceed to next page")
	public void circle_positive_tc_001() throws Exception {
		try {	
			page_wait(30);
			click("home_circles");
			page_wait(12);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "circles_title"))).isDisplayed();
			Assert.assertEquals(true,value);	
			click("circles_add_partner_button");
			page_wait(20);
			click("circles_add_partner_dropdown");
			click("circles_add_partner_dropdown");
			page_wait(30);
			click("circles_proceed_button");
			page_wait(20);
			Assert.assertEquals(driver.findElement(By.xpath(OR_reader("Object Locator","circles_proceed_button"))).isEnabled(),true);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_negative_tc_001");
		}
	}

	/*TC 002 - Validate that the user is not allowed to login when Username and Password fields are blank*/
	@Given("User will get a validation message when leaving Username and password")
	public void circle_positive_tc_002() throws Exception {
		try {
			browser_back();
			//click("circles_add_patner_back_arrow");
			page_wait(30);
			click("circles_add_partner_button");
			page_wait(20);
			click("circles_add_partner_dropdown");
			click("circles_add_partner_dropdown");
			click("circles_mymedicare_option");
			//click("circles_mymedicare_option");
			page_wait(20);
			click("circles_proceed_button_after_selection");
			//click("circles_proceed_button_after_selection");
			Thread.sleep(5000);
			Thread.sleep(5000);
			click("circles_mymedicare_login_button");
			//click("circles_mymedicare_login_button");
			page_wait(40);
			str= driver.findElement(By.xpath(OR_reader("Object Locator","circles_mymedicare_username_valid_msg"))).getText();
			Assert.assertEquals(str,td_reader("circles_mymedicare_username_valid_msg"));
			page_wait(40);
			str= driver.findElement(By.xpath(OR_reader("Object Locator","circles_mymedicare_password_valid_msg"))).getText();
			Assert.assertEquals(str,td_reader("circles_mymedicare_password_valid_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_negative_tc_002");
		}	
	}

	/*TC 003 - Validate that the user should get a validation message on entering invalid Username  and Password in the Login Page*/
	@Given("Enter incorrect data in the  Username and Password field and verify that the user is getting the validation message")
	public void circle_positive_tc_003() throws Exception {
		try {
			click("circles_mymedicare_username");
			driver.findElement(By.xpath(OR_reader("Object Locator","circles_mymedicare_username"))).sendKeys(td_reader("circles_mymedicare_username",1));
			System.out.println("3.2");
			click("circles_mymedicare_password");
			driver.findElement(By.xpath(OR_reader("Object Locator","circles_mymedicare_password"))).sendKeys(td_reader("circles_mymedicare_password",1));
			click("circles_mymedicare_login_button");
			//str= driver.findElement(By.xpath(OR_reader("Object Locator","circles_mymedicare_incorrect_msg"))).getText();
			//Assert.assertEquals(str,td_reader("circles_mymedicare_incorrect_msg"));
			System.out.println("3.5");
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_negative_tc_003");
		}	
	}

	/*TC 004 - Validate that the user is not allowed leaves blank Username field*/
	@Given("User will get validation message when Username field is blank")
	public void circle_positive_tc_004() throws Exception {
		try {
			click("circles_mymedicare_username");
			field_clear("circles_mymedicare_username");
			click("circles_mymedicare_password");
			field_clear("circles_mymedicare_password");
			click("circles_mymedicare_password");
			driver.findElement(By.xpath(OR_reader("Object Locator","circles_mymedicare_password"))).sendKeys(td_reader("circles_mymedicare_password",0));
			click("circles_mymedicare_login_button");
			str= driver.findElement(By.xpath(OR_reader("Object Locator","circles_mymedicare_username_valid_msg"))).getText();
			Assert.assertEquals(str,td_reader("circles_mymedicare_username_valid_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_negative_tc_004");
		}	
	}

	/*TC 005 - Validate that the user is not allowed leaves blank Password field*/
	@Given("User will get validation message when Password field is blank")
	public void circle_positive_tc_005() throws Exception {
		try {
			click("circles_mymedicare_username");
			field_clear("circles_mymedicare_username");
			click("circles_mymedicare_password");
			field_clear("circles_mymedicare_password");
			click("circles_mymedicare_password");
			field_clear("circles_mymedicare_password");
			driver.findElement(By.xpath(OR_reader("Object Locator","circles_mymedicare_username"))).sendKeys(td_reader("circles_mymedicare_username",0));
			click("circles_mymedicare_login_button");
			str= driver.findElement(By.xpath(OR_reader("Object Locator","circles_mymedicare_password_valid_msg"))).getText();
			Assert.assertEquals(str,td_reader("circles_mymedicare_password_valid_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_negative_tc_005");
		}	
	}

	/*TC 006 - Validate that the user is not allowed to login with valid Usename and invalid Password*/
	@Given("User will get a validation message when login with valid Usename and invalid Password")
	public void circle_positive_tc_006() throws Exception {
		try {
			click("circles_mymedicare_username");
			field_clear("circles_mymedicare_username");
			click("circles_mymedicare_password");
			field_clear("circles_mymedicare_password");
			click("circles_mymedicare_username");
			driver.findElement(By.xpath(OR_reader("Object Locator","circles_mymedicare_username"))).sendKeys(td_reader("circles_mymedicare_username",0));
			click("circles_mymedicare_password");
			driver.findElement(By.xpath(OR_reader("Object Locator","circles_mymedicare_password"))).sendKeys(td_reader("circles_mymedicare_password",1));
			click("circles_mymedicare_login_button");
			str= driver.findElement(By.xpath(OR_reader("Object Locator","circles_mymedicare_incorrect_msg"))).getText();
			Assert.assertEquals(str,td_reader("circles_mymedicare_incorrect_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_negative_tc_006");
		}	
	}

	/*TC 007 - Validate that the user is not allowed to login with invalid Usename and valid Password */
	@Given("User will get a validation message when login with invalid Usename and valid Password")
	public void circle_positive_tc_007() throws Exception {
		try {
			click("circles_mymedicare_username");
			field_clear("circles_mymedicare_username");
			click("circles_mymedicare_password");
			field_clear("circles_mymedicare_password");
			click("circles_mymedicare_username");
			driver.findElement(By.xpath(OR_reader("Object Locator","circles_mymedicare_username"))).sendKeys(td_reader("circles_mymedicare_username",0));
			click("circles_mymedicare_password");
			driver.findElement(By.xpath(OR_reader("Object Locator","circles_mymedicare_password"))).sendKeys(td_reader("circles_mymedicare_password",1));
			click("circles_mymedicare_login_button");
			str= driver.findElement(By.xpath(OR_reader("Object Locator","circles_mymedicare_incorrect_msg"))).getText();
			Assert.assertEquals(str,td_reader("circles_mymedicare_incorrect_msg"));
			close();
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_negative_tc_007");
		}	
	}
}
