package rahullocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		********************************************************
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		WebElement StaticDrpdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown = new Select(StaticDrpdown);
//		dropdown.selectByIndex(2);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		********************************************************
		driver.get("https://www.spicejet.com/");
		// a[@value='MAA'] - Xpath for chennai

		// //a[@value='BLR']

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(2000);

		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

	}

}
