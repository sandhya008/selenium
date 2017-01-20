package githubtrail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	@BeforeSuite
	public void setUp(){
		
		driver = new ChromeDriver();
		
	}
	@Test
	public void doLogin(){
		
		driver.get("http://google.com");
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("news");
		////*[@id="lst-ib"]
		
		//driver.findElement(By.xpath(".//*[@id='_fZl']")).click();
	}
	@AfterSuite
	public void tearDown(){
		
		driver.quit();
	}
	//comenents 

}
