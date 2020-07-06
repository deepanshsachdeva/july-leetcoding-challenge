class Solution {
    public int hammingDistance(int x, int y) {
        StringBuilder xsb = new StringBuilder();

        int d = 0;
        int len = 31;

        for (int i=len; i>=0; i--) {
            int mask = 1 << i;

            if ((x & mask) != (y & mask)) d++;
        }
        
        return d;
    }
}
