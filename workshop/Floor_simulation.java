

//Akriti Kumari Dev
    import java.util.Scanner;
public class Floor_simulation
{
public static void main(String[] arg){
Scanner scan = new Scanner(System.in);
System.out.println("What floor are you in? ");
int floor = scan.nextInt();
int actualFloor ;
if (floor > 13){
actualFloor = floor -1;
}else {
actualFloor = floor;}
System.out.println("The elevator will travel to the actual floor " + actualFloor);}
}

