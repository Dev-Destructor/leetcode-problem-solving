class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        int newNum = 0;
        x = Math.abs(x);

        while (x > 0) {
            int lastDigit = x % 10;
            
            if (newNum > (Integer.MAX_VALUE - lastDigit) / 10) {
                return 0;
            }
            
            newNum = (newNum * 10) +  lastDigit;
            x = x / 10;
        }
        
        if (isNegative) {
            return newNum *= -1;
        } else {
            return newNum;
        }
    }
}