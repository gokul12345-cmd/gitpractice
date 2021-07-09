package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class forpractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement createaccount =driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Thread.sleep(5000);
		createaccount.click();
		Thread.sleep(5000);
		//firstname,last name,emailid ,password,comformpassword,checkbox button,next.
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("gopal");
		Thread.sleep(5000);
		WebElement lastname =driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		lastname.sendKeys("patil");
		Thread.sleep(5000);
		
		WebElement emailid =driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		emailid.sendKeys("Myganesha@123.com");
		Thread.sleep(5000);
		WebElement comemailid =driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
		comemailid.sendKeys("Myganesha@123.com");
		Thread.sleep(5000);

		WebElement password= driver.findElement(By.cssSelector("*[id='password_step_input']"));
		password.sendKeys("Pune@12345");
		Select Dropday = new Select(driver.findElement(By.cssSelector("select[name='birthday_day']")));
		Dropday.selectByIndex(15);
		Select Dropmon = new Select(driver.findElement(By.cssSelector("select[name='birthday_month']")));
		Dropmon.selectByIndex(6);
		Select Dropyear = new Select(driver.findElement(By.cssSelector("select[name='birthday_year']")));
		Dropyear.selectByIndex(2021);
		
		//WebElement signup=driver.findElement(By.xpath("//button[@name='login']"));
		//login.click();
		/*Thread.sleep(5000);
		WebElement password =driver.findElement(By.xpath("//input[@name='Passwd']"));
		password.sendKeys("Gopalpawar@123");
		Thread.sleep(5000);
		WebElement conformpassword =driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		conformpassword.sendKeys("Gopalpawar@123");
		*/
		
		
		//*[@id="firstName"]
	}

}
