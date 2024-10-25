import java.util.Scanner;

class Hello {
   public static void main(String[] args) {
    System.out.println("Enter an int number");
    
    Scanner input =new Scanner(System.in);
    int num =input.nextInt();
    System.out.println("The int number is :"+num);
    System.out.println("Enter an double number");
    double juma =input.nextDouble();
    System.out.println("The int number is :"+juma);
   } 
}