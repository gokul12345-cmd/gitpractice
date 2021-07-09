package Autoit;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import collection.hashmap;

public class Uploadfile {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//dounload path to create user.directory use get method.
	String downloadpath =System.getProperty("user.dir");
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
	
//this is chrome directory veriable create and store path of selenium foluder	
HashMap<String,Object> chromeperfs =new HashMap<String,Object>();
chromeperfs.put("profile.default_content_settings.popups", 0);
chromeperfs.put("download.default_directory", downloadpath);

//this option of chrome to send the file invoking in selenium project
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("prefs", chromeperfs);
	
	//invoking selenium put aurgument options
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("C:\\Users\\Atharv\\Desktop\\pdf.exe");
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@id='processTaskTextBtn']")));
	driver.findElement(By.xpath("//span[@id='processTaskTextBtn']")).click();
	//File fl =new File("C:\\Users\\Atharv\\Downloads\\document.docx");
	Thread.sleep(3000);
	File fl = new File(downloadpath+"/document.docx");
	if(fl.exists()) {
		//System.out.println("is successfully found");
	//Assert.assertTrue(fl.exists());
		System.out.println("is successfully found");
		
		if(fl.delete()) 
		//	Assert.assertTrue(fl.delete());
			System.out.println("is successfully deleted");
		
		
	}
	

}
}
