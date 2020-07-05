class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> ugly_numbers = new ArrayList<>();
        
        ugly_numbers.add(1);
        
        int ix2 = 0;
        int ix3 = 0;
        int ix5 = 0;
        
        while(ugly_numbers.size() < n){
            int next = Math.min(ugly_numbers.get(ix2)*2, Math.min(ugly_numbers.get(ix3)*3,ugly_numbers.get(ix5)*5));
            
            ugly_numbers.add(next);
            
            if(ugly_numbers.get(ix2)*2 == next) ix2++;
            if(ugly_numbers.get(ix3)*3 == next) ix3++;
            if(ugly_numbers.get(ix5)*5 == next) ix5++;
        }
        
        return ugly_numbers.get(n-1);
    }
}
