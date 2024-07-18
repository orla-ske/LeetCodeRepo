class Solution {
    public int[] twoSum(int[] nums, int target) {
        int comp = 0; 
        HashMap <Integer, Integer> mCheck = new HashMap <>(); 

        for(int i = 0; i < nums.length; i++){
            comp = target - nums[i];
            if(mCheck.containsKey(comp)){
                return new int [] {mCheck.get(comp),i};
            }else{
                mCheck.put(nums[i],i);
            }
        }
        return new int [2];
    }
}