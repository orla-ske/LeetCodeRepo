import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            
            // Check if complement exists in map before adding current element
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            
            // Add current element to map
            map.put(nums[i], i);
        }
        
        return new int[]{}; // No solution found
    }
}