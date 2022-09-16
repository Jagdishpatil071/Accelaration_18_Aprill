package org.exeloperation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis = new FileInputStream("./ExelFile/TestData.xlsx");
Workbook wb= WorkbookFactory.create(fis);
int totalsheets= wb.getNumberOfSheets();
System.out.println("tatal sheets ="+totalsheets);

 String SheetName = wb.getSheetName(2);
 System.out.println("Sheet Name = "+SheetName);
 
 for(int i=0; i<totalsheets;i++) {
	 System.out.println("Sheet Name = " +wb.getSheetName(i));
 }
	}

}
//"E:\accelaration9march\March_09_Selenium\ExelFile\TestData.xlsx"