import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger temp_A = new BigInteger(a,2);
        BigInteger temp_B = new BigInteger(b,2);

        BigInteger sum = temp_A.add(temp_B);

        return sum.toString(2);
    }
}