package org.XLsheetCreating.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WriteATestresultIntoXLsheet {

	public static String testcase;
	private static XSSFSheet sheet2;
	private static XSSFWorkbook workbook1;
	private static XSSFWorkbook workbook2;
	private static FileOutputStream File2;
	private static	String WorkbookName="gmr mps";

	public static void main(String[] args) throws IOException {
		WriteAresultIntoXlSheet();
		closeWorkBook();
	}

	@BeforeMethod
	public  static void WriteAresultIntoXlSheet() throws IOException {
		//String WorkbookName;
		String filePath ="E:\\eclipse_work_space\\TestNg\\src\\test\\resources\\CreationOfXlSheets\\CreationSampleData1.xlsx";
		FileInputStream file1 = new FileInputStream(filePath);				
		workbook1 =new XSSFWorkbook(file1);
		XSSFSheet sheet1 =workbook1.getSheet("sample data");

		File2=new FileOutputStream("E:\\eclipse_work_space\\TestNg\\src\\test\\resources\\CreationOfXlSheets\\"+WorkbookName+".xlsx");
		workbook2=new XSSFWorkbook();
		sheet2=workbook2.createSheet("sample data");

		int numberofRows=sheet1.getLastRowNum();
		System.out.println(numberofRows);

		for(int i=0;i<=numberofRows;i++) {
			XSSFRow row =sheet1.getRow(i);
			sheet2.createRow(i);
			int NumberofCells=row.getLastCellNum();
			System.out.println(NumberofCells);
			for(int j=0;j<=NumberofCells-1;j++) {
				XSSFCell cell =row.getCell(j);
				if(cell!=null) {
					String cellValue=cell.toString();
					sheet2.getRow(i).createCell(j).setCellValue(cellValue);
				}else {
					sheet2.getRow(i).createCell(j).setCellValue("");
				}

			}

		}

	}


	@AfterMethod
	public static void closeWorkBook() {
		try {
			workbook1.close();
		} catch (IOException e1) {

		}
		//writing the workbook1 values to the sheet
		try {
			workbook2.write(File2);
		} catch (IOException e) {

		}
		//close the workbook2
		try {
			workbook2.close();
		} catch (IOException e) {

		}

	}

	@Test
	public static void name() {
		testcase="pass";
		sheet2.getRow(1).createCell(4).setCellValue(testcase);
	}
}
