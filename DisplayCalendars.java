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
		printTitle();
		printBody();
	}
	
	//Method to display the title of calendar
	public void printTitle(){
		System.out.println("\t\t" + getMonthName() + " " + getYear());
		System.out.println("---------------------------------------------------");
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
	}
	
	//Method to display the body of calendar
	public void printBody(){
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;		
		int i;
		for(i = 0; i < dayOfWeek; i++){
			System.out.print("\t");
		}
		for(i = 1; i <= getMonthDays(); i++){
			System.out.print(i + "\t");
			if((i + dayOfWeek) % 7 == 0){
				System.out.println();
			}
		}
		System.out.println();
	}
	
	//Accessor method to return the month with character
	public String getMonthName(){
		String[] monthName = {"January", "February", "March", "April",
					"May","June", "July", "August", "September", 
					"October", "November", "December"};
		return monthName[month - 1];
	}
	
	//Accessor method to return the year
	public int getYear(){
		return year;
	}
	
	//Accessor method to return the days of month
	public int getMonthDays(){
		if(month == 1 || month == 3 || month == 5 || month == 7 || 
		   month == 8 || month == 10 || month == 12)
			return 31;
		if(month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		if(month == 2 && calendar.isLeapYear(year))
			return 29;
		else 
			return 28;
	}
}
