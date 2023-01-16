package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.keywords.UIKeywords;
import com.util.WaitFor;

public class HomePage {

	@FindBy(css = "div.login-box.firstLogin")
	public WebElement Login;
	
	

	public HomePage() {
		WaitFor.time(2);
		PageFactory.initElements(UIKeywords.driver, this);
	}

	public void clickOnLoginBtn() {
		WaitFor.time(2);
		Login.click();
		
	}

}
