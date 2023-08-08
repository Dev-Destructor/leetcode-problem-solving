import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
    BigInteger binaryA = new BigInteger(a, 2);
    BigInteger binaryB = new BigInteger(b, 2);

    BigInteger sum = binaryA.add(binaryB);
    String binarySum = sum.toString(2);

    return binarySum;
    }
}