/*Enering value 3 inputs and computing their avarage */

import java.util.Scanner;

class Aveg {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter num1");
        double num1=input.nextDouble();

        System.out.println("Enter num2");
        double num2=input.nextDouble();

        System.out.println("Enter num3");
        double num3=input.nextDouble();

        double Average =((num1+num2+num3)/3);
        System.out.println(Average);

    }
}