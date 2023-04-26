import java.util.*;
public class hash
{
    public static void main(String[]args){
        HashSet<String>Bikes=new HashSet<String>();
        Bikes.add("Bullet");
        Bikes.add("Pulsar");
        Bikes.add("Duke");
        Bikes.add("NS");
        Bikes.add("FZ");
        System.out.println("Original Hash Set:"+Bikes);
        String[] new_array=new String[Bikes.size()];
        Bikes.toArray(new_array);
        System.out.println("Array elements:");
        for(String element :new_array){
            System.out.println(element);
            
            
        }
    }
}