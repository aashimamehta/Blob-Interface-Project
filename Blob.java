import java.util.*;
import java.io.*;

public abstract class Blob {
   protected int[][] grid; //blob is defined as blob of grid //feild
   
   public Blob() {
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
   
   public abstract void cycle(); //you can introduce this abstract method here
   //we will be defineing it in another file GrowingBlob()
   //which will be an extension of blob()... "inheritance"
   /*after creating this abstract method the files wouldnt compile therefore we need
   some other method like "GrowingBlob to take over some funtionality
   from this class!
   */
   
   public int compareTo(Blob other) {
      //returns neg/pos/0
//       if(this.weight() > other.weight()){
//          return 1;
//       }
//       else if(this.weight() < other.weight()){
//          return -1;
//       }
//       return 0;
      return this.weight() - other.weight();
   }
   
   //helper method
   public int weight(){
      //total of all values in both blobs //calculation method
      int total = 0;
      for(int r = 0; r < grid.length; r++){
         for(int c=0; c < grid[0].length; c++){
            total += grid[r][c];
         }
      }
      return total;
   }
   
   public String toString() {
      String build = " -----------------\n";
      for(int r = 0; r < grid.length; r++) {
         build += "|\t";
         for(int c = 0; c < grid[0].length; c++) {
         //ternanry operator: replacing 0s in the blob with dashes
            String spot = grid[r][c] == 0 ? "-" : ""+grid[r][c];
            build += spot + "\t";
         }
         build += "|\n";
      }
      build += " -----------------\n";
      return build;
   }
}