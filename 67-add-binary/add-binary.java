import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
      BigInteger x = new BigInteger(a, 2);  // Parse binary string 'a' to BigInteger
        BigInteger y = new BigInteger(b, 2);  // Parse binary string 'b' to BigInteger

        // Add the two BigIntegers
        BigInteger z = x.add(y);  // Add the two BigIntegers

        // Convert the result back to a binary string
        return z.toString(2);
    }
}