# https://leetcode.com/problems/two-sum/

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        valsdict = {}
        
        for index, num in enumerate(nums):
            val = target - num # val is number trying to find in map
            if val in valsdict: # searches map with key of val
                return[valsdict[val], index] # if target value found, returns indicies of solution
            else:
                valsdict[num] = index # if not yet found, adds values to hashmap 'valsdict'
            
