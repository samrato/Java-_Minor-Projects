package Loops;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        //System.out.println("Enter the multiplication table you want to gets its value ");
        // int a=input.nextInt();
        
      //  int a=2;
        int i;
        int results;

for(i=0;i<15;i++){
    for(int j=0;j<15;j++){
        results=j*i;
        System.out.println(i+"x"+j+"="+results +"\t" );
    }
    System.out.print("\t");

}
   
}
}
