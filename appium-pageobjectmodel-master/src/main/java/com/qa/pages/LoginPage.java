package com.qa.pages;

import org.openqa.selenium.Keys;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseTest {
	TestUtils utils = new TestUtils();


	@FindBy(name="q")
	private WebElement enterUserId;

	@FindBy(name="q2")
	private WebElement enterUserId1;
	
public LoginPage enterUserName(String userId) {
	sendKeys(enterUserId, userId, "login with " + userId);
	return this;
}

public ProductsPage pressLoginBtn(String userId) {
		sendKeys(enterUserId1, userId, "login with " + userId);
		return new ProductsPage();
	}

/*public LoginPage enterPassword(String password) {
	clear(passwordTxtFld);
	sendKeys(passwordTxtFld, password, "password is " + password);
	return this;
}

public ProductsPage pressLoginBtn() {
	click(loginBtn, "press login button");
	return new ProductsPage();
}

/*public ProductsPage login(String username, String password) {
	enterUserName(username);
	enterPassword(password);
	return pressLoginBtn();
}

public String getErrTxt() {
	String err = getText(errTxt, "error text is - ");
	return err;
}*/

}
