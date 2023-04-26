//Akriti Kumari Dev
import java.util.Scanner;
public class ChildorAdult
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int a=sc.nextInt();
        if(a<18){
            System.out.println("You are a child");}
            else if(a>60){
                System.out.println("You are a senior");}
                else{
                System.out.println("You are an adult");
            }
        }
    }