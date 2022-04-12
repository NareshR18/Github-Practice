package com.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Naresh.CucumProject.CucumberPOM;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin extends Naresh.CucumProject.CucumberBase {
	
	
	@Given("user is in Adactin Hotel login page")
	public void user_is_in_adactin_hotel_login_page() {
	  System.out.println("user is in Adactin Hotel login page");
		
	Brow("chrome");
	
		
		
	}
	@When("user is able to see the Username,password textbox and login butoon in the Adactin Hotel login page")
	public void user_is_able_to_see_the_username_password_textbox_and_login_butoon_in_the_adactin_hotel_login_page() {
	   
		url();
		
		
	}
	@Then("enter the valid username, password details")
	public void enter_the_valid_username_password_details() throws IOException {
	    pagefac();
	    
	   keys(CucumberPOM.username, "us");
		keys(CucumberPOM.password, "pw");
		
		
	}
	@Then("click login button and user should navigate to search hotel page")
	public void click_login_button_and_user_should_navigate_to_search_hotel_page() {
	    pagefac();
		click(CucumberPOM.login);
		
	}

	@Given("User is in Search Hotel page")
	public void user_is_in_search_hotel_page() {
	   System.out.println("User is in Search Hotel page");
			wait(5000);
		
		
	}
	@When("User will find the dropdowns and provide the required details")
	public void user_will_find_the_dropdowns_and_provide_the_required_details() throws IOException {
	    pagefac();
		//dropdown(CucumberPOM.loc, 2, "l");
		select(CucumberPOM.loc, "byvalue", "London");
		//dropdown(CucumberPOM.hotel, 1, "h");
		select(CucumberPOM.hotel, "byindex", "4");
		//dropdown(CucumberPOM.rt, 3, "r");
		select(CucumberPOM.rt, "byvisibletext", "Double");
		//dropdown(CucumberPOM.nor, 7, "no")
		select(CucumberPOM.nor, "byvalue", "5");
		//dropdown(CucumberPOM.adultcount, 3, "ac");
		select(CucumberPOM.adultcount, "byindex", "2");
		//dropdown(CucumberPOM.childcount, 1, "cc");
		select(CucumberPOM.childcount, "byvisibletext", "1 - One");
	}
	@Then("User will find the check in and check out textbox where user have to enter valid check in and check out date")
	public void user_will_find_the_check_in_and_check_out_textbox_where_user_have_to_enter_valid_check_in_and_check_out_date() throws IOException {
	pagefac();
	//prop("cidate");
		clr(CucumberPOM.cid);
		keys(CucumberPOM.cid,"cidate");
		clr(CucumberPOM.cod);
		keys(CucumberPOM.cod, "codate");
		
	}
	@Then("Click the search 	button and user should navigate to the Select hotel page")
	public void click_the_search_button_and_user_should_navigate_to_the_select_hotel_page() {
	    pagefac();
		click(CucumberPOM.search);
		
	}

	
	
	@Given("User is in Select Hotel Page")
	public void user_is_in_select_hotel_page() {
	 
		System.out.println("User is in Select Hotel Page");
		
		
	}
	@When("User will find the RadioBox and click the radio box")
	public void user_will_find_the_radio_box_and_click_the_radio_box() {
		pagefac();
		click(CucumberPOM.rselect);
		
		
	}
	@Then("Click the continue button and user should navigate to the Book a hotel page")
	public void click_the_continue_button_and_user_should_navigate_to_the_book_a_hotel_page() {
		pagefac();
		click(CucumberPOM.continu);
		
	}

	
	@Given("User is in Book the hotel page")
	public void user_is_in_book_the_hotel_page() {
	 
		System.out.println("Book a hotel");
		
	}
	@When("User will find the textbox and dropdowns where user have to provide valid details")
	public void user_will_find_the_textbox_and_dropdowns_where_user_have_to_provide_valid_details() throws IOException {
	   pagefac();
	   //prop("cvv");
	   keys(CucumberPOM.fname, "firstname");
	   keys(CucumberPOM.lname, "lastname");
	   keys(CucumberPOM.billadd, "address");
	   keys(CucumberPOM.ccno, "carddet");
	   select(CucumberPOM.cctype, "byvalue", "VISA");
	   select(CucumberPOM.exmon, "byindex", "6");
	   select(CucumberPOM.exyr, "byvisibletext", "2022");
	   keys(CucumberPOM.cvv, "cvv");
		
	}
	@Then("Click the Booknow button and user should navigate to the booking confirmation page")
	public void click_the_booknow_button_and_user_should_navigate_to_the_booking_confirmation_page() {
		pagefac();
		click(CucumberPOM.booknow);
		
		
	}
	@Then("Click the My Itinerary and user should navigate to the Booked Itinerary page")
	public void click_the_my_itinerary_and_user_should_navigate_to_the_booked_itinerary_page() {
		pagefac();
		click(CucumberPOM.myite);
				
	}
	@Then("Take screenshot and save it in separate folder named Screenshot")
	public void take_screenshot_and_save_it_in_separate_folder_named_screenshot() throws IOException, InterruptedException {
	  /*slp(5000);
		 prop();
	  screenshotbook();
	  slp(3000);*/
		System.out.println("");
			
	}

	@Given("User is in the Booked Itinerary page")
	public void user_is_in_the_booked_itinerary_page() {
	   
		
		System.out.println("User is in the Booked Itinerary page");
		
	}
	@When("User should select the radio button of the hotel which has to be cancelled")
	public void user_should_select_the_radio_button_of_the_hotel_which_has_to_be_cancelled() {
	    pagefac();
		click(CucumberPOM.radiobook);
		
	}
	@Then("User should click the cancel selected button and user should find the Confirm alert")
	public void user_should_click_the_cancel_selected_button_and_user_should_find_the_confirm_alert() {
	  
		pagefac();
		click(CucumberPOM.cancel);
		
	}
	@Then("User should click the ok button in the confirm alert and the selected hotel should get cancelled")
	public void user_should_click_the_ok_button_in_the_confirm_alert_and_the_selected_hotel_should_get_cancelled() {
	
		  alert();
		
	}
	@Then("User should take screenshot and save it in the already created screenshot folder")
	public void user_should_take_screenshot_and_save_it_in_the_already_created_screenshot_folder() throws IOException, InterruptedException {
	 slp(5000);
	 TakesScreenshot ss=(TakesScreenshot)driver;
		File from=ss.getScreenshotAs(OutputType.FILE);
		File to1=new File("C:\\Users\\nares\\eclipse-workspace\\CucumProject\\Screenshot\\cancelleddetails.png");
		FileUtils.copyFile(from, to1);
	 slp(3000);
		System.out.println("");
	}
	@Then("User should click logout button and the user should navigate to the logged out page")
	public void user_should_click_logout_button_and_the_user_should_navigate_to_the_logged_out_page() {
	  
		pagefac();
		click(CucumberPOM.logout);
		System.out.println("Logout done successfully");
	}

}
