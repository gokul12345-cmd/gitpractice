package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("Enter you emailid");
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("Enter your password");
		WebElement login  = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		WebElement search =driver.findElement(By.xpath("//input[@type='search']"));
		search.sendKeys("pravin");
		WebElement massenger =driver.findElement(By.xpath("(//div[@aria-label='Messenger'])[1]"));
		massenger.click();
		
		//driver.switchTo().alert().accept();

	}

}
