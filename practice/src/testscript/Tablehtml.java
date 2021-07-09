package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablehtml {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement>cells =driver.findElements(By.xpath("//table[@id='customers']//td"));
		String text;
		for(int i=0;i<cells.size();i++) {
			text=cells.get(i).getText();
			System.out.println(text);
		}

		//System.out.println(cells.get(0).getText());
		
	}

}
