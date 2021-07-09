package Seleniumpractice;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class brokenline {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Atharv\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
	//	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	//	WebDriver driver =new ChromeDriver();
		driver.get("https://www.shyaway.com/");

	}

}
