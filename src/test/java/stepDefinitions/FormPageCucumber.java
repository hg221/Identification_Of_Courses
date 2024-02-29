package stepDefinitions;

import java.io.IOException;

import factory.C_BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageOjectModel.HomePage;
//import pageOjectModel.LearnLanguagepage;
import pageOjectModel.formPage;

public class FormPageCucumber {
	public HomePage hp ;
	public formPage fp ;
	@Given("navigates to the Coursera home page")
	public void navigates_to_the_coursera_home_page() {
		 fp= new formPage(C_BaseClass.getDriver());
	}

	@When("the user clicks on For Enterprises")
	public void the_user_clicks_on_for_enterprises() {
		fp.ClickEnterprise();
	}

	@When("the user clicks on Coursera for campus")
	public void the_user_clicks_on_coursera_for_campus() {
	   fp.ClickProduct();
	   fp.ClickLearnMore();
	}

	@When("scroll to the form")
	public void scroll_to_the_form() {
	    fp. scrollTobottom();
	}

	@Then("enter the details in the form")
	public void enter_the_details_in_the_form() throws IOException {
	    fp.firstName();
	    fp.lastName();
	    fp.emailid();
	    fp.phoneNumber();
	    fp.institutionType();
	    fp.InstitutionName();
	    fp.jobRole();
	    fp.department();
	    fp.country();
	    fp.state();
	    fp.submitButton();
	    

	}

	@Then("verify the error message")
	public void verify_the_error_message() throws Exception {
	   fp.captureMessage();
	}

}
