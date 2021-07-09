package practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class screenshot {

	

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 WebElement sk = driver.findElement(By.xpath("//input[@name='username']"));
			sk.sendKeys("xx___mr.omkar___xx");
		 WebElement sk1 = driver.findElement(By.xpath("//input[@name='password']"));
				sk1.sendKeys("akka@123");
				
		//driver.findElement(By.name("username")).sendKeys("gbbbhujbal@gmail.com");
      //  driver.findElement(By.name("password")).sendKeys("Myganesha@123");
				
        driver.findElement(By.xpath("//div[text()='Log In']")).click();
        for (int i=0;i<=3;i++) {
     File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        File dest = new File("D:\\instagram"+i+".jpeg");
    //    FileHandler.copy(source, dest);
        Files.copy(source, dest);
        }
        

	}

}
