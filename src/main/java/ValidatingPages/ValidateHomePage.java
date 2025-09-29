package ValidatingPages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateHomePage {

//Class - collection of data member and member function
	
//	data memebers - variable
//	memebr function - methods
	
	int i=10;
	
	public void test() {
		System.out.println("hi");
	}
	
	@Test
	public void validateHomePages() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
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
		System.out.println("hello");
		System.out.println(devopsproject);
	driver.close();
	
	}
	
	
	
	
}
