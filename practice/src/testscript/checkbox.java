package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			/*driver.get("https://www.trivago.in/");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			Point  d =new Point(110,300);
			driver.manage().window().setPosition(d);
			Dimension a = new Dimension(200,400);
			driver.manage().window().setSize(a);
			driver.manage().window().maximize();
			driver.navigate().refresh();
			driver.navigate().forward();
			driver.get("https://www.marriott.com/");
			Thread.sleep(5000);
			driver.navigate().back();
			*/
			driver.get("https://www.spicejet.com/");
			driver.manage().window().maximize();
			/*System.out.println(driver.findElement(By.xpath("(//input[@value='RoundTrip'])[1]")).isSelected());
			
			driver.findElement(By.xpath("(//input[@value='RoundTrip'])[1]")).click();
			Thread.sleep(5000);
			
			System.out.println(driver.findElement(By.xpath("(//input[@value='RoundTrip'])[1]")).isSelected());
			
			System.out.println(driver.findElement(By.xpath("(//input[@value='RoundTrip'])[1]")).isEnabled());
			//select[@name='ctl00$mainContent$ddl_originStation1']
			Thread.sleep(5000);
			Select a = new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_originStation1']")));
		       a.selectByIndex(3);
			
			driver.findElement(By.xpath("(//a[@value='DEL'])[1]"));
			driver.findElement(By.xpath("(//a[@value='DEL'])[2]"));
			*/
			
			System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

			{

			System.out.println("its enabled");

			Assert.assertTrue(true);

			}

			else

			{

			Assert.assertTrue(false);

			}
		
			
			

	}

}
