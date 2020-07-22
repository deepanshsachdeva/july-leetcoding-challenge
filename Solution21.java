class Solution {
    boolean[][] visited; 
        
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = (rows > 0) ? board[0].length : 0;
            
        visited = new boolean[rows][cols];
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(board[i][j] == word.charAt(0) && dfs(board,word,i,j,0))
                    return true;
            }
        }
        
        return false;
    }
    
    public boolean dfs(char[][] board, String word, int i, int j, int ix){
        if(ix == word.length())
            return true;
        
        if(
            i<0 || 
            i>=board.length || 
            j<0 || 
            j>=board[i].length || 
            board[i][j] != word.charAt(ix) || 
            visited[i][j]
        )
            return false;
        
        visited[i][j] = true;
        
        if(
            dfs(board,word,i-1,j,ix+1) || 
            dfs(board,word,i+1,j,ix+1) || 
            dfs(board,word,i,j-1,ix+1) || 
            dfs(board,word,i,j+1,ix+1)
          )
            return true;
        
        visited[i][j] = false;
        
        return false;
    }
}
