class Solution {
    public int[] plusOne(int[] digits) {
        int c = 1;
        int i = digits.length-1;
        
        while(i >= 0){
            digits[i] += c;
            
            if(digits[i] >= 10){
                digits[i] %= 10;
                c = 1;
            }else{
                c = 0;
                break;
            }
            
            i--;
        }
        
        if(c == 1){
            int[] ans = new int[digits.length+1];
            ans[0] = c;
            
            return ans;
        }
        
        return digits;
    }
}
