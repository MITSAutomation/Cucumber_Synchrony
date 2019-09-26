package com.mits.stepDefinations;

import org.openqa.selenium.WebDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.mits.GenericAutomation;
import com.mits.exception.CustomizedException;
import com.mits.util.Constants;
import com.mits.util.ResourceLoader;
import java.util.Map;
import org.apache.*;
import org.apache.log4j.Logger;

public class CaseManagerStepDefinations {
	public static Logger logger = Logger.getLogger(CaseManagerStepDefinations.class);
	static ResourceLoader loader = new ResourceLoader();

	@Given("^User Open Browser$")
	public void user_Open_Browser() throws Throwable {
		GenericAutomation.openBrowser();
	}

	@Then("^Enters valid user name \"([^\"]*)\"$")
	public void enters_valid_user_name(String username) throws Throwable {
		GenericAutomation.writeInInput(loader.getProperty(Constants.UserName), username);
	}

	@Then("^Enters valid password \"([^\"]*)\"$")
	public void enters_valid_password(String password) throws Throwable {
		GenericAutomation.writeInInput(loader.getProperty(Constants.Password), password);
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
		GenericAutomation.clickButton(loader.getProperty(Constants.LoginID));
	}

	@Then("^select the solution \"([^\"]*)\"$")
	public void select_the_solution(String tab) throws Throwable {
		GenericAutomation.selectText(loader.getProperty(Constants.SelectText), tab);

	}

	@Then("^select the role  \"([^\"]*)\"$")
	public void select_the_role(String arg1) throws Throwable {

		GenericAutomation.selectText(loader.getProperty(Constants.SelectText), arg1);

	}

	@Then("^Open the \"([^\"]*)\"$")
	public void open_the(String caseID) throws Throwable {
		GenericAutomation.selectText(loader.getProperty(Constants.SelectText), caseID);//
	}

	@Then("^perform action \"([^\"]*)\"$")
	public void perform_action(String Response) throws Throwable {
		GenericAutomation.clickButtonfromlist(loader.getProperty(Constants.Button), Response);
	}

	@Given("^User Open Browser1$")
	public void user_Open_Browser1() throws Throwable {

		GenericAutomation.openBrowser();
		// TODO Auto-generated catch block

		System.out.println("open browser called");
	}

	@Then("^Enters valid user name1 \"([^\"]*)\"$")
	public void enters_valid_user_name1(String username) throws Throwable {
		GenericAutomation.writeInInput(loader.getProperty(Constants.UserName), username);
	}

	@Then("^Enters valid password1 \"([^\"]*)\"$")
	public void enters_valid_password1(String password) throws Throwable {
		GenericAutomation.writeInInput(loader.getProperty(Constants.Password), password);
	}

	@Then("^Click on Login Button1$")
	public void click_on_Login_Button1() throws Throwable {
		GenericAutomation.clickButton(loader.getProperty(Constants.LoginID));
	}

	@Then("^select the solution1 \"([^\"]*)\"$")
	public void select_the_solution1(String tab) throws Throwable {
		// try {

		GenericAutomation.selectText(loader.getProperty(Constants.SelectText), tab);
		// } catch (Exception e) {
		// logger.info("Test the exe::" + e.getMessage());

		// }
	}

	@Then("^select the role1  \"([^\"]*)\"$")
	public void select_the_role1(String arg1) throws Throwable {

		GenericAutomation.selectText(loader.getProperty(Constants.SelectText), arg1);

	}

	@Then("^Open the1 \"([^\"]*)\"$")
	public void open_the1(String caseID) throws Throwable {

		GenericAutomation.selectText(loader.getProperty(Constants.SelectText), caseID);
		// TODO Auto-generated catch block
		System.out.println("Display the case id---->>>");

	}
}
/*
 * System.out.println("CaseManagerStepDefinations.enters_valid_user_details() :: \n Hash Map Size :: "+m.size());
 * System.out. println("CaseManagerStepDefinations.enters_valid_user_details() :: \n Hash Map Size :: "+m); 
 * String String1 = (java.lang.String) m.get("Username");
 * System.out.println("Username :: "+(m.get("Username")));
 * System.out.println("Password :: "+(m.get("password"))); 
 * String String2 =(java.lang.String) m.get("password");
 */
// GenericAutomation.exceldata();

/*
 * System.out.println("CaseManagerStepDefinations.enters_valid_user_details() :: \n Hash Map Size :: "+m.size());
 * System.out.println("CaseManagerStepDefinations.enters_valid_user_details() :: \n Hash Map Size :: " +m); 
 * String String1 = (java.lang.String) m.get("Username");
 * System.out.println("Username :: "+(m.get("Username")));
 * System.out.println("Password :: "+(m.get("password"))); 
 * String String2 =(java.lang.String) m.get("password");
 * 
 */
// GenericAutomation.exceldata();