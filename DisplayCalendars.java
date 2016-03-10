import java.util.*;

public class DisplayCalendars {
	//Data fields
	int month, year;
	
	//Create a object of GregorianCalendar
	GregorianCalendar calendar;
	
	//Constructor
	DisplayCalendars(int newMonth, int newYear){
		month = newMonth;
		year = newYear;		
		calendar = new GregorianCalendar(year, (month - 1), 1);
		printMonth();
	}	
	
	//Method to display the calendar
	public void printMonth(){
	}
	
}
