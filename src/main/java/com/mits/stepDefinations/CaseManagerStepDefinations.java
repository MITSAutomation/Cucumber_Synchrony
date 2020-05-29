//package com.mits.stepDefinations;
//
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import java.awt.AWTException;
//
//import org.apache.log4j.Logger;
//import java.util.Properties;
//import com.mits.DriverMethods;
//import com.mits.util.*;
//
//public class CaseManagerStepDefinations {
//	 DriverMethods drivery = new DriverMethods();
//	public static Logger logger = Logger.getLogger(CaseManagerStepDefinations.class);
//	 ResourceLoader loader=new ResourceLoader();
//	 @Given("^User will open Browser$")
//	 public void user_will_open_Browser() throws Throwable {
//	     // Write code here that turns the phrase above into concrete actions
//	     throw new PendingException();
//	 }
//
////	 @Given("^User will open Browser$")
////	 public void user_will_open_Browser() throws Throwable {
////	     // Write code here that turns the phrase above into concrete actions
////	
////	     drivery.driverDetails();
////	 }	 
//	 
////	 @Given("^Enters the URL with \"([^\"]*)\" and <\"([^\"]*)\">$")
////	 public void enters_the_URL_with_and(String username, String password) throws Throwable {
////	     // Write code here that turns the phrase above into concrete actions
////		 drivery.url(loader.getProperty(Constants.IcmUrl));
////		 drivery.enterText("xpath", loader.getProperty(Constants.UserName), username);
////		 drivery.enterText("xpath", loader.getProperty(Constants.Password), password);
////		 drivery.clickOnLocator("xpath", loader.getProperty(Constants.LoginID));
////	 }}
//	 @Given("^Enters the URL with \"([^\"]*)\" and <\"([^\"]*)\">$")
//	 public void enters_the_URL_with_and(String arg1, String arg2) throws Throwable {
//	     // Write code here that turns the phrase above into concrete actions
//	     throw new PendingException();
//	 }}
//
////	@Then("^Enters valid username  \"([^\"]*)\"$")
////	public void enters_valid_username(String username) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.enterText("xpath", loader.getProperty(Constants.UserName), username);
////	}
////
////	@Then("^Enters valid password  \"([^\"]*)\"$")
////	public void enters_valid_password(String password) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.enterText("xpath", loader.getProperty(Constants.Password), password);
////	}
////	
////	@Then("^Clicks on Login Button$")
////	public void clicks_on_Login_Button() throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.clickOnLocator("xpath", loader.getProperty(Constants.LoginID));
////	}
//
////	@Then("^Clicks on Add button$")
////	public void clicks_on_Add_Buton() throws InterruptedException {
////		drivery.clickOnLocator("xpath", loader.getProperty(Constants.Add));
////	}
////
////	@Then("^Selects a Group \"([^\"]*)\" from the group name$")
////	public void selects_a_Group_from_the_group_name(String Group) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select1("xpath", loader.getProperty(Constants.groupdata), loader.getProperty(Constants.selectgroupdata),
////				Group);
////	}
////
////	@Then("^selects a segName \"([^\"]*)\" from the Segmant name$")
////	public void selects_a_segName_from_the_Segmant_name(String SegName) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select1("xpath", loader.getProperty(Constants.segmantdata),
////				loader.getProperty(Constants.SelectAlphabeticData), SegName);
////	}
////
////	@Then("^selects a Channel \"([^\"]*)\" from the Channel name$")
////	public void selects_a_Channel_from_the_Channel_name(String Channel) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select1("xpath", loader.getProperty(Constants.channel), loader.getProperty(Constants.SelectChannel),
////				Channel);
////	}
////
////	@Then("^selects a OfferType \"([^\"]*)\" from OfferType$")
////	public void selects_a_OfferType_from_OfferType(String OfferType) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select1("xpath", loader.getProperty(Constants.OtherType), loader.getProperty(Constants.SelectOfferType),
////				OfferType);
////	}
////
////	// @Then("^Selects a SPT \"([^\"]*)\" from Segmant product type$")
////	// public void selects_a_SPT_from_Segmant_product_type(String SPT) throws
////	// Throwable {
////	// // Write code here that turns the phrase above into concrete actions
////	// drivery.select1("xpath",
////	// loader.getProperty(Constants.SegmantProductType),
////	// loader.getProperty(Constants.SelectSegmantProductType), SPT);
////	// }
////
////	@Then("^Enters SOD \"([^\"]*)\" in Segmant Offer description$")
////	public void enters_SOD_in_Segmant_Offer_description(String SOD) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		// drivery.select3("xpath",
////		// loader.getProperty(Constants.SegmantOfferDescription),
////		// loader.getProperty(Constants.InnerText1), SOD,
////		// loader.getProperty(Constants.Save), save);
////		drivery.select2("xpath", loader.getProperty(Constants.SegmantOfferDescription), SOD);
////	}
////
////	@Then("^Enters TC \"([^\"]*)\" in Targetting Criteria$")
////	public void enters_TC_in_Targetting_Criteria(String TC) throws Throwable { // Write
////																				// code
////																				// here
////																				// that
////																				// turns
////																				// the
////																				// phrase
////																				// above
////																				// into
////																				// concrete
////																				// actions
////		drivery.select2("xpath", loader.getProperty(Constants.TargettingCriteria), TC);
////	}
////
////	@Then("^Selects a SOSD \"([^\"]*)\" from Segmant offer Start date$")
////	public void selects_a_SOSD_from_Segmant_offer_Start_date(String SOSD) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select2("xpath", loader.getProperty(Constants.SegmantOfferStartDate), SOSD);
////	}
////
////	@Then("^Selects a SOED \"([^\"]*)\" from Segmant offer End date$")
////	public void selects_a_SOED_from_Segmant_offer_End_date(String SOED) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select2("xpath", loader.getProperty(Constants.SegmantOfferEndDate), SOED);
////	}
////
////	@Then("^Enters SPA \"([^\"]*)\" in Sys print agent$")
////	public void enters_SPA_in_Sys_print_agent(String SPA) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select2("xpath", loader.getProperty(Constants.SysPrintAgent), SPA);
////	}
////
////	@Then("^Enters MI \"([^\"]*)\" in Merchant ID$")
////	public void enters_MI_in_Merchant_ID(String MI) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select2("xpath", loader.getProperty(Constants.MerchantID), MI);
////	}
////
////	@Then("^Enters PG \"([^\"]*)\" in Product Group code$")
////	public void enters_PG_in_Percantage_Group_code(String PGC) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select2("xpath", loader.getProperty(Constants.ProductCodegroup), PGC);
////	}
////
////	@Then("^Selects a CTT \"([^\"]*)\" from card tier type$")
////	public void selects_a_CTT_from_card_tier_type(String CTT) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select1("xpath", loader.getProperty(Constants.CardTierType),
////				loader.getProperty(Constants.SelectCardData), CTT);
////	}
////
////	@Then("^Selects a OL \"([^\"]*)\" from Offer Location$")
////	public void selects_a_OL_from_Offer_Location(String OL) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select1("xpath", loader.getProperty(Constants.OfferLocation),
////				loader.getProperty(Constants.SelectOfferData), OL);
////	}
////
////	@Then("^Selects a lan \"([^\"]*)\" from Language$")
////	public void selects_a_lan_from_Language(String lan) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select_1("xpath", loader.getProperty(Constants.Language),  lan);
////	}
////
////	@Then("^Selects a MC \"([^\"]*)\" from Merchant Category$")
////	public void selects_a_MC_from_Merchant_Category(String MC) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select2("xpath", loader.getProperty(Constants.MercahntCategory),
////				 MC);
////	}
////
////	@Then("^selects a Test \"([^\"]*)\" from Test Control$")
////	public void selects_a_Test_from_Test_Control(String TestV) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select2("xpath", loader.getProperty(Constants.TestControl),
////				TestV);
////	}
////
////	@Then("^writes SegPer \"([^\"]*)\" from Segamnt percent$")
////	public void writes_SegPer_from_Segamnt_percent(String SegPer) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select2("xpath", loader.getProperty(Constants.SegmantPercent), SegPer);
////	}
////
////	@Then("^Enters SC \"([^\"]*)\" in Segmant Count$")
////	public void enters_SC_in_Segmant_Count(String SC) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select2("xpath", loader.getProperty(Constants.SegamantCount), SC);
////	}
////
////	@Then("^Selects RC \"([^\"]*)\" from Remail counter$")
////	public void selects_RC_from_Remail_counter(String RC) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select2("xpath", loader.getProperty(Constants.RemailCounter),
////				 RC);
////	}
////
////	@Then("^Selects TP \"([^\"]*)\" from Target population$")
////	public void selects_TP_from_Target_population(String TP) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select2("xpath", loader.getProperty(Constants.TagetSolution),
////				 TP);
////	}
////
////	@Then("^Enters ES \"([^\"]*)\" in Email Subject$")
////	public void enters_ES_in_Email_Subject(String ES) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select2("xpath", loader.getProperty(Constants.EmailSubject), ES);
////	}
////
////	@Then("^Enters EPH \"([^\"]*)\" in Email pre Header$")
////	public void enters_EPH_in_Email_pre_Header(String EPH) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select2("xpath", loader.getProperty(Constants.EmailPreHeader), EPH);
////	}
////
////	@Then("^Enters CC \"([^\"]*)\" in Creative Code$")
////	public void enters_CC_in_Creative_Code(String CC) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select_1("xpath", loader.getProperty(Constants.CreativeCode), CC);
////	}
////
////	@Then("^Enters CM \"([^\"]*)\" in CisMemmo$")
////	public void enters_CM_in_CisMemmo(String CM) throws Throwable {
////		// Write code here that turns the phrase above into concrete actions
////		drivery.select2("xpath", loader.getProperty(Constants.CiSMemmo), CM);
////	}
////
////}
////
/////*
//// * System.out.println(
//// * "CaseManagerStepDefinations.enters_valid_user_details() :: \n Hash Map Size :: "
//// * +m.size()); System.out. println(
//// * "CaseManagerStepDefinations.enters_valid_user_details() :: \n Hash Map Size :: "
//// * +m); String String1 = (java.lang.String) m.get("Username");
//// * System.out.println("Username :: "+(m.get("Username"))); System.out.println(
//// * "Password :: "+(m.get("password"))); String String2 =(java.lang.String)
//// * m.get("password");
//// */
////// GenericAutomation.exceldata();
////
/////*
//// * System.out.println(
//// * "CaseManagerStepDefinations.enters_valid_user_details() :: \n Hash Map Size :: "
//// * +m.size()); System.out.println(
//// * "CaseManagerStepDefinations.enters_valid_user_details() :: \n Hash Map Size :: "
//// * +m); String String1 = (java.lang.String) m.get("Username");
//// * System.out.println("Username :: "+(m.get("Username"))); System.out.println(
//// * "Password :: "+(m.get("password"))); String String2 =(java.lang.String)
//// * m.get("password");
//// * 
//// */
////// GenericAutomation.exceldata();
