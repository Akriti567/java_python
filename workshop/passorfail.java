
import java.util.Scanner;
public class passorfail{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double m1,m2,m3,m4,avg;
        System.out.println("Enter Nepali marks:");
        m1=sc.nextDouble();
        System.out.println("Enter English marks:");
        m2=sc.nextDouble();
        System.out.println("Enter math marks:");
        m3=sc.nextDouble();
        System.out.println("Enter social marks:");
        m4=sc.nextDouble();
        avg=(m1+m2+m3+m4)/4;
        System.out.println("Your overall percentage is"+avg);
        if (avg>=40.00&& m1>40.00&& m2>40.00&& m3>40.00&& m4>40.00){
            System.out.println("You are pass");
        }
        else{
            System.out.println("You are fail");
        
        }
    }
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        
        
        
}
    