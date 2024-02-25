package rahullocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

//		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//	    to click checkobox	
//		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
//		to check the selected check box is true or false	
//		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		to find count of check box
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

	      Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

	      driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	

	}

}

//here first checking the check box is selected with isselect method so showing false,after using click method check box clicked and printed as true
