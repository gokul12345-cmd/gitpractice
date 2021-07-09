package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollPRO {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
	//	driver.get("https://www.w3schools.com/js/js_popup.asp");
	//WebElement line = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
	/*JavascriptExecutor j =((JavascriptExecutor)driver);
	Thread.sleep(3000);
	/*j.executeScript("window.scrollBy(0,800)"); //Scroll Down
	Thread.sleep(3000);
	j.executeScript("window.scrollBy(0,-800)");//Scroll Up
	Thread.sleep(3000);
	j.executeScript("window.scrollBy(800,0)");//Scroll /move right
	Thread.sleep(3000);
	j.executeScript("window.scrollBy(-800,0)");//Scroll /move left.
	j.executeScript("arguments[0].scrollintoView(true);",line);
	*/
		driver.get("https://www.amazon.in/");
		
		Actions act  =new Actions(driver);
		act.moveToElement(null).click().build().perform();
		act.click();
		act.contextClick();//rignt click
		act.doubleClick();
		act.build();//combine multiple mouse action 
		act.perform(); ///to execute mouse action 
		
	
	
	
	
	
	}

}
