// https://leetcode.com/problems/plus-one

class Solution {
    public int[] plusOne(int[] digits) {
        
        
        for(int i = digits.length - 1; i >= 0; i--)
        {
            if(digits[i] != 9) {
                digits[i] += 1;
                    return digits; //if all updated, no new space
            }
            else
            {
                digits[i] = 0;
            }
        }
        
        int[] arr = new int[digits.length + 1]; //when out of room
        arr[0] = 1;
        return arr;
    }
}
