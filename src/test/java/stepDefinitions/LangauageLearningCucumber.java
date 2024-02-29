package stepDefinitions;

import java.io.IOException;

import factory.C_BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageOjectModel.LearnLanguagepage;
import pageOjectModel.WebDevPage;

public class LangauageLearningCucumber {
	
	public LearnLanguagepage lp;
	public WebDevPage wp;
	
	@Given("navigate to the coursera home page")
	public void navigate_to_the_coursera_home_page() {
		 lp= new LearnLanguagepage(C_BaseClass.getDriver());
		 wp= new WebDevPage(C_BaseClass.getDriver());
	}

	@When("the user clicks on show more")
	public void the_user_clicks_on_show_more() throws IOException {
		wp.searchbox2();
		lp.clickshowmore();
	}

	@Then("get the languages and their count")
	public void get_the_languages_and_their_count() throws InterruptedException {
		lp.countlang();
		lp.close();
		lp.scrollDown();
	}

	@Then("get the levels and their count")
	public void get_the_levels_and_their_count() {
	    lp.levelCount();
	}
}
