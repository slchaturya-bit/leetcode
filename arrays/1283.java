class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int max = nums[0];

        // Find maximum number
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int low = 1;
        int high = max;

        while (low <= high) {

            int div = low + (high - low) / 2;
            int sum = 0;

            // Calculate sum for this divisor
            for (int i = 0; i < nums.length; i++) {

                int x = nums[i] / div;

                // Round up if there is a remainder
                if (nums[i] % div != 0) {
                    x++;
                }

                sum += x;
            }

            if (sum <= threshold) {
                // This divisor works.
                // Try to find a smaller one.
                high = div - 1;
            } else {
                // Divisor is too small.
                // Try a larger one.
                low = div + 1;
            }
        }

        return low;
    }
}