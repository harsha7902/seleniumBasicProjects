package window.handle;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		switching window
		driver.switchTo().newWindow(WindowType.TAB);
//		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowid = it.next();
		String childWindowid = it.next();
		driver.switchTo().window(childWindowid);
		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))

				.get(1).getText();
		driver.switchTo().window(parentWindowid);

		WebElement name=driver.findElement(By.cssSelector("[name='name']"));

		name.sendKeys(courseName);

		//Screenshot

		File file=name.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("logo.png"));

		//driver.quit();

		//GEt Height & Width

		System.out.println(name.getRect().getDimension().getHeight());

		System.out.println(name.getRect().getDimension().getWidth());


	}

}
