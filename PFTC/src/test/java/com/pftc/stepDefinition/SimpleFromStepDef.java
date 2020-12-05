package com.pftc.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleFromStepDef {
	
	WebDriver driver;
	
	@Given("User Navigate to Selenium Easy Home Page")
	public void user_navigate_to_selenium_easy_home_page() {
	   System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.seleniumeasy.com/test/");
	   
	}

	@When("User Click on Input Form Drop Down")
	public void user_click_on_input_form_drop_down() {
	    driver.findElement(By.linkText("Input Forms")).click();
	}

	@Then("User Click on Simple Form Demo Link")
	public void user_click_on_simple_form_demo_link() {
	   driver.findElement(By.linkText("Simple Form Demo")).click();
	}

	@Then("User Enter Message on the Message Field")
	public void user_enter_message_on_the_message_field() {
	   driver.findElement(By.id("user-message")).sendKeys("This is Test Message");
	}

	@Then("User click on Show Message Button")
	public void user_click_on_show_message_button() {
	   driver.findElement(By.xpath("//*[@id='get-input']/button")).click();
	}

	@Then("User verify that message was displyed")
	public void user_verify_that_message_was_displyed() {
	   
	}

	@Then("USer Enter Value for A")
	public void u_ser_enter_value_for_a() {
	    
	}

	@Then("User Enter Value for B")
	public void user_enter_value_for_b() {
	   
	}

	@Then("User Click on the Get Total Button")
	public void user_click_on_the_get_total_button() {
	    
	}

	@Then("User Very the result")
	public void user_very_the_result() {
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
