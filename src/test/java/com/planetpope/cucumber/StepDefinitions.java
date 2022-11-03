package com.planetpope.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDefinitions {

    @Given("The user wants to go to Orange HRM Website")
    public void the_user_wants_to_go_to_orange_hrm_website() {
        //System.setProperty("webdriver.chrome.driver","chromedriver");

        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("headless");
        //WebDriver driver = new ChromeDriver(options);

        // Maximize the browser
        //driver.manage().window().maximize();

        // Launch Website
        //driver.get("https://hrm-test.renastechschool.com/");
    }
    @When("The user wants to enter username and password")
    public void the_user_wants_to_enter_username_and_password() {

    }
    @Then("The user wants to click on Login button")
    public void the_user_wants_to_click_on_login_button() {


    }
    @Then("The user wants to verify that browser landed on Dashboard")
    public void the_user_wants_to_verify_that_browser_landed_on_dashboard() {


    }
}
        
