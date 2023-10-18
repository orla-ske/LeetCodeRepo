class Solution {
    public int rob(int[] nums) {
        int prev = nums[0],prev2=0,curr;
        for(int i=1;i<nums.length;i++)
        {
            int notSkippingCurrIDX = prev2 + nums[i];
            int skippingCurrIDX = prev;
            curr = Math.max(notSkippingCurrIDX,skippingCurrIDX);
            prev2 = prev;
            prev = curr;
        }
        return prev;

    }
}