public class Solution {

    public int reverseBits(int n) {
        int ans = 0;
        for(int i=0;i<Integer.SIZE;i++) {

            int k = (int)(n & 1);

            if(k > 0) {
                ans += (int)(1L << (31-i));
            }
            n = n >> 1;
        }
        return ans;
    }
}