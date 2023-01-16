package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.keywords.UIKeywords;
import com.util.WaitFor;

/**
 * 
 * @author Sandip Kalambe
 *
 */
public class LoginPage {
	@CacheLookup
	@FindBy(css = "input#txtLoginid")
	public WebElement username;
	@FindBy(css = "input#txtPasswd")
	public WebElement password;
	@FindBy(css = "button#btnLogin")
	public WebElement LogIn;
	@FindBy(css = "a.font14.js-forgot-password-target")
	public WebElement forgotPassword;
	@FindBy(css = "h2.login-box-signup-target ")
	public WebElement SignUp;

	public LoginPage() {
		WaitFor.time(2);
		PageFactory.initElements(UIKeywords.driver, this);
	}

	public void login_valid() {
		WaitFor.time(2);
		WaitFor.elementToBeClickable(username);
		username.sendKeys("skalambe1998@gmail.com");
		password.sendKeys("Skalambe@1998");
		LogIn.click();
	}

	public void forgotPassWord() {
		forgotPassword.click();
	}

	public void click_signUp() {
		WaitFor.time(2);
		WaitFor.elementToBeClickable(SignUp);
		SignUp.click();
	}

}
