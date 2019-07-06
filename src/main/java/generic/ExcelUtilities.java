package generic;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class ExcelUtilities 
{
	String filepath;
	
	public ExcelUtilities(String filepath)
	{
		this.filepath = filepath;
	}
	
	public String getData(String sheetname, int row, int cell)
	{
		String value = null;
		
		try 
		{
			File file = new File(filepath);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(fis);
			Cell cl = wb.getSheet(sheetname).getRow(row).getCell(cell);
			
			switch (cl.getCellType()) 
			{
			case STRING:
				value = cl.getStringCellValue();
				break;
				
			case NUMERIC:
				if(DateUtil.isCellDateFormatted(cl)) 
				{
					Date date = cl.getDateCellValue();
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					value = sdf.format(date);
				}
				else
				{
					double number = cl.getNumericCellValue();
					long actualNumber = (long)number;
					value = Long.toString(actualNumber);
				}
				break;
				
			case BOOLEAN:
				boolean flag = cl.getBooleanCellValue();
				value = Boolean.toString(flag);
				break;

			default:
				Reporter.log("No Match Found!!", true);
				break;
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return value;
	}
}
