package testscript;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class actionmouse1 {
	
	public static void scrrenshot(WebDriver driver,String filename) throws IOException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		for(int i=1;i<=2;i++) {
		File dist = new File("D:\\Screenshot\\test"+i+".jpeg");
		Files.copy(source, dist);
		}
		
		
	}

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement move =driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
	//	a.moveToElement(move).build().perform();
		a.moveToElement(move).contextClick().build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("samsung").doubleClick().build().perform();
		driver.findElement(By.id("nav-search-submit-button")).click();
		Date  Concurrent = new Date();
	 String time = Concurrent.toString().replace(" ","-").replace(":","-");
		
		scrrenshot(driver,time);
	}

}
