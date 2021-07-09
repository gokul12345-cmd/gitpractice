package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		WebElement Source =driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dist =driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(Source, dist).perform();
	}

}
