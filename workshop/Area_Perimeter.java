


    import java.util.Scanner; 
public class Area_Perimeter 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("I=");
        int I = sc.nextInt();
        System.out.print("w=");
        int w=sc.nextInt();
        int p=2*(I+w);
        int a=I*w;
        System.out.println("Area of rectangle="+a);
        System.out.println("Perimeter of rectangle="+p);
        
        
        
        
    }
}