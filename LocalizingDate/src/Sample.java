import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Sample {

	public static void main(String[] args) {
		
		DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,new Locale("en","US"));
			
				
	    String d1=df.format(new Date());
		System.out.println(d1);
				
				
	}

}
