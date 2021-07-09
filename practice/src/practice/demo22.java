package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demo22 {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("gbbbhujbal@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("Myganesha@123");
		WebElement login  = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		WebElement search =driver.findElement(By.xpath("//input[@type='search']"));
		search.sendKeys("pravin");
		WebElement massenger =driver.findElement(By.xpath("(//div[@aria-label='Messenger'])[1]"));
		massenger.click();
		
		//driver.switchTo().alert().accept();

	}
	
		
		
		
		
		
		//driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]\r\n //a[contains(text(),'Women Western')]")).click();
		

	}

