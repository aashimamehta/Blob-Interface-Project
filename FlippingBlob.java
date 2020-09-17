public class FlippingBlob extend MyBlob{
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
}