//Akriti Kumari Dev
import java.util.*;
public class triangle3 {
public static void main(String[] args) {
System.out.print("\u000C");
int m=0;
for(int i=1;i<=5;i++,m=2){
for(int j=1;j<=5-i;j++){
System.out.print(" ");
}
for(int k=i;k>=1;k--){
System.out.print(k);
}
for(int l=i;l>=2;l--){
System.out.print(m);
++m;
}
System.out.println();
}
}
}
