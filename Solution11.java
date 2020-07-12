class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        
        int n = 1<<nums.length;
        
        for(int i=0; i<n; i++){
            subsets.add(getSubset(nums,i));
        }
        
        return subsets;
    }
    
    private List<Integer> getSubset(int[] nums, int i){
        List<Integer> subset = new ArrayList<>();
        
        int n = 0;
        int mask = 1;
        
        while(i != 0){
            if((i&mask) == 1)
                subset.add(nums[n]);
            
            n++;
            i = i>>1;
        }
        
        return subset;
    }
}
