
//Akriti Kumari Dev
import java.util.Scanner;
public class questionARepeat
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter any of the three:A,B or C:");
char a=sc.next().charAt(0);
if(a=='A'){
System.out.print("Apple");
}
else if(a=='B'){
System.out.print("Banana");
}
else if(a=='C'){
System.out.print("Coconut");
}
else{
System.out.print("Invalid input");
}
}
}