package testscript;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	/*driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_opener");
	Thread.sleep(3000);
		WebElement xyz =driver.findElement(By.cssSelector("[id='iframeResult']"));
		driver.switchTo().window(xyz);
		WebElement frame = driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		frame.click();
		driver.switchTo().defaultContent();*/
		
		
	driver.get("https://www.w3schools.com/js/js_popup.asp");
driver.findElement(By.xpath("(//a[contains(text(),'Try it')])[2]")).click();
//driver.findElement(By.cssSelector("[id='iframeResult']"));
//driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));

	
   ArrayList<String >	it = new ArrayList<String>(driver.getWindowHandles());
  System.out.println(it.get(0));
  driver.switchTo().window(it.get(0));
  System.out.println(driver.getCurrentUrl());
  System.out.println(it.get(1));
  driver.switchTo().window(it.get(1));
  System.out.println(driver.getCurrentUrl());
 // driver.switchTo().window(it.get(1)).switchTo().frame(0);
  
  
/*
		Thread.sleep(3000);
			driver.findElement(By.cssSelector("[id='iframeResult']"));
			Thread.sleep(3000);
			
			
			driver.switchTo().defaultContent();
			*/
	
		
	
	
	
	
	
	}

}
