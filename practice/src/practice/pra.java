package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Atharv\\Desktop\\Selenium jar\\chromedriver_win32 (1)\\chromedriver.exe");
	        //WebDriver driver = new FirefoxDriver();
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://stackoverflow.com/");
	}

}
