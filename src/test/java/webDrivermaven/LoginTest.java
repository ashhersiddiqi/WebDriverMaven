package webDrivermaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	
public static WebDriver driver;

	
	
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}
	
	@Test
	public void doLogin() {
		driver.manage().window().maximize();
		driver.get("https://gmail.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		WebElement userId= driver.findElement(By.xpath("//input[@id='identifierId']"));
		userId.sendKeys("SeleniumNJT45");
		
		WebElement nextButton = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		nextButton.click();
		
//		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
//		pass.sendKeys("Careful123");
		
		// comments
		
		
		
	}

		
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
