//To calculate leap year in java
//A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400.

import java.util.Scanner;

class Leapyear {
   public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("Enter the year you want to get if its a leap");
    int year =input.nextInt();
    if(year%4==0||year%400==0 && year%100!=0){
        System.out.println(year +"  is a leap year");
    }else{
        System.out.println(year +" Its not a leap year");

    }
   } 
}