package utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ExcelTestData {
	private static POIFSFileSystem fs;
	private static HSSFWorkbook workbook;
	private static HSSFSheet sheet;

	public ExcelTestData(String fileLocation, String sheetName) throws FileNotFoundException, IOException{
		fs = new POIFSFileSystem(new FileInputStream(fileLocation));	
		workbook = new HSSFWorkbook(fs);
		sheet = workbook.getSheet(sheetName);
	}

	public int getRowCount(){
		int rowCount = 0;
		try {
			rowCount = sheet.getPhysicalNumberOfRows();
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getCause() + e.getMessage());
		}
		return rowCount;		
	}

	public int getColCount(int rowNum){
		int colCount = 0;
		try {
			colCount = sheet.getRow(rowNum).getPhysicalNumberOfCells();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			synchronized (e.getCause() + e.getMessage()) {
			}
		}
		return colCount;
	}

	public String getCellData(int rowCount, int cellCount){
		String cellData = null;
		try {
			cellData = sheet.getRow(rowCount).getCell(cellCount).getStringCellValue();
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getCause() + e.getMessage());
		}		
		return cellData;
	}

}
