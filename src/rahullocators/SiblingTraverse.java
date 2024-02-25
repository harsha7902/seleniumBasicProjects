package rahullocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingTraverse {

	public static void main(String[] args) throws InterruptedException {
//		******************************************
		// parent to child traverse
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following::button[1]")).getText());
//		******************************************
		// child to parent traverse
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a")).getText());
//	another sibling to parent example
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
		
	}

}
