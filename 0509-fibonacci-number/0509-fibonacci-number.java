class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if (n == 1) return 1;
        
        int v1 = 0;
        int v2 = 1;
        int ans = 0;
        
        for(int i = 2; i <= n; i++) {
            ans = v2 + v1;
            v1 = v2;
            v2 = ans;
        }
        
        return ans;
    }
}