package org.exeloperation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
   FileInputStream fis = new FileInputStream("./ExelFile./TestData.xlsx");
   Workbook wb = WorkbookFactory.create(fis);
	org.apache.poi.ss.usermodel.Sheet s1= wb.getSheet("TestData");   

   int lastrownum=  s1.getLastRowNum();
   System.out.println("last Row Num ="+lastrownum);
   
   int phycalrownum= s1.getPhysicalNumberOfRows();
   System.out.println("phycalRownum= "+phycalrownum);
	}

}
