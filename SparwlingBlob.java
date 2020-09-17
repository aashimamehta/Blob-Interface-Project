public class SparwlingBlob extends Blob{
   public void cycle(){
      for(int r = 0; r < grid.length; r++){
         for(int c=0; c < grid[0].length; c++){
            int val = grid[r][c];
            if( val > 0){
               grid[r][c] = 0;
               if(c > 0) { grid[r][c-1] += val; } //left
               if( r > 0 ) { grid[r-1][c] += val; } //up
               if( c + 1 < grid[0].length) { grid[r][c+1] +=val;} //right
               if(r + 1 < grid.length ) { grid[r+1][c] +=val;} //down
               mod100();
            }
         }
      }
   }
   
   private void mod100(){
     for(int r = 0; r < grid.length; r++){
       for(int c=0; c < grid[0].length; c++){
         grid[r][c] %= 100;
       }
     }
      
   }
   
}