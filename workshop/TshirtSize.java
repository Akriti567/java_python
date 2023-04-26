//Akriti Kumari Dev
import java.util.Scanner;
public class TshirtSize
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Tshirt size:");
        String size=sc.next();
        switch(size){
            case"XXXL":
            System.out.println("price for XXXL is RS 900");
            break;
            case"XXL":
            System.out.println("price for XXL is RS 800");
            break;
            case"XL":
            System.out.println("price for XL is RS 700");
            break;
            case"L":
            System.out.println("price for L is RS 900");
            break;
            default:
                System.out.println("Not available");
        }
    }
}
