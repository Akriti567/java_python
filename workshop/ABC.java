//Akriti Kumari Dev
import java.util.Scanner;
public class ABC
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter any of the three:A,B or C:");
char a=sc.next().charAt(0);
if (a=='A'|| a=='B'|| a=='C'){
if (a=='A'){
System.out.println("Apple");
}
else if(a=='B'){
System.out.println("Banana");}
else{
System.out.println("Coconut");
}
} else{
System.out.println("Invalid input");
}
}
}