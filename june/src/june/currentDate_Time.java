package june;

import java.time.LocalDate;
import java.time.LocalTime;

public class currentDate_Time {

	public static void main(String[] args) {
		System.out.println("current Date :");
		LocalDate Date = LocalDate.now();
		System.out.println(Date);
		
		LocalTime Time1 = LocalTime.now();
		System.out.println("current time :");
		System.out.println(Time1);
	}

}
