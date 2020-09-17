import java.io.*;
import java.util.*;

public class Myblob {
   protected int[][] grid;
   
   public Myblob() {
      grid = new int[5][5];
   }

      
   public void load(String fileName) {
      try {
         Scanner file = new Scanner(new File(fileName));
         
         for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[0].length; c++) {
               grid[r][c] = file.nextInt();//puts integers into the grid from the file!
            }
         }
         
      } catch(FileNotFoundException e) {
         System.out.println("Cannot load: " + fileName);
      } catch(InputMismatchException e) {
         System.out.println(fileName + " does not meet format expectations.");
      }
   }

 /*
 method : cycle() 
 Preconditions: keeps on cyclings if the user will keep pressing enter.Cycles through the blob without 
   making any changes to any other int values in the blob.
 PostConditions: cycles through the blob and flips 0s to 1s and all 1s to 0s.
 */
 
   public void cycle(){
      for(int r = 0; r < grid.length; r++){
         for(int c = 0; c < grid[0].length; c++){
            if(grid[r][c] == 0){
               grid[r][c] = 1;
            }
            else if(grid[r][c] == 1){
               grid[r][c] = 0;
            }
         }
      }
   }
 
     
   
   public String toString(){
      String out = "";
      out += "===============\n";
      for(int r = 0; r < grid.length; r++){
         for(int c = 0; c < grid[0].length; c++){
            out += " " + grid[r][c] + " " ;
         }
         out += "\n";
      }
      out += "===============";
      return out;
   }

}
/*
 Start B
 Myblob
 ===============
  1  1  1  1  1 
  0  0  0  0  0 
  2  2  2  2  2 
  1  2  3  4  5 
  6  7  8  9  0 
 ===============
 B Myblob
 ===============
  0  0  0  0  0 
  1  1  1  1  1 
  2  2  2  2  2 
  0  2  3  4  5 
  6  7  8  9  1 
 ===============
 
 B Myblob
 ===============
  1  1  1  1  1 
  0  0  0  0  0 
  2  2  2  2  2 
  1  2  3  4  5 
  6  7  8  9  0 
 ===============
 
 B Myblob
 ===============
  0  0  0  0  0 
  1  1  1  1  1 
  2  2  2  2  2 
  0  2  3  4  5 
  6  7  8  9  1 
 ===============
 
 B Myblob
 ===============
  1  1  1  1  1 
  0  0  0  0  0 
  2  2  2  2  2 
  1  2  3  4  5 
  6  7  8  9  0 
 ===============
 l

*/