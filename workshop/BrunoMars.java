
//Akriti Kumari Dev
public class BrunoMars
{
    public static void main(String[] args){
        int percent=75;
        int total=500;
        int m=(percent*total)/100;
        if(m>450){
            System.out.println("You got A+");}
        else if(m>400){
            System.out.println("You got A");}
        else if(m>350){
            System.out.println("You got B+");}
        else if(m>300){
            System.out.println("You got B");}
        else if(m>250){
            System.out.println("You got C+");}
        else if(m>200){
            System.out.println("You got C");}
        else{
                System.out.println("Failed");
            }
        }
    }
