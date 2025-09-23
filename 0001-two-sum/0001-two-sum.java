import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int [2]; 
        HashMap <Integer, Integer> numsMap = new HashMap<Integer, Integer>(); 

        for(int i=0; i<nums.length;i++){
            numsMap.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            if(numsMap.containsKey(target-nums[i])){
                if(i!=numsMap.get(target-nums[i])){
                    return new int[]{i,numsMap.get(target-nums[i])};
                }
            }
        }
        return result;
    }
}