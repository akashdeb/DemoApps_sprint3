package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearhPage {
	
	public GoogleSearhPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q") 
	private WebElement textbox;

	public WebElement getTextbox() {
		return textbox;
	}
	
	
	public void searchQuerry(String querry) {
		textbox.clear();
		textbox.sendKeys(querry);
		textbox.sendKeys(Keys.ENTER);
	}
	
	

}
