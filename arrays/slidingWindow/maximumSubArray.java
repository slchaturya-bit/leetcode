class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        // Calculate the sum of the first k elements
        // This is our first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Initially, the sum of the first window
        // is considered the maximum sum
        int maxsum = sum;

        // first points to the first element of the window
        int first = 0;

        // last points to the last element of the window
        int last = k - 1;

        // Slide the window until there is no new element to add
        while (last + 1 < nums.length) {

            // Remove the element leaving the window
            // Add the new element entering the window
            sum = sum - nums[first] + nums[last + 1];

            // Update maximum sum if current window has a larger sum
            if (sum > maxsum) {
                maxsum = sum;
            }

            // Move the window one position to the right
            first++;
            last++;
        }

        // Average = maximum sum / number of elements in the window
        // Cast to double so we get decimal result
        return (double) maxsum / k;
    }
}