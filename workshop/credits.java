//Akriti Kumari Dev
import java.util.Scanner;
public class credits
{public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of credits:");
int a =sc.nextInt();
if (a>=90){
System.out.println("Senior Status");
}else if(a>=60){
System.out.println("Junior Status");
}else if(a>=30){
System.out.println("Sophomore Status");
}else{
System.out.print("Freshman Status");
}
}

}