package testscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excellll {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path ="D:\\demo11.xlsx";
		FileInputStream file=new FileInputStream(path);
	
	//	String WB=WorkbookFactory.create(file).getSheet("demo").getRow(0).getCell(1).getStringCellValue();

	//	System.out.println(WB);//print cell
		
		Workbook r = WorkbookFactory.create(file);
		r.getNumberOfSheets();
		Sheet st1=r.getSheet("demo");
		Sheet st2=r.getSheet("demo1");
		Sheet st3 =r.getSheet("demo2");
		System.out.println("number of sheet "+r.getNumberOfSheets());//print no of sheet.
		st1.getLastRowNum();
		st1.getRow(0).getLastCellNum();
		
		for(int i=0;i<st1.getLastRowNum();i++) {
			for(int j =0;j<st1.getRow(0).getLastCellNum();j++) {
				String abc =st1.getRow(i).getCell(j).getStringCellValue();
				System.out.print(abc+"  ");
			}
			System.out.println();
		}
		System.out.println("****************************");
		for(int i=0;i<st2.getLastRowNum();i++) {
			for(int j =0;j<st2.getRow(0).getLastCellNum();j++) {
				String abc =st2.getRow(i).getCell(j).getStringCellValue();
				System.out.print(abc+"  ");
			}
			System.out.println();
		}
		System.out.println("****************************");
		for(int i=0;i<st3.getLastRowNum();i++) {
			for(int j =0;j<st3.getRow(0).getLastCellNum();j++) {
				String abc =st3.getRow(i).getCell(j).getStringCellValue();
				System.out.print(abc+"  ");
			}
			System.out.println();
		}
		

		
		//WorkbookFactory.create(file);
		
	}

}
