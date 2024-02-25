package rahullocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(5000);
		List<WebElement> options = (List<WebElement>) driver.findElement(By.cssSelector("li[class=ui-menu-item] a"));
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
			
		}
	}

}
