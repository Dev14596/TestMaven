package com.abc.OrangeHRMS.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	WebDriver driver;
	
	public Dashboard(WebDriver driver ) {
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(tagName="h1")
	List<WebElement> dashboardlable;
	
	public List<WebElement> getDashboardLabel() {
		return dashboardlable;
	}

}
