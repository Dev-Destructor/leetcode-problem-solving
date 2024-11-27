class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 1; i <= numRows; i++) {
            ans.add(generateRow(i));
        }
        
        return ans;
    }
    
    public List<Integer> generateRow(int row) {
        List<Integer> rowVal = new ArrayList<>();
        int ans = 1;
        
        rowVal.add(1);
        
        for(int j = 1; j < row; j++) {
            ans *= row - j;
            ans /= j;
            rowVal.add(ans);
        }
        
        return rowVal;
    }
}