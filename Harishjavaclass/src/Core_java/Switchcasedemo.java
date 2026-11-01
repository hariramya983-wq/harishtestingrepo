package Core_java;

public class Switchcasedemo {

	public static void main(String[] args) {
		String day="wednesday";
		
		/*
		switch(day)
		{
		case  1 : System.out.println("Monday"); break;
		case  2 : System.out.println("Tuesday"); break;
		case  3 : System.out.println("wednesday"); break;
		case  4 : System.out.println("Thursday"); break;
		case  5 : System.out.println("Friday"); break;
		default : System.out.println("Invalid date");
		}
*/
		switch(day)
		{
		case  "monday" : System.out.println("1"); break;
		case  "Tuesday" : System.out.println("2"); break;
		case  "wednesday" : System.out.println("3"); 
		case  "Thursday" : System.out.println("4"); 
		case  "Friday" : System.out.println("5"); 
		default : System.out.println("Invalid date");
	}
	}
}
