class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int count = 0;
        char[] cArray = s.toCharArray();

        for (int i = 0; i < cArray.length - 1; i++) {
            if (map.get(cArray[i]) < map.get(cArray[i + 1])) {
                count -= map.get(cArray[i]);
            } else {
            count += map.get(cArray[i]);
            }
        }
        count += map.get(cArray[cArray.length - 1]);
        return count;
    }
}