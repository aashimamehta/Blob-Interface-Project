import java.io.*;
import java.util.*;

public class Board {
   public static void main(String[] args) {
      for(int i = 0; i < 2; i++){
         System.out.println("   |   |   ");
         for(int j =0; j < 2; j++){
            System.out.print("---+");
         }
            System.out.println("---");
      }
      System.out.println("   |   |   ");
   }
}