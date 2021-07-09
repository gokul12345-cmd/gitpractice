package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		WebElement from =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	//	from.sendKeys("Pune");
		Actions c = new Actions((WebDriver) from);
		c.sendKeys("Pune").click().build().perform();
		
	//	WebElement Destination =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	//	Destination.sendKeys("Banglaure");
	//	WebElement from =driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	}

}
