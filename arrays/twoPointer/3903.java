class Solution {

    public int firstStableIndex(int[] nums, int k) {

        // minIndex[i] stores the INDEX of the minimum element
        // from position i to the end of the array.
        int[] minIndex = new int[nums.length];

        int min = Integer.MAX_VALUE;
        int vall = -1;

        // LOOP 1: Find the minimum from RIGHT to LEFT
        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] < min) {
                min = nums[i];
                vall = i;
            }

            // Store the index of the minimum for this i
            minIndex[i] = vall;
        }

        // max = maximum value found from the LEFT
        int max = Integer.MIN_VALUE;

        // val = index of the maximum value
        int val = -1;

        // LOOP 2: Move LEFT to RIGHT and find the prefix maximum
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
                val = i;
            }

            // Compare:
            // maximum from 0 to i
            // MINIMUM from i to n-1
            if (max - nums[minIndex[i]] <= k) {
                return i;
            }
        }

        return -1;
    }
}