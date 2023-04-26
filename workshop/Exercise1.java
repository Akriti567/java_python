import java.util.*;
public class Exercise1{
    public static void main(String[]args){
        List<String>Bikes=new ArrayList<String>();
        Bikes.add("Bullet");
        Bikes.add("Pulsar");
        Bikes.add("Duke");
        Bikes.add("NS");
        Bikes.add("FZ");
        System.out.println(Bikes);
        Bikes.add("Yamaha");
;        Bikes.add("Aprilla");
        System.out.println("The updated list of bikes is"+Bikes);
        if(Bikes.contains("Yamaha")){
            System.out.println("Found the"+Bikes.get(5)+"element");
        }else{
            System.out.println("There is no such element");
        }
        }
        }
        
        
        
        
        
        



        
    
