
import java.util.Scanner;
 
public class circumferenceofcircle {
 
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("r=");
 double r=sc.nextDouble();
 double pi=3.14;
 double circumference=2*pi*r;
 double area=pi*r*r;
 
 
 System.out.println("circumference of circle is " + circumference);
 System.out.println("Area of Circle is" +area);
 
    }
 
}