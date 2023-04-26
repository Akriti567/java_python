

import java.util.Scanner;
 public class simpleinterest{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Principal,rate and time:");
         double p=sc.nextDouble();
         double rate=sc.nextDouble();
         double interest=sc.nextDouble();
         double si=(p*rate*interest)/100;
         double amnt=p+si;
         System.out.println("The simple interest is "+si+" and the total amount is "+amnt);
        }
     }
    