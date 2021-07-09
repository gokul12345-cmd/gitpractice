package practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Dragdrop {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		WebElement source =driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement dist =driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions ac =new Actions(driver);
		ac.dragAndDrop(source, dist).perform();
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	File sr= new File("./dragdrop.jpg");
		File sr= new File("C:\\Users\\Atharv\\Desktop\\Softwaretesting main flo\\dragdrop.jpg");
	    FileHandler.copy(file, sr);
	    Thread.sleep(3000);
	    driver.quit();
		
	}

}
