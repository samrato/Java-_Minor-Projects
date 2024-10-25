 /*To find fn if  fo=1
        f1=1
        find fn */

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
       System.out.println("Enter number of times you want to get :");
       Scanner input =new Scanner(System.in);
       int n =input.nextInt();
int i=0;
int fn ;
int f1=1;
int fo=1;

       while(i<n){
              fn=fo+f1;
              i++;
              System.out.println("The fn is "+fn);
              fo=f1;
              f1=fn;
       }
      
    }
}        

