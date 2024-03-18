package genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import genericUtility.FileUtility;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fUtils = new FileUtility();

	@BeforeSuite
	public void bs() {
		System.out.println("This is Before suite");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("This is Before test");
	}
	
	@BeforeClass
	public void bc() throws IOException {
		
		
		String browser = fUtils.fetchDataFromPropertyFile("browser");
		String url = fUtils.fetchDataFromPropertyFile("url");

		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		System.out.println("The browser has launched and URL is navigated ");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("This is Before method");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("This is After method");
	}
	
	@AfterClass
	public void ac() {
		driver.quit();
		System.out.println("The browser is closed");
	}
	
	@AfterTest
	public void at() {
		System.out.println("This is After Test");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("This is After Suite");
	}
	 
}
