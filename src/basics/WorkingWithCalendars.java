package basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class WorkingWithCalendars {

	public static void main(String[] args) throws ParseException {
		
		String dob = "4/5/2000";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date =  sdf.format(new Date());
		Date dtDOB =  sdf.parse(dob);
		System.out.println(dtDOB);
		
		
		Date dt = new Date();
		
		//System.out.println(dt);
		
		Calendar c = Calendar.getInstance();
		
		c.setTime(dtDOB);
		
		c.add(Calendar.YEAR, -10);
		
		System.out.println(c.getTime());
		
		/*
		
		int dayNum = c.get(Calendar.DAY_OF_MONTH);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		int dayOfWeek = c.get(7);
		int hour = c.get(Calendar.HOUR);
		int hour24 = c.get(Calendar.HOUR_OF_DAY);
		
		String monthName = c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.ENGLISH);
		
		System.out.println(monthName);
		
		*/
		
	}

}
