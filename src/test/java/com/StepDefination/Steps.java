package com.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Pagetable.Calendar;
import com.Pagetable.WebTableClass;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;

  
public class Steps {

	public WebDriver driver;
	public WebTableClass wb;
	public Calendar calendar;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		wb = new WebTableClass(driver);
		calendar = new Calendar(driver); 
	}
	
	@Given("Launch browser {string}")
	public void launch_browser(String url) {
	     
		driver.get(url);
	}


	@Then("Count enabled users in webtable")
	public void count_enabled_users_in_webtable() throws InterruptedException {
        
		wb.calculateRowsAndColumns();
		wb.chechboxSelection();
	}

	@Then("close the browser")
	public void close_the_browser() {
	    
		driver.close();
	}
	
	//---------------------------------------------------------------------------
	// To automate calendar operation 
	
	@When("click on inbox")
	public void click_on_inbox() {
	     
		calendar.clickInputBox();
	}

	@When("Select your birth date")
	public void select_your_birth_date() throws InterruptedException {
	    
		calendar.selectnextDate();
		calendar.selectPrevDate();
	}
}
