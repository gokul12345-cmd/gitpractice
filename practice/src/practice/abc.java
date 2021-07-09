package practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Atharv\\Desktop\\Selenium jar\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("");
			driver.findElement(By.xpath("")).click();
			
			driver.manage().window().maximize();
			ArrayList<String> add =new ArrayList<String>(driver.getWindowHandles());
			add.get(0);
			WebElement one=driver.findElement(By.xpath(""));
			WebElement two=driver.findElement(By.xpath(""));
			WebElement three=driver.findElement(By.xpath(""));
			WebElement four=driver.findElement(By.xpath(""));
			one.click();
			two.click();
			three.click();
			four.click();
			
			System.out.println(add.get(0));
			
			System.out.println(add.get(1));
			System.out.println(add.get(2));
			System.out.println(add.get(3));
			System.out.println(add.get(4));
			
			
			System.out.println(driver.switchTo().window(add.get(1)));
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.switchTo().window(add.get(2)));
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.switchTo().window(add.get(3)));
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.switchTo().window(add.get(4)));
			System.out.println(driver.getCurrentUrl());
			
			
	}

}
