package facebook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Execsheet {

	public static String getExeldata(int row,int col) throws EncryptedDocumentException, IOException{
		

		String path = "C:\\Users\\Sagar\\Desktop\\New folder (2)\\planing.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		  Sheet s =WorkbookFactory.create(file).getSheet("Sheet4");
				  
		 
		 int i;
		 int j;
		 
		 for(i=0; i<=3; i++)
		 {
			 for(j=0; j<=1; j++)
			 {
				 String value =s.getRow(i).getCell(j).getStringCellValue();
				 System.out.print( "     " + value);
			 }
			 
			 System.out.println();
		 }
		return path;
		  }
		 
		
		
		
	}

	

