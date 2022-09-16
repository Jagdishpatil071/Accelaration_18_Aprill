package org.exeloperation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./ExelFile/TestData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet s1= wb.getSheet("TestData");
		
	int lastrownum = s1.getLastRowNum();
	System.out.println("last Row num=" +lastrownum);	
	
	int phynum= s1.getPhysicalNumberOfRows();
	System.out.println("Physical num of Rowa = "+phynum);	
	}

}
//"E:\accelaration9march\March_09_Selenium\ExelFile\TestData.xlsx"
