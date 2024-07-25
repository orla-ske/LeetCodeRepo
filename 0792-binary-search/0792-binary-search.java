class Solution {
    public int search(int[] nums, int target) {
        int left = 0; 
        int right = nums.length-1; 

        while(right>=left){
            if(nums[left]==target){
                return left;
            }else if(nums[right]==target){
                return right;
            }

            right--;
            left++;
        }

        return -1;
    }
}