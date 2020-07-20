class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int ai = a.length()-1;
        int bi = b.length()-1;
        int c = 0;
        
        while(ai>=0 && bi>=0){
            int sum = c;
            
            if(ai>=0)
                sum += a.charAt(ai--)-'0';
            
            if(bi>=0)
                sum += b.charAt(bi--)-'0';
            
            System.out.println(sum);
            
            result.append(sum%2);
            
            c = sum/2;
            
            System.out.println(c);
        }
        
        if(c>0)
            result.append(c);
        
        return result.reverse().toString();
    }
}
