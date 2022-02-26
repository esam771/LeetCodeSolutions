//https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
     if(x < 0)
	            return false;
	        
	        int[] arr = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,}; //highest case, 2^31, is 10 digits
	        int digit = 0;
	        
	        while(x >= 1)
	        {
	            arr[digit] = x % 10;
	            x = x / 10;
	            digit++;
	        }
	        /*
	        for(int k = 0; k < digit; k++)
	        	System.out.print(arr[k] + " ");
	        
	        System.out.println();
	        System.out.println();
	        */
	        
	        int i = 0;
	        
	        while(digit > i)
	        {
	        	//System.out.println(arr[digit - 1] + " " + arr[i]);
	        	
	            if(arr[digit - 1] != arr[i])
	                return false;
	                
	            i++;
	            digit--;
	        }
	        
	        return true;
	    }
}
