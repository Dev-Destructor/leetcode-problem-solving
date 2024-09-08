class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        int reverse = 0;
        
        while(x > 0) {
            if((reverse > Integer.MAX_VALUE / 10) || (reverse < Integer.MIN_VALUE / 10)) {
                return 0;
            }
            
            int lastDigit = x % 10;
            reverse = (reverse * 10) + lastDigit;
            x = x / 10;
        }
        
        if(isNegative) {
            return -reverse;
        } else {
            return reverse;
        }
    }
}