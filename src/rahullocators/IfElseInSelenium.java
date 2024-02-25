package rahullocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IfElseInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stubWebDriver driver =new ChromeDriver();
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0")) {
			System.out.println("it is enabled");
			Assert.assertTrue(true);	
		}
		else
		{
			Assert.assertTrue(false);
		}

	}

}
