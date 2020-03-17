package com.StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	static WebDriver driver;
	@Given("User has to be in the login")
	public void user_has_to_be_in_the_login() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\sridhar\\CucumberDataTable\\Driver\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   
	}

	@When("User has to enter user name,password and click the login button")
	public void user_has_to_enter_user_name_password_and_click_the_login_button(io.cucumber.datatable.DataTable d) {
	  List<List<String>> li = d.asLists();
		driver.findElement(By.id("email")).sendKeys(li.get(1).get(0));
		driver.findElement(By.id("pass")).sendKeys(li.get(1).get(1));
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("User has to find error page")
	public void user_has_to_find_error_page() {
	   
	}
}
