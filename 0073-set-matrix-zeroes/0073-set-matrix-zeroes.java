class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        boolean[] markedCol = new boolean[m];
        boolean[] markedRow = new boolean[n];
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    markedRow[j] = true;
                    markedCol[i] = true;
                }
            }
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(markedRow[j] == true || markedCol[i] == true) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}