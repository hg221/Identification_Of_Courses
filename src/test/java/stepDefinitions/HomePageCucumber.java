package stepDefinitions;

import java.io.IOException;

import factory.C_BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageOjectModel.HomePage;
import pageOjectModel.WebDevPage;

public class HomePageCucumber {
	
	public HomePage hp ;
	public WebDevPage wp;
	@Given("Navigate to the coursera home page")
	public void navigate_to_the_coursera_home_page() {
	   hp= new HomePage(C_BaseClass.getDriver());
	   wp= new WebDevPage(C_BaseClass.getDriver());
	   
	}

	@When("the user clicks on the inputBox")
	public void the_user_clicks_on_the_input_box() throws IOException {
		hp.searchWebdev();
	    
	}

	@When("the user selects the checkBox")
	public void the_user_selects_the_check_box() {
	    wp.ClickOptions();
	}

	@Then("verify the details of the first course")
	public void verify_the_details_of_the_first_course() throws IOException {
		 wp.firstcourse();
	}

	@Then("verify the details of the second course")
	public void verify_the_details_of_the_second_course() throws IOException {
		wp.secondcourse();
	   
	}
}
