package Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Studentloginsteps {
    @Given("navigate to StudentloginPage application")
    public void navigate_to_StudentloginPage_application() {
System.out.println("login page");
    }
    @When("enter a valid username {string} and password {string}")
    public void enter_a_valid_username_and_password(String username, String password) {
       System.out.println("enter valid  username"+username+" and  password"+password);
    }
    @And("click on the {string} button")
    public void click_on_the_button(String button) {
    System.out.println("click the "+button);
    }
    @Then("user should be navigated to loggedpage")
    public void user_should_be_navigated_to_loggedpage() {
       System.out.println("Opened");
    }
    @Then("user should not be navigated to loggedpage")
    public void user_should_not_be_navigated_to_loggedpage() {
       System.out.println("does not open");
    }



}