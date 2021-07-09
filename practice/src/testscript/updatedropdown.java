package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class updatedropdown {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Atharv\\Desktop\\Selenium jar\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.spicejet.com/");
			Thread.sleep(2000);
			driver.findElement(By.id("divpaxinfo")).click();
			WebElement prop =driver.findElement(By.id("adultDropdown"));
			boolean result = prop.isDisplayed();
			
			
			
			//Select staticdropdown =new Select(drop);
		//	staticdropdown.selectByIndex(5);
			
			
	}

}
