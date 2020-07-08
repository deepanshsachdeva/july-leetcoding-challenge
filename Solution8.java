class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> triplets  = new HashSet<>();
        
        if(nums.length == 0)
            return new ArrayList<>(triplets);
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++){
            int l = i+1;
            int r = nums.length-1;
            while(l < r){
                int sum = nums[i]+nums[l]+nums[r];

                if(sum == 0){
                    triplets.add(Arrays.asList(nums[i],nums[l++],nums[r--]));
                } else if(sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        
       return new ArrayList<>(triplets); 
    }
}
