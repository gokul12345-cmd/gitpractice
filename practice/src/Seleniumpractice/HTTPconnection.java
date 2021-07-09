package Seleniumpractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTTPconnection {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
             WebDriver driver=new ChromeDriver();
             driver.get("https://www.hdfcbank.com/");
             Thread.sleep(3000);
             String url=driver.findElement(By.cssSelector("a[href='https://www.hdfc.com/']")).getAttribute("href");
             HttpURLConnection con=(HttpURLConnection)new URL(url).openConnection();
            
             con.setRequestMethod("HEAD");
             con.connect();
            Integer response= con.getResponseCode();
            System.out.println(response);
          
	}
	

}
