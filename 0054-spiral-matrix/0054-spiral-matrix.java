class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        
        while(top <= bottom && left <= right) {
            for(int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            for(int j = top; j <= bottom; j++) {
                ans.add(matrix[j][right]);
            }
            right--;

            if(top <= bottom) {
                for(int k = right; k >= left; k--) {
                    ans.add(matrix[bottom][k]);
                }
                bottom--;
            }

            if(left <= right) {
                for(int l = bottom; l >= top; l--) {
                    ans.add(matrix[l][left]);
                }
                left++;
            }
        }
        
        return ans;
    }
}