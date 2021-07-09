package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.airindia.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();

	}

}
