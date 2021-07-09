package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo33 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//input[@id='email']
		//input[@id='pass']
		//button[@name='login']
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gbbbhujbal@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Myganesha@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		*/
		
		//(//a[@role='button'])[3]
				
			//	(//input[@type='text'])[2]
					//	(//input[@type='text'])[3]
						//		(//input[@type='text'])[4]
										
	 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
	 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abhi");
	 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Umare");
     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9222525648");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("1256486");
	
	Select drop=new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
	drop.selectByVisibleText("29");
	
	
	
	}

}
