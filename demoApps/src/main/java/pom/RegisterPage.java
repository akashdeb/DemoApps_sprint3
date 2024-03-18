package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "name")
	private WebElement nameTextField;
	
	@FindBy(id = "email")
	private WebElement emailTextField;
	
	@FindBy(id = "password")
	private WebElement passwordTextField;

	@FindBy(xpath = "//button[text()='Register']")
	private WebElement registerButton;
	
	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public void registerUser(String name, String email, String password) {
		
		nameTextField.sendKeys(name);
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		registerButton.click();
		
		
	}
	
	
	

}
