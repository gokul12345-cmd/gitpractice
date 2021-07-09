package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excellsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//	System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
	 String path ="E:\\Admission Details 21-22.xlsx";
	 FileInputStream file =new FileInputStream(path);
 Workbook r = WorkbookFactory.create(file);
      int s =r.getNumberOfSheets();
   
   for(int i =0;i<s;i++) {
	   
	   Sheet shit =r.getSheetAt(i);
	   System.out.println("******"+r.getSheetName(i)+"********");
	   
	   int row=shit.getLastRowNum();
	   
	   for(int j=0;j<row;j++) {
		   Row row1=shit.getRow(j);
		   int cell=row1.getLastCellNum();
		   for(int k=0;k<cell;k++) {
			  Cell cellvalue=row1.getCell(k);
			  System.out.print(cellvalue+"     ");
			   
		   }
		   System.out.println();
		   
		   
		   
		   
	   }
   }
   
		   
		   
		
	

	
	
	
	
	
	
	
	
	}

}
