//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(nums[0], nums[0]);
        
        for(int i = 1; i < nums.length; i++)
            {
            if(map.containsKey(nums[i]))
                return true;
            else
                map.put(nums[i], nums[i]);
            }
        
        return false;
    }
}
