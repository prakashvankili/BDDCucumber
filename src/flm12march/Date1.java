package flm12march;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		
		Date  date = new Date();
//System.out.println(date);
String pattern = "yyyy-MM-dd HH:mm:ss";
	SimpleDateFormat smpl=   new SimpleDateFormat(pattern);
	 String date1=smpl.format(date);
System.out.println(date1);

    String  date2=date1.replace(":","-");
System.out.println(date2);

	}

}
