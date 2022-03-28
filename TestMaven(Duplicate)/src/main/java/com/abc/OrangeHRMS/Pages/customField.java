package com.abc.OrangeHRMS.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class customField {
	WebDriver driver;
	
	  public customField(WebDriver driver) {
		  this.driver=driver;
	  }
	
	public WebElement editbutton() {
		return driver.findElement(By.xpath("//input[@id=\"btnEditCustom\"]"));
	}
	
	public WebElement bloodtype() {
		return driver.findElement(By.xpath("//select[@name=\"custom1\"]"));
	}
	
	public WebElement savebtn() {
		return driver.findElement(By.xpath("//input[@id=\"btnEditCustom\"]"));
	}

}
