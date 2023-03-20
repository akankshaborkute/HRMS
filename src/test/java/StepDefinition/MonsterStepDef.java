package StepDefinition;

import POM.Monster;
import POM.MonsterPOM2;
import Utility.BaseClass;
import io.cucumber.java.en.*;

public class MonsterStepDef {
	@Given("User lauches browser")
	public void user_lauches_browser() {
		BaseClass.launchbrowser();
	}

	@Given("User enters url {string}")
	public void user_enters_url(String aa) {
		BaseClass.openapplication(aa);
	}

	@Given("User press on Loginlink_first")
	public void user_press_on_loginlink_first() {
		Monster.clickonloginbtn();
	}

	@When("User enters {string} and  {string}")
	public void user_enters_and(String uname, String pswrd) {
		Monster.login(uname, pswrd); 
	}

	@Then("User clicks on login2 button")
	public void user_clicks_on_login2_button() {
		Monster.clickonloginbtn2();
	}
	@Then("User search BY JOB title  {string}")
	public void user_search_by_job_title(String title) {
	    MonsterPOM2.enter_Title(title);
	}

	@Then("User enters location {string}")
	public void user_enters_location(String location) {
		MonsterPOM2.enter_Location(location);
	}
	@Then("User enters experiance")
	public void user_enters_experiance() {
	   MonsterPOM2.enter_experience();
	}
	@Then("User clicks on Search button")
	public void user_clicks_on_search_button() {
		MonsterPOM2.click_Search_btn();
	}




}
