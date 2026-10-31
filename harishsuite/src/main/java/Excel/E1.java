package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class E1 {
	//*apache poi,apache poi ooxml,apache poi ooxml schema
	@Test
	public void t1() throws IOException
	{
		File f =new File("C:\\Users\\Admin\\Desktop\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		//xlsx:XSSF
		//xls:HSSF
		//workbook
		
		XSSFWorkbook x=new XSSFWorkbook(fis);
		XSSFSheet sheet =x.getSheetAt(0);
		
		//No of rows
		System.out.println(sheet.getLastRowNum());
		
		//no of columns
		int c1=sheet.getRow(0).getLastCellNum();
		System.out.println("No of columns " + c1);
		
		System.out.println(sheet.getRow(0).getCell(2));
		
		//write in excel
		
		sheet.getRow(2).createCell(2).setCellValue("bye");
		FileOutputStream fos =new FileOutputStream(f);
		x.write(fos);
			
	}
	
	

}
