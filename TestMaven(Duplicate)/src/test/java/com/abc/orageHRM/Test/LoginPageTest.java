package com.abc.orageHRM.Test;



import com.abc.commonfunctionality.ReadExcelsheet;
import com.abc.commonfunctionality.Reporter;


import org.testng.annotations.Test;

import com.abc.OrangeHRMS.Pages.Dashboard;
import com.abc.OrangeHRMS.Pages.LoginPage;

public class LoginPageTest extends ReadExcelsheet {

	
	
	
	
	@Test(description="verify user should be anable to login with invalid credential")
	public void TC1() {
	    Reporter.startTest("verify user should be anable to login with invalid credential");
		LoginPage loginpage=new LoginPage(driver);
		//loginpage.Login("Admin12", "admin123");
		loginpage.Login(ReadExcelsheet.getStringCellData("TC2", "UserName"), ReadExcelsheet.getStringCellData("TC2", "Password"));
		if(loginpage.getinvalidMessageLabel().size()>0){
			Reporter.PassTest("User is unable to login with invalid credential" +loginpage.getinvalidMessageLabel().get(0).getText());
			
		}else {
			System.out.println("hi");
			Reporter.FailTest("User is able to login with invalid credential");
			System.out.println("pass");
			
		}
		
	}
	
	
	
	@Test(description="verify user should be login with valid credentials")
	public void TC2() {
		Reporter.startTest("verify user should be login with valid credentials");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.Login("Admin", "admin123456");
		Dashboard dashboardpage=new Dashboard(driver);
	
	/*	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(new ExpectedCondition<Boolean>(){

			public Boolean apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.tagName("h1")).isDisplayed();
			}
			
		});
		*/
	
		if(dashboardpage.getDashboardLabel().size()>0) {
			Reporter.PassTest("User is able to login successfully");
		 }
		else {
			Reporter.FailTest("User is not able to login successfully");
			
			 }
		
	}
	

}
