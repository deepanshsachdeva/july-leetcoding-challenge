class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        Set<String> states = new HashSet<>();
        int loop = 0;
        boolean flag = false;
        
        for(int i=0; i<N; i++){
            int[] next_state = nextState(cells);
            
            String state = Arrays.toString(next_state);
            
            if(!states.contains(state)){
                states.add(state);
                loop++;
            }else{
                flag = true;
                break;
            }
            
            cells = next_state;
        }
        
        if(flag){
             N = N%loop;
            
            for(int i=1; i<=N; i++){
                cells = nextState(cells);
            }
        }
        
        return cells;
    }
    
    private int[] nextState(int[] cells) {
        int[] state = new int[cells.length];
        
        for(int i=1; i<cells.length-1; i++){
            if(cells[i-1] == cells[i+1]){
                state[i] = 1;
            }
        }
        
        return state;
    }
}
