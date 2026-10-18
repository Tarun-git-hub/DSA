class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor){
            return 1;
        }
        boolean sign = true;

    // Handle overflow case
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
        return Integer.MAX_VALUE;
    }

     sign = true;
    if (dividend >= 0 && divisor < 0) sign = false;
    if (dividend < 0 && divisor > 0) sign = false;

    long n = Math.abs((long) dividend);
    long d = Math.abs((long) divisor);

    long quotient = 0;

    while (n >= d) {
        int cnt = 0;

        while (n >= (d << (cnt + 1))) {
            cnt++;
        }

        quotient += (1L << cnt);
        n -= (d << cnt);
    }

    return sign ? (int) quotient : (int) -quotient;
}

    }
