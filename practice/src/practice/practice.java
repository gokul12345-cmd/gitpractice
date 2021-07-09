package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("http://facebook.com/");
		String titel =driver.getTitle();
		boolean result =titel.equals("facebook");
		
		if (result) {
			System.out.println("test pass");
		}
		else
		{
			System.out.println("testfail");
		}
		System.out.println(titel);
		*/
		/*Thread.sleep(5000);
		driver.navigate().to("http://stackoverflow.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		*/
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
	
		driver.findElement(By.xpath("(//a[contains(text(),'Sign')])[1]")).click();
		WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
		username.sendKeys("pravindagadunagare@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys("Akka@123");
			 driver.findElement(By.xpath("//div[text()='Log In']")).click();
	//WebElement ok =	driver.findElement(By.xpath("//button[@type='buttom']"));
	          // ok.click();
	WebElement ok =driver.findElement(By.xpath("//a[@href='/explore/']"));
	ok.click();
	//	driver.findElement(By.name("//div[@class ='_9AhH0']"));
		/*Dimension d = new Dimension(300,566);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		Point p  = new Point(300,600);//(length (width),height) in Pixel.(pass integer)
		driver.manage().window().setPosition(p);


	//	driver.manage().window().maximize();
		//driver.close();
		//driver.quit();
		 * */
		 

	}

}
