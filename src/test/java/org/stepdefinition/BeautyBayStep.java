package org.stepdefinition;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import BeautyBayPojo.PageObjModel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BeautyBayStep extends  BaseClass{
PageObjModel page= new  PageObjModel();
@Given("user is on Beauty Bay site")
public void user_is_on_Beauty_Bay_site() throws IOException {
	System.out.println("user is on the BeautyBay site ");
	launchBrowser();
	//loadUrl("https://www.beautybay.com/");
	launchUrl("https://www.beautybay.com/");
	windowMax();
	implicitWaitMethod(5000);	
	currentUrl();
	pageTitle();
    takeScreenShots("C:\\screenshots\\BeautyBay.com\\1.png");
}

@When("user clicks on the Signin image and navigates to the loginURL Page")
public void user_clicks_on_the_Signin_image_and_navigates_to_the_loginURL_Page() throws IOException, InterruptedException {
  Thread.sleep(5000);
  btnClk(page.getLoginPage().getClkBtn());
  Thread.sleep(5000);
  btnClk(page.getLoginPage().getClkFlags());
  btnClk(page.getLoginPage().getClkCountry());
  SelectByVisibleTextMethod(page.getLoginPage().getClkCountry(), "United States");
  btnClk(page.getLoginPage().getClkContShopping());
  takeScreenShots("C:\\screenshots\\BeautyBay.com\\21.png");
  Thread.sleep(15000);
  btnClk(page.getLoginPage().getClkBtnSigninIcon());
  takeScreenShots("C:\\screenshots\\BeautyBay.com\\2.png");
}


@When("user enters the {string} and {string} and clicks on the sigin button and navigates to account page")
public void user_enters_the_and_and_clicks_on_the_sigin_button_and_navigates_to_account_page(String s1, String s2) throws IOException, InterruptedException {
	Thread.sleep(5000);
	fill(page.getLoginPage().getTxtEmail(), s1);
	getTheEnteredValue(page.getLoginPage().getTxtEmail());
    fill(page.getLoginPage().getTxtPassword(), s2); 
	getTheEnteredValue(page.getLoginPage().getTxtPassword());
    btnClk(page.getLoginPage().getClkBtnSigninIn());
    takeScreenShots("C:\\screenshots\\BeautyBay.com\\3.png");
}


@When("user checks on the brokenlinks and broken image")
public void user_checks_on_the_brokenlinks_and_broken_image() throws IOException, InterruptedException {
	  Thread.sleep(5000);
	  brokenLink(page.getLoginPage().getBrokenLinks());
	  brokenImage(page.getLoginPage().getBrokenImages());
	  takeScreenShots("C:\\screenshots\\BeautyBay.com\\4.png");
}

@When("user moves to the Explore link and click on NudePalettes link")
public void user_moves_to_the_Explore_link_and_click_on_NudePalettes_link() throws IOException, InterruptedException {
	Thread.sleep(5000);
    moveToElementMethod(page.getLoginPage().getClkMoveToExplore());
    btnClk(page.getLoginPage().getClkOnNude());
    btnClk(page.getLoginPage().getClkContShopping());
    btnClk(page.getLoginPage().getClkFlags1());
    btnClk(page.getLoginPage().getClkCountry1());
    SelectByVisibleTextMethod(page.getLoginPage().getClkCountry1(), "United Kingdom");
    btnClk(page.getLoginPage().getClkContShopping1());
    
    takeScreenShots("C:\\screenshots\\BeautyBay.com\\5.png");
}

@When("user clicks on the Sort button and click on the Customer Rating")
public void user_clicks_on_the_Sort_button_and_click_on_the_Customer_Rating() throws IOException, InterruptedException {
	 Thread.sleep(5000);
	 btnClk(page.getLoginPage().getClkOnSort());
	 btnClk(page.getLoginPage().getClkOnCustomer());
	 takeScreenShots("C:\\screenshots\\BeautyBay.com\\6.png");
}

@When("user clicks on the Filter button and  click on Brand button and select on Wet and Wild checkbox and click on the close button")
public void user_clicks_on_the_Filter_button_and_click_on_Brand_button_and_select_on_Wet_and_Wild_checkbox_and_click_on_the_close_button() throws IOException, InterruptedException 
	{
	     Thread.sleep(5000);
		 btnClk(page.getLoginPage().getClkOnFilter());
		 btnClk(page.getLoginPage().getClkOnBrand());
		 btnClk(page.getLoginPage().getClkOnWetNdWild());
		 
		 takeScreenShots("C:\\screenshots\\BeautyBay.com\\7.png");
	}



@When("user clicks on Done button")
public void user_clicks_on_Done_button() throws IOException, InterruptedException {
	 Thread.sleep(5000);
	 btnClk(page.getLoginPage().getClkOnDone());
	 takeScreenShots("C:\\screenshots\\BeautyBay.com\\8.png");
}

@When("user Selects a product  and click on that particular product")
public void user_Selects_a_product_and_click_on_that_particular_product() throws IOException, InterruptedException {
	 Thread.sleep(5000);
	 btnClk(page.getLoginPage().getClkOnProduct());
	 
	 takeScreenShots("C:\\screenshots\\BeautyBay.com\\9.png");
	 
}

@When("user Selects the colour for the product in the dropdown box")
public void user_Selects_the_colour_for_the_product_in_the_dropdown_box() throws IOException, InterruptedException {
	  Thread.sleep(5000);
	  btnClk(page.getLoginPage().getSelectDropDown());
      SelectByVisibleTextMethod(page.getLoginPage().getSelectDropDown(), "V.I.Purple");
      takeScreenShots("C:\\screenshots\\BeautyBay.com\\10.png");
}

@When("user clicks on Add to bag button and click on the view bag button on the popup message")
public void user_clicks_on_Add_to_bag_button_and_click_on_the_view_bag_button_on_the_popup_message() throws IOException, InterruptedException {
	  Thread.sleep(5000);
	 btnClk(page.getLoginPage().getClkBtnBag());
	 btnClk(page.getLoginPage().getClkViewBag());
	 takeScreenShots("C:\\screenshots\\BeautyBay.com\\11.png");
}

@When("user clicks on the  + icon in the box to add up the qnty of the items")
public void user_clicks_on_the_icon_in_the_box_to_add_up_the_qnty_of_the_items() throws IOException, InterruptedException {
	  Thread.sleep(5000);
	  btnClk(page.getLoginPage().getClkPlus());
	  takeScreenShots("C:\\screenshots\\BeautyBay.com\\12.png");
	
}

@When("user clicks on Checkout securely button  and click on Next button")
public void user_clicks_on_Checkout_securely_button_and_click_on_Next_button() throws IOException, InterruptedException {
	  Thread.sleep(5000);
	  btnClk(page.getLoginPage().getClkCheckoutSecurely());
	  fill(page.getLoginPage().getTxtEmail(),"lakshmichokalingam13@gmail.com");
	  fill(page.getLoginPage().getTxtPassword(),"Vimala@13");
	  btnClk(page.getLoginPage().getClkNext());
	  takeScreenShots("C:\\screenshots\\BeautyBay.com\\13.png");
}

@When("user clicks on the Next button and again clicks on the nect button")
public void user_clicks_on_the_Next_button_and_again_clicks_on_the_nect_button() throws IOException, InterruptedException {
    Thread.sleep(5000);
	btnClk(page.getLoginPage().getClkNext2());
	btnClk(page.getLoginPage().getClkNext3());
	takeScreenShots("C:\\screenshots\\BeautyBay.com\\14.png");
}

@Then("user see the outcome")
public void user_see_the_outcome() {
	System.out.println("done completed successfull");
}

}
