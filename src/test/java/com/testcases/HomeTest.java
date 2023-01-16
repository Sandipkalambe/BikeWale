package com.testcases;

import org.testng.annotations.Test;

import com.config.TestBase;
import com.pages.HomePage;

public class HomeTest extends TestBase {

	@Test
	public void clickOnLoginBtn() {
		HomePage home = new HomePage();
		home.clickOnLoginBtn();

	}

}
