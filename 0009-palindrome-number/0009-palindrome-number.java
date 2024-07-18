class Solution {
    public boolean isPalindrome(int x) {
        int originalX = x;
        if (x < 0) {
            return false;
        }
        
        int reversedX = 0; 
        
        Math.abs(x);
        
        while (x > 0) {
            int ld = x % 10;
            reversedX = (reversedX * 10) + ld;
            x = x / 10;
        }
        
        if (reversedX == originalX) {
            return true;
        } else {
            return false;
        }
    }
}