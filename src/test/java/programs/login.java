package programs;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;



public class login{
	@Test(retryAnalyzer=retry.class)
	public void program() {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("Chaithuuu");
		driver.findElement(By.id("password")).sendKeys("123987600");
		driver.findElement(By.id("login")).click();
		Assert.assertEquals(false, null);
	}
}
