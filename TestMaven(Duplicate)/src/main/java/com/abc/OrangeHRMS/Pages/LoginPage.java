package com.abc.OrangeHRMS.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abc.commonfunctionality.BrowserLaunch;

public class LoginPage{
	
	WebDriver driver;
	
  public LoginPage(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  @FindBy(id="txtUsername")
  WebElement username;
  
  @FindBy(id="txtPassword")
  WebElement password;
  
  @FindBy(id="btnLogin")
  WebElement loginbutton;
  
  @FindBy(xpath="//span[@id='spanMessage']")
  List<WebElement> invalidmassage;
  
  
  
  
  
  public WebElement getUsernametxt() {
	  return username;
  }

  public WebElement getPasswordtxt() {
	  return password;
  }

  public WebElement getLoginBtn() {
	  return loginbutton;
}

  public List<WebElement> getinvalidMessageLabel() {
	  return invalidmassage;
}
  
  public void Login(String username,String password) {
	  	getUsernametxt().sendKeys(username);
		getPasswordtxt().sendKeys(password);
		getLoginBtn().click();
		//Thread.sleep(1000);
  }
  
  
}
