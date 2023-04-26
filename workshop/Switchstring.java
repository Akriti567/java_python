
/**
 * Write a description of class string here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//Akriti Kumari Dev
import java.util.Scanner;
    public class Switchstring{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("We have:Honda dio,TVS iQube Electric,Ather 450X,Suzuki Access 125");
        System.out.println("Enter your choice of scooty:");
        String scooty=sc.nextLine();
        switch (scooty){
            case"Honda dio":
            System.out.println("The price of Honda dio is Rs 74353");
            break;
            case"TVS iQube Electric":
            System.out.println("The price of TVS iQube Electric is Rs 161000");
            break;
            case"Ather 450X":
            System.out.println("The price of Ather 450X is Rs 158000");
            break;
            case"Suzuki Access 125":
            System.out.println("The price of Suzuki Access 125 is Rs 87200");
            break;
            default:
                System.out.println("We don't have your selected scooty here.Sorry!");
            }
        }
    }
            
            
            
            
        
        
        
    
    
    
    
    