package com.abc.OrangeHRMC.Test;

import com.abc.OrangeHRMS.Pages.Dashboard;
import com.abc.OrangeHRMS.Pages.LoginPage;
import com.abc.commonfunctionality.BrowserLaunch;

public class LoginPageTest extends BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		
	/*	//Login with valid credential 
		BrowserLaunch browser=new BrowserLaunch();
		browser.Browser_Initilisation();
		LoginPageTest logintest=new LoginPageTest();
		logintest.Login_InSuccessfully("admin", "admin");
		logintest.Login_Successfully("Admin", "admin123");
		
	}
	
	
	public void Login_Successfully(String username,String password) throws InterruptedException {
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getUsernametxt().sendKeys(username);
		loginpage.getPasswordtxt().sendKeys(password);
		loginpage.getLoginBtn().click();
		Thread.sleep(1000);
		Dashboard dashboardpage=new Dashboard(driver);
		if(dashboardpage.getDashboardLabel().size()>0) {
			 System.out.println("User is able to login successfully"); }
		else {
			 System.out.println("User is not able to login successfully"); 
			 }
		
	}
	
	public void Login_InSuccessfully(String username,String password) throws InterruptedException {
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getUsernametxt().sendKeys(username);
		loginpage.getPasswordtxt().sendKeys(password);
		loginpage.getLoginBtn().click();
		Thread.sleep(1000);
		if(loginpage.getinvalidMessageLabel().size()>0)
		{
			System.out.println("User is not able to login with invalid credential");
		}
		else {
			System.out.println("User is able to login with invalid credential");
		}
		*/
	}

	}
