import java.math.BigInteger;
class Solution {
    BigInteger dummy(int n) {
        BigInteger f = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
    public int uniquePaths(int m, int n) {
        int N = m + n - 2;
        int r = Math.min(m - 1, n - 1);
        BigInteger numerator = dummy(N);
        BigInteger denominator = dummy(r).multiply(dummy(N - r));
        BigInteger result = numerator.divide(denominator);
        return result.intValue();
    }
}