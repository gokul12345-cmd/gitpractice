package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class givepractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.travolook.in/?utm_campaign=SK_Generic_12March2021_Exact&utm_medium=cpc&utm_source=google&gclid=CjwKCAjwzruGBhBAEiwAUqMR8EI54Poofj8IQD0ik4_UXrXsucF0f2vk2Pm2-8s1HZdvDjBY0_xqbxoCVWcQAvD_BwE");

		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	
		// from.clear();

		from.sendKeys("Delhi");
	

	}

}
