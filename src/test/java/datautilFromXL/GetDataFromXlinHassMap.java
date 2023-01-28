package datautilFromXL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fasterxml.jackson.core.sym.Name;

public class GetDataFromXlinHassMap {
	public static	String xlpath="E:\\eclipse_work_space\\TestNg\\src\\test\\resources\\XlSheets\\WorkBook1.xlsx";
	public static 	String sheetname ="family details ";
	public static 	String tcid ="tc001";

	public static void main(String[] args) throws IOException {
		HashMap<String,String>	xldata=getdataxl(xlpath, sheetname, tcid);
		System.out.println(xldata.get("mobile number"));
		System.out.println(xldata.get("gender"));
		System.out.println(xldata.get("marital status"));
	}
	public static  HashMap<String,String> getdataxl(String xlpath,String sheetname,String tcid) throws IOException {		
		HashMap<String,String> alldata=new HashMap<>();

		FileInputStream fie=new FileInputStream(xlpath);
		XSSFWorkbook wb =new XSSFWorkbook(fie); 
		XSSFSheet sheet= wb.getSheet(sheetname);
		int totalrows =sheet.getLastRowNum();

		XSSFRow headerrow=sheet.getRow(0);
		for(int i=1; i<=totalrows;i++) {

			XSSFRow row =sheet.getRow(i);
			XSSFCell cell =row.getCell(0);
			String cellvalue=cell.toString();

			if (cellvalue.equalsIgnoreCase(tcid)) {
				int totalcells=headerrow.getLastCellNum();

				for (int j=0;j<=totalcells-1;j++) {
					XSSFCell headercellc=headerrow.getCell(j);
					String headercellvalue=headercellc.toString();
					XSSFCell cellc=row.getCell(j);

					try {
						String cellvaluec=cellc.toString();
						if(cellvaluec !=null) {
							//System.out.println(cellvaluec);
							alldata.put(headercellvalue, cellvaluec);
						}
					}catch(NullPointerException e){
						//System.out.println(" ");
						alldata.put(headercellvalue, "");
					}
				}
			}
		}
		wb.close();
		return alldata; 
	}
}

