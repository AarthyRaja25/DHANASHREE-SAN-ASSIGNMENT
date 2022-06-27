package Assignmentbasicsproblemdhanashreesan;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class TimetorelativeTime {
	   public static void main(String[] args) {
		   SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	      
			Date past = null;
			try {
				past = format.parse("12/12/1998");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        Date now = new Date();

	        System.out.println(TimeUnit.MILLISECONDS.toMillis(now.getTime() - past.getTime()) + " milliseconds ago");
	        System.out.println(TimeUnit.MILLISECONDS.toMinutes(now.getTime() - past.getTime()) + " minutes ago");
	        System.out.println(TimeUnit.MILLISECONDS.toHours(now.getTime() - past.getTime()) + " hours ago");
	        System.out.println(TimeUnit.MILLISECONDS.toDays(now.getTime() - past.getTime()) + " days ago");
	

		  
			
}
}