package practice;


import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import jdk.jshell.SourceCodeAnalysis.Documentation;


public class Scrolle {
	public static void demo(WebDriver driver)throws IOException  {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(source, new File("./image.jpg"));
		
	}

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");	
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,1000)");
		List<WebElement> conn=driver.findElements(By.cssSelector("li[class='nav_first'] a"));
		for(WebElement lp:conn) {
			
			String url=lp.getAttribute("href");//href value link data in inspect
			HttpURLConnection a =(HttpURLConnection) new URL(url).openConnection();
			a.setRequestMethod("HEAD");
			a.connect();
			int b =a.getResponseCode();
			System.out.println(b);
			demo(driver);
		}
	}

}
