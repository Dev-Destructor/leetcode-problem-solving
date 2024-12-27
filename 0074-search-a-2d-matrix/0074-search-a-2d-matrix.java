class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int totalVals = 0;
        
        for(int i = 0; i < n; i++) {
            totalVals += matrix[i].length;
        }
        
        int l = 0, h = totalVals - 1;
        
        while(l <= h) {
            int mid = (l + h) / 2;
            int x = mid / m;
            int y = mid % m;
            
            if(matrix[x][y] == target) {
                return true;
            } else if(matrix[x][y] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        
        return false;
    }
}