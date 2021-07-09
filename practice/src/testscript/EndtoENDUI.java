package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndtoENDUI {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Thread.sleep(5000);
		// driver.findElement(By.xpath("(//a[@value='IXB'])[2]")).click();
		// div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']
		// //a[@value='IXB']

		// parent child relation ship.
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BHO']"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//td[@data-handler='selectDay'])[1]")).click();
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		driver.findElement(By.xpath("//p[@id='adultDropdown']")).click();
		Select asd = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		asd.selectByIndex(5);
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		dropdown.selectByIndex(2);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();

		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();

	}

}
