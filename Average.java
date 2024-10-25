 /*(Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers. */

import java.util.Scanner;

class Average {
   public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the miles  you travelled  ");
int miles = input.nextInt();
//inputs
System.out.println("Enter the time in hours :");
int hr= input.nextInt();
System.out.println("Enter the time in minutes :");
int min = input.nextInt();
System.out.println("Enter the time in seconds :");
int sec = input.nextInt();
//time convesion
double time =((min/60.0)+(sec/3600.0)+hr );

System.out.println("The time is hours is "+time);

//convesion

double kilometers = miles*1.6;
double speed =( kilometers/time );
//output 

System.out.println("The time is :"+hr+ "Hours"+min+"Minutes"+sec+" Seconds");
System.out.println("The speed in miles is "+miles+" And in kilometers is "+kilometers);
System.out.println("The average speed is "+speed +"km/hr");

   } 
}