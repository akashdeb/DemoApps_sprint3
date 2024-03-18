package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Convert the physical representation of excel sheet to Java Representation
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_Jan_10AM_Batch\\demoApps\\src\\test\\resources\\testData\\demoAppsData.xlsx");
		
		//Access the workbook
		Workbook workbook = WorkbookFactory.create(fis);
		
		//Access the sheet 
		Sheet sheet = workbook.getSheet("Sheet1");
		
		//Access the row 
		Row row = sheet.getRow(3);
		
		//Access the cell
		Cell cell = row.getCell(0);
		
		//Access the data depending on the data type
		String candidateName = cell.getStringCellValue();
		
		System.out.println(candidateName);
		
		long candidatePhoneNo = (long)row.getCell(3).getNumericCellValue();
		
		System.out.println(candidatePhoneNo);
		
		boolean candidateStatus = row.getCell(4).getBooleanCellValue();
		
		if(candidateStatus) {
			System.out.println("Stop searching");
		}
		
		else
			System.out.println("Please continue");
	}

}
