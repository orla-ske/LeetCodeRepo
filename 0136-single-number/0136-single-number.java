class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }

        Arrays.sort(nums);
        int count=1;
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }else if(nums[i]!=nums[i+1] && count > 1){
                count = 1;
            }else if( nums[i]!=nums[i+1] && count == 1){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }

}