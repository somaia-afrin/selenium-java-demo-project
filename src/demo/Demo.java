
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void testAssertFunction() {
	

		// Chrome driver connected with chrome
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Access selenium.dev website
		driver.get("https://www.selenium.dev/"); 
		driver.manage().window().maximize(); // maximize web page

		// Click on the “About” menu at top left
		driver.findElement(By.xpath("//div[@id='aboutArrow']")).click();

		// click on “About” option
		driver.findElement(By.linkText("About")).click();

		WebElement page_header = driver.findElement(By.className("body-large"));

		String header_text = page_header.getText();

		//print the header text
		System.out.println(header_text);

		// verify text with actual result
		Assert.assertEquals(header_text, "Selenium is a suite of tools for automating web browsers.");

		// navigate back to home page
		driver.navigate().back();

	}

}



