package testscript;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class itsmyecommerc {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String[] listproduct = { "Brocolli", "Cauliflower", "Carrot", "Pumpkin" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dist =new File("D:\\take.jpeg");
		Files.copy(source,dist);

		// this is one method find element on webpages.
		/*
		 * driver.findElement(By.xpath("//h4[text()='Brocolli - 1 Kg']")).click();
		 * driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		 */
		Thread.sleep(5000);
		 addItems(driver, listproduct);

	}

	public static void addItems(WebDriver driver, String[] listproduct) throws IOException {

		int j = 0;

		List<WebElement> product = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < product.size(); i++) {

			String[] name = product.get(i).getText().split("-");
			String formatname = name[0].trim();
			List listarraypro = Arrays.asList(listproduct);

			if (listarraypro.contains(formatname)) {
				j++;

				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if (j == listproduct.length) {

					break;

				}

			}
		}
		

	}
	
	
	// array convert to arraylist

}
