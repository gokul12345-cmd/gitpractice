package testscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Execleandparametric {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
String path ="D:\\demo11.xlsx";
FileInputStream file=new FileInputStream(path);
//String value=WorkbookFactory.create(file).getSheet("demo").getRow(0).getCell(1).getStringCellValue();
//double num =WorkbookFactory.create(file).getSheet("demo").getRow(1).getCell(1).getNumericCellValue();
//	System.out.println(value);
	
//OR	
	/*Workbook r = WorkbookFactory.create(file);
	Sheet s =r.getSheet("demo");
	int lastRowNumber= s.getLastRowNum();
	Row row =s.getRow(0);
    int lastcellNumber =row.getLastCellNum();
	Cell cell = row.getCell(1);
    String value1 =cell.getStringCellValue();
	//double num =cell.getNumericCellValue();
	System.out.println(value1);
	System.out.println(lastRowNumber);*/
    //OR
     
	Sheet sheet = WorkbookFactory.create(file).getSheet("demo");
	
	//for loop
	 for(int d =0 ;d<=.getLastRowNum();d++){
	 for(int c=0;c<=row.getLastCellNum();c++){
	 
	String cValue= sheet.getRow(0).getCell(1).getStringCellValue();
	System.out.print(cValue);
	}
	 }
	}
	
	}

	


