public class GrowingBlob extends Blob {
   public void cycle() {
   /*this is the method that was introduced as an asbstract method in 
   blob class! we shouldn't add "Abstract" keyword in the file here because 
   this file is an extension of blob!!!
   --becasue we have this file that has all the functionality from blob
   then we can change the class (which we will be using) in the SimulationEngine  */
   
   //each int goes up by one
   
      for(int r = 0; r < grid.length; r++) {
         for(int c = 0 ; c < grid[0].length; c++){
            grid[r][c]++;
            grid[r][c] %= 10; //grid[r][c] = grid[r][c] %10;
         }
      }
   
   }
   
   
   
}