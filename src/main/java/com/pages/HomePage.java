package com.pages;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.keywords.UIKeywords;
import com.util.WaitFor;

public class HomePage {

	@FindBy(css = "div.login-box.firstLogin")
	public WebElement login;

	@FindBy(css = "input#newBikeList")
	public WebElement searchBox;

	@FindBy(css = "input[placeholder=\"Search your bike here, e.g. Royal Enfield Hunter 350\"]")
	public WebElement typeBikeNameTxtbx;

	public HomePage() {
		WaitFor.time(2);
		PageFactory.initElements(UIKeywords.driver, this);
	}

	public void clickOnLoginBtn() {
		WaitFor.time(2);
		login.click();
	}
		public void clickOnSearchBox() {
			searchBox.click();
		}
	public void searchBike(String bikeName) {
		Robot robo = null;
		try {
			robo = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		searchBox.click();
		searchBox.sendKeys("Royal Enfield Hunter 350");
		searchBox.click();
	}

}
