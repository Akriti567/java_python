//Akriti Kumari Dev
import java.util.Scanner;
public class StudentsTotalMarks
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your marks on 5 subjects:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int total=(a+b+c+d+e);
        double max=500.0;
        double percent=(total/max)*100;
        System.out.println("Your total marks is:"+total);
        System.out.println("Your percentage is:"+percent);
        if(total>450){
            System.out.println("A+");
        }else if(total>400 ){
            System.out.println("A");}
            else if(total>350){
                System.out.println("B+");}
                else if(total>300){
                    System.out.println("B");}
                    else if(total>200){
                        System.out.println("C");}
                        else{
                            System.out.print("Failed");
                        }
                    }
                }