class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        Arrays.sort(nums);
        
        int i = 0;
        
        while(i<nums.length-1){
            if(nums[i] != nums[i+1]){
                System.out.println(nums[i]);
                if(ans.size() <= 2)
                    ans.add(nums[i]);
                else
                    break;
                i++;
            }else{
                i+=2;
            }
        }
        
        if(ans.size() == 1){
            ans.add(nums[nums.length-1]);
        }
        
        int[] result = new int[2];
        
        result[0] = ans.get(0);
        result[1] = ans.get(1);
        
        return result;
    }
}
