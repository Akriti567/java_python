
import java.util.Scanner;
 public class kmtomiles{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value in kilometer");
        double kilometer=sc.nextDouble();
        double miles=0.621*kilometer;
        System.out.println("Convert kilometer into miles"+miles);
        
        
        
        
    }
}