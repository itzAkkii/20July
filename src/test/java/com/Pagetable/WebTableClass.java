package com.Pagetable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableClass {

	WebDriver rdriver;
	public WebTableClass(WebDriver ldriver) {
		
		rdriver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
//	@FindBy(xpath="//input[@name='username']")
//	WebElement username;
//	
//	@FindBy(xpath="//input[@name='password']")
//	WebElement password;
//	
//	@FindBy(xpath="//button[@type='submit']")
//	WebElement submit;
//	
//	@FindBy(xpath="//span[text()='Admin']")
//	WebElement adminMenu;
//	
//	@FindBy(xpath="//span[text()='User Management ']")
//	WebElement itemMenu;
	
	 @FindBy(xpath="//table[@id='customers']//tbody//tr")
	 WebElement row;
	 
	 @FindBy(xpath="//table[@id='customers']//tbody//tr//th")
	 WebElement col;
	 
	 public void calculateRowsAndColumns() throws InterruptedException {
		 
		 int rsize = rdriver.findElements(By.xpath("//table[@id='customers']//tbody//tr")).size();
		 int csize = rdriver.findElements(By.xpath("//table[@id='customers']//tbody//tr//th")).size();

		 System.out.println("Total rows : "+rsize);
		 System.out.println("Toatal columns : "+csize);
		 
 		 
		 //If country is USA then and only then print name of company.
		 
		 for(int i=2; i<=rsize; i++) {
			 
			 String country = rdriver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td[4]")).getText();
			 
			 List<WebElement> company = rdriver.findElements(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td[2]"));

			 if(country.equals("USA"))
			 {
				 for (WebElement name : company) {
					String cname = name.getText();
					System.out.println("Name of company : "+cname);
				}
			 }
		 }
		 
		
		 Thread.sleep(1000);
		 
	 }
	 
	 public void chechboxSelection() throws InterruptedException 
	 {
		 System.out.println("------------------------------------------------");
		 //if contact is opensource then select checkboxes.
		 
		 int rsize = rdriver.findElements(By.xpath("//table[@id='customers']//tbody//tr")).size();
		 int csize = rdriver.findElements(By.xpath("//table[@id='customers']//tbody//tr//th")).size();

		// List<WebElement> box = rdriver.findElements(By.xpath("//table[@id='customers']//tr//td//input"));  //it will click on all checkboxes

		 for(int i=2; i<=rsize; i++)
		 {
			 String contact = rdriver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td[3]")).getText();
 
			 List<WebElement> box = rdriver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]//td[1]//input"));    //if contact is opensource then select checkboxes.

			 
//			 if(contact.equals("Open Source"))
//			 {
				  for (WebElement checkbox : box) {
					
					  if(contact.equals("Open Source"))
					  {
						  checkbox.click();
							 Thread.sleep(2000);
					  }
				}
			 //}
		 }
		 
	 }
	
}




