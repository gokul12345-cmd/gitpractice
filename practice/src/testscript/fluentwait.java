package testscript;

import java.time.Duration;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Atharv\\Desktop\\Selenium jar\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// explicite wait
//		WebDriverWait wa=new WebDriverWait(driver,60);
//		WebElement acd = wa.until((ExpectedConditions.visibilityOfElementLocated(By.xpath(""))));

		/*
		 * //fluentwait Wait <WebDriver> wait = new
		 * FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
		 * .pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		 * 
		 * WebElement too = Wait.until(new Function<WebDriver,WebElement>(){
		 * 
		 * public WebElement apply(WebDriver driver) {
		 * 
		 * return driver.findElement(By.id("")); } });
		 */
		Wait<WebDriver> asd = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))// max wating time
				.pollingEvery(Duration.ofSeconds(2))// frequency polling interval time
				.ignoring(NoSuchElementException.class);// ignore case excepation.

		WebElement ele = asd.until(new Function<WebDriver, WebElement>()

		{
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("      "));

			}

		});

	}

}
