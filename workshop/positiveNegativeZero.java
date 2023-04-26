//Akriti Kumari Dev
import java.util.Scanner;
public class positiveNegativeZero
{
public static void main(String[] args){
int countP=0;
int countN=0;
int countZ=0;
Scanner sc=new Scanner(System.in);
char choice;
System.out.print("Enter y to continue and n to terminate:");
choice=sc.next().charAt(0);
while(choice!='n'){
System.out.print("Enter a number");
int a=sc.nextInt();
if(a<0){
countP++;
}else if(a==0){
countN++;
} else{
countZ++;
}
System.out.print("Enter y to continue and n to terminate:");
choice=sc.next().charAt(0);}

System.out.println("zero:"+countN);
System.out.println("Positive:"+countZ);
System.out.println("Negative:"+countP);
}
}