
//Akriti Kumari Dev
import java.util.Scanner;
public class buzzOrNot
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
         if(a%7==0 || a%10==7){
            System.out.println("Buzz Number");
        } else {
            System.out.println("Not a Buzz Number");
        }
    }   
}

