class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
    
        while (columnNumber > 0) {
            columnNumber--; // Adjust for 1-based indexing
            char letter = (char) ('A' + columnNumber % 26);
            sb.insert(0, letter);
            columnNumber /= 26;
        }
    
        return sb.toString();
    }
}