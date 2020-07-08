class Solution {
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == 1){
                    if(i-1 < 0 || grid[i-1][j] == 0) p+=1;
                    
                    if(j == grid[i].length-1 || grid[i][j+1] == 0) p+=1;
                    
                    if(i == grid.length-1 || grid[i+1][j] == 0) p+=1;
                    
                    if(j-1 < 0 || grid[i][j-1] == 0) p+=1;
                }
            }
        }
        
        return p;
    }
}
