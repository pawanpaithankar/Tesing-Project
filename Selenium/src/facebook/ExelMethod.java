package facebook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelMethod {
	
	public static String getExeldata(int row,int col) throws EncryptedDocumentException, IOException{
		
	
	
	String path = "C:\\Users\\Sagar\\Desktop\\New folder (2)\\planing.xlsx";
	
	
	FileInputStream file = new FileInputStream(path);
	
String value=WorkbookFactory.create(file).getSheet("Sheet4").getRow(row).getCell(col).getStringCellValue();
	
	
	return value;
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String data= getExeldata(0,1);
		System.out.println(data);
		
	}
}
