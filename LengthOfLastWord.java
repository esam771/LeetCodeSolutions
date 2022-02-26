//https://leetcode.com/problems/length-of-last-word

class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] letters = s.split("");
        int lastletter = letters.length-1;
        boolean notspace = true;
        
        while(letters[lastletter].compareTo(" ") == 0)
        {
            lastletter--;
        }
        
        
        for(int i = lastletter; i >= 0; i--)
        {
            if(letters[i].compareTo(" ") == 0)
            {
                return(lastletter - i);
            }
        }
        
        return lastletter + 1;  
    }
}
