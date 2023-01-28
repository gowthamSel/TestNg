package calendar_get;

import java.text.SimpleDateFormat;
import java.util.Calendar;


import freemarker.core.ParseException;

public class GetDataFrom {

	public static void main(String[] args) throws ParseException, java.text.ParseException {
		getTheValues("06/08/1996 00:30");
		
	}
	
	// this metgod gives the given string date into int date values
	//the given input as string format dd//Mm/yyyy  hh:mm the month has give capital mm
	
	public static  void getTheValues(String  givendate) throws ParseException, java.text.ParseException {

		//String  givendate="06/08/1996  00:15";
		SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy  hh:mm");
		//Date dt=dateformat.parse(givendate);
		java.util.Date dt=dateformat.parse(givendate);
		Calendar cale=Calendar.getInstance();
		cale.setTime(dt);

		int date=cale.get(Calendar.DAY_OF_MONTH);
		System.out.println(date);

		int month=cale.get(Calendar.MONTH);
		System.out.println(month);

		int year=cale.get(Calendar.YEAR);
		System.out.println(year);

		int hour=cale.get(Calendar.HOUR);
		System.out.println(hour);

		int minit =cale.get(Calendar.MINUTE);
		System.out.println(minit);
	}
}

