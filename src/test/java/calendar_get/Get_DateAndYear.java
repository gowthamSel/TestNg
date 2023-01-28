package calendar_get;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Get_DateAndYear {

	public static void main(String[] args) throws ParseException {

		calendarGettings(); 

	}

	public static  void calendarGettings() throws ParseException {

		String manualDate="06/08/1996  01:00";
		SimpleDateFormat simpdate=new SimpleDateFormat("dd/MM/yyyy  hh:mm");
		java.util.Date dt=simpdate.parse(manualDate);
		Calendar cal=Calendar.getInstance();
		cal.setTime(dt);

		/**first of all we convert the sample date format
		 * and ofter we conver the simple date format into to the date format
		 * ofter convert the date format into the calander
		 * and see the time cal.settimeIndateformat) and using the total at where your palce*/


		int date =cal.get(Calendar.DAY_OF_MONTH);
		int month =cal.get(Calendar.MONTH);
		String monthName=cal.getDisplayName(Calendar.MONTH,Calendar.LONG, Locale.ENGLISH);
		String weekName=cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.ENGLISH);
		int year =cal.get(Calendar.YEAR);
		int hour =cal.get(Calendar.HOUR);
		int mint =cal.get(Calendar.MINUTE);

		System.out.println(date);
		System.out.println(month+1);
		System.out.println(monthName);
		System.out.println(weekName);  
		System.out.println(year);
		System.out.println(hour);
		System.out.println(mint);
	}
	
	

}
