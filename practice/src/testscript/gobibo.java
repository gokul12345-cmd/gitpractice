package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class gobibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		WebElement from =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		from.sendKeys("pune");
		
		WebElement destination =driver.findElement(By.xpath("(//div[@class='mainTxt clearfix'])[1]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(destination).click().build().perform();
		
	//	WebElement Destination =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	//	Destination.sendKeys("Banglaure");
	//	WebElement from =driver.findElement(By.xpath("(//input[@type='text'])[3]"));
				
	}

}
