package webElements;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pom.LoginPage;
import pom.RegisterPage;

public class ToRegisterUserAndLoginUserTest extends BaseClass {
	
	
	@Test(priority = 1)
	public void toRegisterUserAndVerify() throws EncryptedDocumentException, IOException {
	
		String name = fUtils.fetchStringDataFromExcelSheet("Sheet1", 1, 0);
		String email = fUtils.fetchStringDataFromExcelSheet("Sheet1", 1, 1);
		String password = fUtils.fetchStringDataFromExcelSheet("Sheet1", 1, 2);
		
		RegisterPage register = new RegisterPage(driver);
		LoginPage login = new LoginPage(driver);
		
		register.registerUser(name, email, password);
		
		boolean isRegistered = login.verifyUserRegistration();
		
		Assert.assertTrue(isRegistered);
		System.out.println("Pass: the user has registered");	
	}
	
	@Test(priority = 2)
	public void toLoginUserAndVerify() throws EncryptedDocumentException, IOException {
		String email = fUtils.fetchStringDataFromExcelSheet("Sheet1", 1, 1);
		String password = fUtils.fetchStringDataFromExcelSheet("Sheet1", 1, 2);
		
		LoginPage login = new LoginPage(driver);
		
		login.loginUser(email, password);
		
		boolean isLoggedIn = login.verifyUserLoginIn();

		Assert.assertTrue(isLoggedIn);
		System.out.println("Pass: the user has logged in");	
		
	}

}
