package testscript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class login {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Atharv\\Desktop\\Selenium jar\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost/login.do");
			File loginscreen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File jpg =new File(".\\login.jpg");
			FileHandler.copy(loginscreen,jpg);
			WebElement username =driver.findElement(By.xpath("//input[@name='username']"));
			    username.sendKeys("admin");
			WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
			password.sendKeys("manager");

			WebElement login = driver.findElement(By.cssSelector("a[id='loginButton']"));
			login.click();
			WebElement task = driver.findElement(By.xpath("//img[@class ='sizer'][1]"));
			task.click();
			WebElement createtask = driver.findElement(By.xpath("//div[@class ='i'][1]"));
			createtask.click();
		//	WebElement drop = driver.findElement(By.xpath("//em[@unselectable='on']"));
		//	drop.click();
			Select newdrop= new Select(driver.findElement(By.xpath("//button[@class ='x-btn-text'][1]")));
			newdrop.selectByVisibleText("");
			System.out.println("newdrop");


	}

}
