import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat; 
import java.util.Scanner;
 
public class Activity01_Midterms 
{
    
    public static void main(String[] args) throws Exception
    	{
       Scanner y = new Scanner(System.in);
       Date date = new Date(); 
       SimpleDateFormat format = new SimpleDateFormat("dd-M-yyyy");
       Calendar calendar = new GregorianCalendar();
       
       System.out.print("Enter Your BDAY:");
       String input_bday = y.nextLine();
       Date bday = format.parse(input_bday);
       
       int year = calendar.get(Calendar.YEAR);
       calendar.setTime(bday);
       int byear = calendar.get(Calendar.YEAR);
       
       int age = year - byear;
       System.out.print("My age: " + age);        
        
       
       	

       
    }
}
