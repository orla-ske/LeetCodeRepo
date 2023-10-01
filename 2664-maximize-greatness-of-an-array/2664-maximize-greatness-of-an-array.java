class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int ans = 0; 
        int i =0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]<nums[j]){
                ans++;
                i++;
            }
        }

        return ans;
    }
}