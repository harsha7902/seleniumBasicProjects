package miscellaneous.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
//		System.out.println(driver.findElement(By.xpath("//label[contains(text(),\"Name\")]")).getText()); this is one method
//		another method is taking relative locator by using above();
		WebElement nameEditBox=driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
//		below method
		WebElement dateFBirth =driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateFBirth)).click();
//		toLeftOf();
		WebElement iceCream =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCream)).click();
//		toRightOf
		WebElement rightExampleWithIcecream =driver.findElement(By.cssSelector("input[type='checkbox']"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rightExampleWithIcecream)).getText());
		
		
		 

	}

}
