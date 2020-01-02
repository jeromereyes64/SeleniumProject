package utils;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDataProvider {

	public Object[][] setData(String fs, String sheetName){
		Object data[][] = null;
		try {
			data = dataProvider(fs, sheetName);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getCause() + e.getMessage());
		}
		return data;
	}

	public  Object[][] dataProvider(String fLocation, String sName) throws FileNotFoundException, IOException{
		ExcelTestData testData = new ExcelTestData(fLocation, sName);
		int rowCount = testData.getRowCount();
		int colCount = testData.getColCount(0);
		Object cellData[][] = new Object[rowCount - 1][colCount];

		for (int row = 1; row < rowCount; row++) {
			for (int col = 0; col < colCount ; col++) {
				String cellData1 =  testData.getCellData(row, col);
				//ystem.out.print(cellData1 + " ");
				cellData[row-1][col] = cellData1;	
			}
			System.out.println();
		}
		return cellData;
	}	
}
