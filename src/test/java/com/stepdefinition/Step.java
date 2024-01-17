package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.pages.Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Step {

	@Managed
	WebDriver driver;
	
	@Steps
	Page p;
	
	
	@Given("To launch the application url")
	public void to_launch_the_application_url() {
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in");
	    
	}
	
	
	@When("To enter the value in search box")
	public void to_enter_the_value_in_search_box() {
	    p.enter_Value();
		
	}
	
	@When("To click the search icon")
	public void to_click_the_search_icon() {
	    p.click_search_icon();
	}

	
	
}
