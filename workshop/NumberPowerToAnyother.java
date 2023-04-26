
//Akriti Kumari Dev
import java.util.Scanner;
public class NumberPowerToAnyother
{
public static void main(String[] args){
int result=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
while(b!=0){
result*=a;
b--;
}System.out.println("The power of" +a+" is"+result);
}
}