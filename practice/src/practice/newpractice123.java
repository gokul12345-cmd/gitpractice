package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newpractice123 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Gokul");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Bhujbal");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("gokulbhujbal12345@gmail.com");
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")).sendKeys("gokulbhujbal12345@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Myganesha1234567123");
        Thread.sleep(5000);
        Select drop=new Select(driver.findElement(By.xpath("//select[@id='day']")));
        drop.selectByValue("10");
        Thread.sleep(5000);
        Select drop1=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        drop1.selectByValue("12");
        Thread.sleep(5000);
        Select drop2=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        drop2.selectByValue("1991");
	}



	

}

