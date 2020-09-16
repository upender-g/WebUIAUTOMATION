package com.qa.tests;

import com.qa.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductsPage;
import com.qa.utils.TestUtils;
import com.qa.utils.VideoRecorder_utlity;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.*;

import java.io.InputStream;
import java.lang.reflect.Method;

public class Tests2 extends BaseTest{
	LoginPage loginPage;
	ProductsPage productsPage;
	JSONObject loginUsers;
	TestUtils utils = new TestUtils();
	VideoRecorder_utlity rec;

	@BeforeClass
	  public void beforeClass() throws Exception {
			InputStream datais = null;
		  try {
			  String dataFileName = "data/loginUsers.json";
			  datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
			  JSONTokener tokener = new JSONTokener(datais);
			  loginUsers = new JSONObject(tokener);
		  } catch(Exception e) {
			  e.printStackTrace();
			  throw e;
		  } finally {
			  if(datais != null) {
				  datais.close();
			  }
		  }

	  }

	  @AfterClass
	  public void afterClass() {
	  }
	  
	  @BeforeMethod
	  public void beforeMethod(Method m) throws Exception {
		  utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
		  loginPage = new LoginPage();
	  }

	  @AfterMethod
	  public void afterMethod() throws Exception {
	  }
	  
/*	  @Test
	  public void invalidUserName() {
		  	  loginPage.enterUserName("Cheese!\n");*/

		  	  /*	  loginPage.enterUserName(loginUsers.getJSONObject("invalidUser").getString("username"));
		  loginPage.enterPassword(loginUsers.getJSONObject("invalidUser").getString("password"));
		  loginPage.pressLoginBtn();
		  
		  String actualErrTxt = loginPage.getErrTxt() + "sdfdf";
		  String expectedErrTxt = getStrings().get("err_invalid_username_or_password");
		  
		  Assert.assertEquals(actualErrTxt, expectedErrTxt);*/
	/*  }*/

	@Test
	public void successfulLogin() throws Exception {
		//VideoRecorder_utlity.startRecord("successfulLogin");

		productsPage = loginPage.pressLoginBtn("Cheese!\n");
		//VideoRecorder_utlity.stopRecord();

	}

	@Test
	public void search() throws Exception {
		//VideoRecorder_utlity.startRecord("successfulLogin");

		productsPage = loginPage.pressLoginBtn("Cheese!\n");
		//VideoRecorder_utlity.stopRecord();

	}
	  
/*	  @Test
	  public void invalidPassword() {
		  loginPage.enterUserName(loginUsers.getJSONObject("invalidPassword").getString("username"));
		  loginPage.enterPassword(loginUsers.getJSONObject("invalidPassword").getString("password"));
		  loginPage.pressLoginBtn();
		  		  
		  String actualErrTxt = loginPage.getErrTxt();
		  String expectedErrTxt = getStrings().get("err_invalid_username_or_password");
		  
		  Assert.assertEquals(actualErrTxt, expectedErrTxt);
	  }
	  
	  @Test
	  public void successfulLogin() {
		  loginPage.enterUserName(loginUsers.getJSONObject("validUser").getString("username"));
		  loginPage.enterPassword(loginUsers.getJSONObject("validUser").getString("password"));
		  productsPage = loginPage.pressLoginBtn();
		  		  
		  String actualProductTitle = productsPage.getTitle();		  
		  String expectedProductTitle = getStrings().get("product_title");
		  
		  Assert.assertEquals(actualProductTitle, expectedProductTitle);
	  }*/
}
