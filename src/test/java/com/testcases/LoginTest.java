package com.testcases;

import org.testng.annotations.Test;

import com.config.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;

/**
 * 
 * @author Sandip Kalambe
 *
 */
public class LoginTest extends TestBase {
	@Test(groups = "@regression, passed")
	public void valid_login() {
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
		home.clickOnLoginBtn();
		login.login_valid();

	}

}
