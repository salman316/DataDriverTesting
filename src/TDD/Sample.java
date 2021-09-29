package TDD;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample {
 
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
  
	String path ="C:\\Users\\sshai\\Videos\\VELOCITY CHINCHWAD\\ExcellSheet\\HalfEbayTestData.xlsx";
	
	FileInputStream xl = new FileInputStream (path);
	
	String val = WorkbookFactory.create(xl).getSheet("RegisTestData").getRow(0).getCell(0).getStringCellValue();
	
	System.out.println(val);
	
}
}
