package datautilFromXL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class GetdataFromXlSheet {


	public static	String xlpath="E:\\eclipse_work_space\\TestNg\\src\\test\\resources\\XlSheets\\WorkBook1.xlsx";
	public static 	String sheetname ="family details ";
	public static 	String tcid ="tc006";


	public static void main(String[] args) throws IOException {
		//String path =System.getProperty("user.dir");
		//System.out.println(path);

		FileInputStream fie=new FileInputStream(xlpath);
		XSSFWorkbook wb =new XSSFWorkbook(fie);
		XSSFSheet sheet= wb.getSheet(sheetname);
		int totalrows =sheet.getLastRowNum();
		for(int i=1; i<=totalrows;i++) {
			XSSFRow row =sheet.getRow(i);
			XSSFCell cell =row.getCell(0);
			String cellvalue=cell.toString();
			if (cellvalue.equalsIgnoreCase(tcid)) {
				int totalcells=row.getLastCellNum();
				for (int j=0;j<=totalcells-1;j++) {
					XSSFCell cellc=row.getCell(j);
					try {
						String cellvaluec=cellc.toString();
						if(cellvaluec !=null) {
							System.out.println(cellvaluec);
						}
					}catch(NullPointerException e){
						System.out.println("this value is empty on r:"+i+"  c:"+j+"");
					}
				}
			}
		}
		wb.close();
	}
}
