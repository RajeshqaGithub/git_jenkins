package login_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Update_Naukri {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws Throwable
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(3000);
	}
	
	@Test
	public void loginpage() throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("bikashjena70086@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("aB@7008692723");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
