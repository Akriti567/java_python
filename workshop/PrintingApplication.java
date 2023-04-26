
   //Akriti Kumari Dev
   import java.util.Scanner;

public class PrintingApplication {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of copies to be printed: ");
int copies = scanner.nextInt();

double pricePerCopy;
if (copies >= 0 && copies <= 99) {
pricePerCopy = 0.30;
} else if (copies >= 100 && copies <= 499) {
pricePerCopy = 0.28;
} else if (copies >= 500 && copies <= 799) {
pricePerCopy = 0.27;
} else if (copies >= 800 && copies <= 1000) {
pricePerCopy = 0.26;
} else {
pricePerCopy = 0.25;
}

double totalPrice = copies * pricePerCopy;

System.out.println("Price per copy: $" + pricePerCopy);
System.out.println("Total Price: $" + totalPrice);

}
}

