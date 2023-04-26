
//Akriti Kumari Dev
import java.util.Scanner;
public class Factorial1
{
public static void main(String[] args){
int fac=1;
int i=1;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int a=sc.nextInt();
while(i<=a){
fac*=i;
i++;
}System.out.println(fac);
}
}