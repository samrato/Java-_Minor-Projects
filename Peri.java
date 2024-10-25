        /*Area and perimeter of a circle) Write a program that displays the area and perim-
eter of a circle that has a radius of 5.5 using the following formula:
perimeter = 2 * radius * p
area = radius * radius * p */

import java.util.Scanner;

class Peri {
  public static void main(String[] args) {
        System.out.println("Enter the radius :");
        Scanner miriam = new Scanner(System.in);
        double radius=miriam.nextDouble();
        double perimeter=2*radius*3.142;
        double area =radius*radius*3.142;
        System.out.println("The perimeter is :"+perimeter);
        System.out.println("The area is :"+area);
  }  
}
