package Datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\DataDriven\\F.xlsx");
		
		Workbook work = WorkbookFactory.create(fis);
		String Testdata = work.getSheet("Sheet1").getRow(0).getCell(0).toString();
		System.out.println(Testdata);

	}

}
