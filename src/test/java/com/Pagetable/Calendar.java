package com.Pagetable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calendar {

	public WebDriver ldriver;
	
	public Calendar(WebDriver rdriver) {
	
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath=("//input[@id='datepicker']"))
	WebElement inputbox;
	
	@FindBy(xpath=("//span[contains(text(),'Next')]"))
	WebElement next;
	
	@FindBy(xpath=("//span[contains(text(),'Prev')]"))
	WebElement prev;
	
	@FindBy(xpath=("//span[@class='ui-datepicker-month']"))
	WebElement month;
	
	
	public void clickInputBox() {
		
		inputbox.click();
 
	}
	
	public void selectnextDate() throws InterruptedException {
		
		for(int i=6; i>=1; i--)
		{
			next.click();
			Thread.sleep(2000);
			
			String text = month.getText();
			
			if(text.equals("December"))
			{
				ldriver.findElement(By.linkText("21")).click();
				
				Thread.sleep(5000);
				break;
			}
		}
	}
	
	public void selectPrevDate() throws InterruptedException {
		
		inputbox.clear();
		
		for(int i=12; i>=1; i--)
		{
			prev.click();
			Thread.sleep(2000);
			
			String text = month.getText();
			
			if(text.equals("March"))
			{
				ldriver.findElement(By.linkText("13")).click();
				
				Thread.sleep(5000);
				break;
			}
		}
	}
}
