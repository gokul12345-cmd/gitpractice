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

import com.google.common.io.Files;

public class demo {

	public static void main(String[] args) throws InterruptedException, IOException  {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement CreateNewAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		CreateNewAccount.click();

		Thread.sleep(5000);

		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));

		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));

		FirstName.sendKeys("abhi");
		LastName.sendKeys("umare");
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dist = new File("D:\\instagram.jpeg");
		// FileHandler.copy(source, dist);
		Files.copy(source, dist);

	}

}
