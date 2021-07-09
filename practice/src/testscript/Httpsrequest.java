package testscript;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Httpsrequest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		
		 List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		 
		for(WebElement link:links) {
			String Url=link.getAttribute("href");
			HttpURLConnection conn =(HttpURLConnection)new URL(Url).openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int resposecode =
			conn.getResponseCode();
			
			System.out.println(resposecode);
			
			
		}
		 
		 

	}
	}


