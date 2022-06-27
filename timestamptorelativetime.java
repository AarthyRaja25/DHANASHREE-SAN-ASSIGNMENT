package Assignmentbasicsproblemdhanashreesan;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class timestamptorelativetime {
	public static void main(String[] args){
		
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	        Date past = null;
			try {
				past = format.parse("01/10/2010");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	        Date now = new Date();

	        long msecs=TimeUnit.MILLISECONDS.toMillis(past.getTime());
}
	
	public static String dayStringFormat(long msecs) {
        final long ONE_SECOND = 1000L;
        final long ONE_MINUTE = 60000L;
        final long ONE_HOUR = 3600000L;
        final long ONE_DAY = 86400000L;
        final long ONE_MONTH = 2592000000L;
        final long ONE_YEAR = 31536000000L;
       // int gmtOffset = TimeZone.getDefault().getRawOffset();
        long currentTime = System.currentTimeMillis();
        long difference = currentTime - msecs;
        if (difference < ONE_MINUTE) {
            long timeAgo = difference / ONE_SECOND;
            int finalUnits = (int) timeAgo;
            return "Just Now";
        } else if (difference < ONE_HOUR) {
            long timeAgo = difference / ONE_MINUTE;
            int finalUnits = (int) timeAgo;
            return  finalUnits + " " + "Minutes Ago";
        } else if (difference < ONE_DAY) {
            long timeAgo = difference / ONE_HOUR;
            int finalUnits = (int) timeAgo;
            return finalUnits + " " + "Hours Ago";
        } else if (difference < ONE_MONTH) {
            long timeAgo = difference / ONE_DAY;
            int finalUnits = (int) timeAgo;
            return  finalUnits +" " + "Days Ago";
        } else if (difference < ONE_YEAR) {
            long timeAgo = difference / ONE_MONTH;
            int finalUnits = (int) timeAgo;
            return  finalUnits + " " + "Months Ago";
        } else {
            long timeAgo = difference / ONE_MONTH;
            int finalUnits = (int) timeAgo;
            return  finalUnits + "" + "Months Ago";

        }
	}
}
