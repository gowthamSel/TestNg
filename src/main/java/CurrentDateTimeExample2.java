import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;  
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.xml.sax.SAXException;

public class CurrentDateTimeExample2 { 
	//
	//	public static void sample() {  
	//		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	//		Date date = new Date();  
	//		String datee=formatter.format(date);
	//	}  

	public static void main(String[] args) throws ParseException {
		System.out.println(getTheValues());
	}

	public static  String getTheValues() throws ParseException {

		Date dt = new Date(); 
		Calendar cale=Calendar.getInstance();
		cale.setTime(dt);
		cale.add(Calendar.DAY_OF_MONTH, -1);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		return sdf.format(cale.getTime());

	}
	

}  