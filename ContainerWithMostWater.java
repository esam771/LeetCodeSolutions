//https://leetcode.com/problems/container-with-most-water

class Solution {
    public int maxArea(int[] height) {
        
        int max = 0;
        int area = 0;
        int i = 0;
        int j = height.length-1;
        
        //moving in from each side for time complexity
        
        while(i < j)
        {
            //choosing shorter sidewall to find area
            if(height[i] < height[j]) //keeps taller ones
            {
                area = height[i] * (j - i);
                i++; //moving left side
            } 
            else 
            {
                area = height[j] * (j - i);
                j--; //moving right side
            }
            
            if(area > max)
                max = area;
        }
        return max;
    }
}
