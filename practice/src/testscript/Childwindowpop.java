package testscript;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindowpop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       driver.get("https://www.w3schools.com/js/js_popup.asp");
       driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
     // alert (//a[text()='Try it Yourself »'])[1]
       // comfirm (//a[text()='Try it Yourself »'])[2]
       //prompt (//a[text()='Try it Yourself »'])[3]
    	// line (//a[text()='Try it Yourself »'])[4]
       
       driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")).click();
       driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]")).click();
       driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]")).click();
       driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]")).click();
       ArrayList<String>child=new ArrayList<String>(driver.getWindowHandles());
       System.out.println(child.get(0));
       System.out.println(child.get(1));
       System.out.println(child.get(2));
       System.out.println(child.get(3));
       Thread.sleep(5000);
       //close perticular second child window close.
   //  driver.switchTo().window(child.get(2)).close();
       driver.switchTo().window(child.get(1));
      System.out.println(driver.getCurrentUrl());
      driver.switchTo().window(child.get(2));
      System.out.println(driver.getCurrentUrl());
      driver.switchTo().window(child.get(3));
      System.out.println(driver.getCurrentUrl());
      driver.switchTo().window(child.get(4));
      System.out.println(driver.getCurrentUrl());
      Thread.sleep(5000);
      driver.switchTo().window(child.get(1)).close();
      driver.switchTo().window(child.get(2)).close();
      driver.switchTo().window(child.get(3)).close();
      driver.switchTo().window(child.get(4)).close();          
	}

}
