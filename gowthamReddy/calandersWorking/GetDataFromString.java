package calandersWorking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class GetDataFromString {

	public static void main(String[] args) throws ParseException {
		getTheValues();

	}

	// this metgod gives the given string date into int date values
	//the given input as string format dd//Mm/yyyy  hh:mm the month has give capital mm
	//the month value is get only index numbers due to we add one number into thge syso output 
	//and we get proprer value 
	public static  void getTheValues() throws ParseException {
		//String  givendate
		String  givendate="06/08/1996  01:00";
		SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy  hh:mm");
		//Date dt=dateformat.parse(givendate);
		java.util.Date dt=dateformat.parse(givendate);
		Calendar cale=Calendar.getInstance();
		cale.setTime(dt);

		int date=cale.get(Calendar.DAY_OF_MONTH);
		System.out.println(date);

		int month=cale.get(Calendar.MONTH );
		System.out.println(month+1);

		int year=cale.get(Calendar.YEAR);
		System.out.println(year);

		int hour=cale.get(Calendar.HOUR);
		System.out.println(hour);

		int minit =cale.get(Calendar.MINUTE);
		System.out.println(minit);
	}
}

