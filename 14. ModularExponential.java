import java.math.BigInteger;

public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        BigInteger base = BigInteger.valueOf(x);
        BigInteger exponent = BigInteger.valueOf(n);
        BigInteger modulus = BigInteger.valueOf(m);

        BigInteger result = base.modPow(exponent, modulus);

        return result.intValue();
    }
}
