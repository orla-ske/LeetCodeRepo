class Solution {
    public int rob(int[] nums) {
        int prev = nums[0]; 
        int prev2 = 0; 
        int curr = 0; 


        for(int i = 1; i<nums.length;i++){
            int currInd = prev; 
            int skipInd = prev2+nums[i]; 

            curr = Math.max(currInd, skipInd); 

            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
}