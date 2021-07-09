package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newSELECTDROP {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Atharv\\Desktop\\Selenium jar\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.spicejet.com/");
			WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			Select dropdown =new Select(Staticdropdown);
			dropdown.selectByIndex(3);
			System.out.println(dropdown.getFirstSelectedOption().getText());
			dropdown.selectByVisibleText("AED");
			System.out.println(dropdown.getFirstSelectedOption().getText());
			dropdown.selectByValue("INR");
			System.out.println(dropdown.getFirstSelectedOption().getText());
			

	}

}
