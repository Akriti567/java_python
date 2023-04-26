//Akriti Kumari Dev
import java.util.*;
public class SeriesInfinite {
	public static void main(String[] args) {
	System.out.print("\u000C");
	int b=100;
	first:
		for(int i=100;i<=200;i+=2){
			Scanner YN = new Scanner(System.in);
			System.out.println("Enter 1 to add "+b+" with "+ (i+=2)+" or enter any other number to discontinue");
			int a = YN.nextInt();
			if(a==1){
				b=b+i;
				continue;
			}
			break;
		}
	System.out.println("The sum of the numbers is "+b+".");
	}
}

