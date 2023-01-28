package org.XLsheetCreating.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreationOfXlSheet {


	public static void main(String[] args) throws IOException {
		String xlsheetPath=	CreateXlSheet("CreationSampleData1");
		System.out.println(xlsheetPath);
	}

	public static  String CreateXlSheet(String name) throws IOException {

		String path="E:\\eclipse_work_space\\TestNg\\src\\test\\resources\\CreationOfXlSheets\\"+name+".xlsx";
		File file =new File(path);

		//creation of the xl-sheet
		FileOutputStream output=new FileOutputStream(file);
		//creation of the work book
		XSSFWorkbook workbook=new XSSFWorkbook();

		//creation of the sheet and give the name of the sheet
		XSSFSheet sheet=	workbook.createSheet("sample data");


		//creation of the row and the give the row cell values 
		sheet.createRow(0);
		//give the valiue to the cells in the given row  number
		sheet.getRow(0).createCell(0).setCellValue("Tc_id");
		sheet.getRow(0).createCell(1).setCellValue("user_name");
		sheet.getRow(0).createCell(2).setCellValue("password");
		sheet.getRow(0).createCell(3).setCellValue("access");
		sheet.getRow(0).createCell(4).setCellValue("result");


		//creation of the second row 
		sheet.createRow(1);
		//give the values to the second row cells 
		sheet.getRow(1).createCell(0).setCellValue("test_001");
		sheet.getRow(1).createCell(1).setCellValue("admin");
		sheet.getRow(1).createCell(2).setCellValue("admin123");
		sheet.getRow(1).createCell(3).setCellValue("public");
		//sheet.getRow(1).createCell(4).setCellValue();


		//same of the first and second row 
		sheet.createRow(2);
		sheet.getRow(2).createCell(0).setCellValue("test_002");
		sheet.getRow(2).createCell(1).setCellValue("Admin");
		sheet.getRow(2).createCell(2).setCellValue("admin123");
		sheet.getRow(2).createCell(3).setCellValue("public");
		//	sheet.getRow(2).createCell(4).setCellValue("result");


		sheet.createRow(3);
		sheet.getRow(3).createCell(0).setCellValue("test_003");
		sheet.getRow(3).createCell(1).setCellValue("Admi");
		sheet.getRow(3).createCell(2).setCellValue("admin124");
		sheet.getRow(3).createCell(3).setCellValue("private");
		//sheet.getRow(3).createCell(4).setCellValue("result");


		//create fourth row
		XSSFRow row = sheet.createRow(4);

		row.createCell(0).setCellValue("test_003");
		row.createCell(1).setCellValue("AdminA");
		row.createCell(2).setCellValue("adMIN123");
		row.createCell(3).setCellValue("private");


		//writing the above values to the sheet
		workbook.write(output);
		//close the sheet
		workbook.close();

		return file.getAbsolutePath();

	}
}
