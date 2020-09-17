import java.util.*;
import java.io.*;

public class SimulationEngine {

   public static void main(String[] args) {
      Myblob b = new Myblob();
      b.load("blobs/blob1.blb");
      
      Blob b2 = new SparwlingBlob();
      b2.load("blobs/blob3.blb");
      
      System.out.println("Start\n" + b); 
      
      System.out.println("Start B\n" + b.getClass().getSimpleName() + "\n" + b);
      System.out.println("Start B2\n"+ b2.getClass().getSimpleName() + "\n" + b2);
      
      System.out.println("Simulation for a " + b.getClass().getSimpleName());
      
      Scanner console = new Scanner(System.in);
      do{
         b.cycle();
         b2.cycle();
         System.out.println("B " + b.getClass().getSimpleName() + "\n" + b);
         System.out.println("current weight  = " + b.weight());
         System.out.println("B2 " + b2.getClass().getSimpleName() + "\n" + b2);
         System.out.println("current weight  = " + b2.weight());
        System.out.println(b.compareTo(b2));
         if(b.compareTo(b2) > 0) {
            System.out.println("First blob is bigger. " );
         } 
         else if(b.compareTo(b2) < 0){
            System.out.println("the second blob is bigger.");
         }
         else{
            System.out.println("Both blobs are same.");
         }
         System.out.println("cycle ? > ");
      }while (console.nextLine().equals("")); //console.equals("") means --> enter
      
   }

}