package mark.workspace.java_tips;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String date = getCurrentTime();
    	System.out.println(date);
        System.out.println( "Hello World!" );
    }
    
    
    public static String getCurrentTime(){
    	String current = null;
    	try{
    			SimpleDateFormat dateFormatUTC = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	dateFormatUTC.setTimeZone(TimeZone.getTimeZone("UTC"));
    	
    	SimpleDateFormat dateFormatLocal = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	
    	Date dt = dateFormatLocal.parse(dateFormatUTC.format(new Date()));
    	current = dt.toString();
    	
    	}catch(Exception ex){
    		
    	}
    
    	return current;
    }
}
