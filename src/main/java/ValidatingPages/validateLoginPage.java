package ValidatingPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class validateLoginPage {

	
	@Test
	public void validateLoginPages() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puneripattern.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("About Us")).click();
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "About Us | Puneri Pattern");
		System.out.println("Title matched");
		
	driver.close();
	
	}
}
