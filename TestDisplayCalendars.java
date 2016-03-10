import java.util.*;
import java.lang.*;

public class TestDisplayCalendars {
	//Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month, year;
		
		//Create a object of GregorianCalendar
		GregorianCalendar calendar = new GregorianCalendar();
			
		//Judge how much information does user input
		if(args.length == 2){
			month = Integer.parseInt(args[0]);
			year = Integer.parseInt(args[1]);
		}
		else if (args.length == 1){
			month = Integer.parseInt(args[0]);
			year = calendar.get(Calendar.YEAR);
		}
		else{
			month = calendar.get(Calendar.MONTH) + 1;
			year = calendar.get(Calendar.YEAR);
		}
		
		//Create a object of DisplayCalendars
		DisplayCalendars test = new DisplayCalendars(month, year);
	}
}
