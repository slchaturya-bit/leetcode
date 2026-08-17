class Solution {
    public double myPow(double x, int n) {
        double ans = 1; 
        // ans stores the final answer

        long power = n; 
        // convert n to long to safely handle very large negative n

        if (power < 0) {
            power = -power;
            // make negative power positive
        }

        while (power > 0) {
            // continue until power becomes 0

            if (power % 2 == 1) {
                // if power is odd, take current x into the answer
                ans = ans * x;
            }

            x = x * x;
            // square x to get the next power
            // x, x², x⁴, x⁸...

            power = power / 2;
            // divide power by 2
        }

        if (n < 0) {
            // x^(-n) = 1 / x^n
            ans = 1 / ans;
        }

        return ans;
        // return the final answer
    }
}

