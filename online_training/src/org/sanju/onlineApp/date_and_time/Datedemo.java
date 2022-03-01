package org.sanju.onlineApp.date_and_time;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Datedemo {
 public static void main(String[] args) {
	LocalDate Ld=LocalDate.now();//inbuilt class to get a date
	//now is used to print current date
	
	
 System.out.println(Ld);//printing date using reference
 LocalDate Indepenennce =LocalDate.of(1947, 8, 15);// of is to print the required date 
 System.out.println("independence "+ Indepenennce );
 System.out.println("Today:");
 System.out.println("Tomorrow"+Ld.plusDays(6));
 System.out.println("last day"+Ld.minusDays(9));
 System.out.println("is leap"+Ld.isLeapYear());
 System.out.println(Ld.withDayOfYear(365));
		 
 
 ZonedDateTime currenttime=ZonedDateTime.now();
 ZonedDateTime currenttimeinparis=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
 System.out.println(currenttime);
 System.out.println(currenttimeinparis);
 }
}
