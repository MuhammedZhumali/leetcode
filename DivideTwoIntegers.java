# Problem: https://leetcode.com/problems/two-sum/
# Date: 2025-04-30

class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) return 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        
        int quotient = 0;
        while (ldividend >= ldivisor) {
            long temp = ldivisor;
            long multiple = 1;
            
            while (ldividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            
            ldividend -= temp;
            quotient += multiple;
        }
        
        return sign * quotient;
    }
}
