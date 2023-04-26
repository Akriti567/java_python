
//Akriti Kumari Dev
import java.util.Scanner;
public class userIntergerValue
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integer numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int add=a+b;
        int sub=a-b;
        int multiply=a*b;
        float division=a/b;
        float modulus=a%b;
        double exponent=Math.pow(a,b);
        System.out.println("Addition is:"+add);
        System.out.println("Subtraction is:"+sub);
        System.out.println("Multiplication is:"+multiply);
        System.out.printf("Division is: %.2f",division);
        System.out.printf("Modulus is: %.2f",modulus);
        System.out.printf("Exponent is: %.2f",exponent);
    }
}
