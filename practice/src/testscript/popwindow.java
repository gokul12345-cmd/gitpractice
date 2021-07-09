package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("gbbbhujbal@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Myganesha@123");
		driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		driver.findElement(By.xpath("//button[text()='Turn On']")).click();

	}

}
