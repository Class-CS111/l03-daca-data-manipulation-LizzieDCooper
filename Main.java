// STUDENT NAME: Lizzie Cooper
// DATE: 2/7/25

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
		int dayToday;
		int monthToday;
		int yearToday;
		int aToday;
		int mToday;
		int yToday;
		//String todayJDN;  
		int calcJDNToday;

		int dayBirth;
		int monthBirth;
		int yearBirth;
		int aBirth;
		int mBirth;
		int yBirth;
		//String birthdayJDN;
		int calcJDNBirth;

		int dayDifference;
		int approxDifference;
		/***** INITIALIZATION SECTION *****/
		dayToday = 2;
		monthToday = 2;
		yearToday = 2020;
		aToday = (14 - monthToday) / 12;
		mToday = monthToday + (12*aToday) - 3;
		yToday = yearToday + 4800 - aToday;

		dayBirth = 26;
		monthBirth = 8;
		yearBirth = 1918;
		aBirth = (14 - monthBirth) / 12;
		mBirth = monthBirth + (12*aBirth) - 3;
		yBirth = yearBirth + 4800 - aBirth;
		
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
		//todayJDN = monthToday + "/" + dayToday+ "/" + yearToday;
		calcJDNToday = dayToday + ((153*mToday + 2 )/(5)) + (365*yToday) + (yToday/4) - (yToday/100) + (yToday/400) - 32045;

		//birthdayJDN = monthBirth + "/" + dayBirth+ "/" + yearBirth;
		calcJDNBirth = dayBirth + ((153*mBirth + 2 )/(5)) + (365*yBirth) + (yBirth/4) - (yBirth/100) + (yBirth/400) - 32045;
		
		dayDifference = calcJDNToday - calcJDNBirth;
		approxDifference = dayDifference / 365; 
		/***** OUTPUT SECTION *****/
		System.out.println("Julian Day Number for today's date, " +  monthToday + "/" + dayToday+ "/" + yearToday + ", is " + calcJDNToday);
		System.out.println();
		System.out.println("Julian Day Number for birthday, " + monthBirth + "/" + dayBirth+ "/" + yearBirth + ", is " + calcJDNBirth);
		System.out.println(); 
		System.out.println("The difference in days is " + dayDifference + ", which makes you approximately " + approxDifference + " years old!");
  }
}