//Akriti Kumari Dev
import java.util.Scanner;
public class PositiveIntegerFromUser
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int sum=0;
int i=0;
System.out.print("Enter a number");
int a=sc.nextInt();
sum=sum+a;
while(a<100 && a>0){
System.out.print("Enter a number");
a=sc.nextInt();
if(a<100 && a>0){
sum=sum+a;
}
}System.out.print("Sum is"+sum);

}

}
