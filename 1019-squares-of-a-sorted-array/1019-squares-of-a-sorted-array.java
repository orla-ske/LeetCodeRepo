class Solution {
    public int[] sortedSquares(int[] nums) {
        int count = 0;
        for(int i: nums){
            nums[count]= i*i;
            count++;
        }

       Arrays.sort(nums);
       return nums;
    }
}