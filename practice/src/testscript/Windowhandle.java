package testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		//windowhandle use parent to child .
		Set<String>window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")).getText());
		String Emailid =driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")).getText();
		
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(Emailid);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
