package practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Atharv\\Desktop\\Selenium jar\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
          driver.get("http://demo.guru99.com/popup.php");
		
	    driver.manage().window().maximize();
	    
	    WebElement ok = driver.findElement(By.xpath("//a[text()='Click Here']"));
	    
	    ok.click();
		
		ArrayList<String> ref = new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(ref.get(0));
		
		System.out.println(ref.get(1));
		
		driver.switchTo().window(ref.get(1));
		
		
	WebElement sk = driver.findElement(By.xpath("//input[@name='emailid']"));
	sk.sendKeys("ok@gmail.com");
		
	
	}


	}


