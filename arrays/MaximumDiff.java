public class Solution {
    public int maximumDifference(int[] nums) {

        // Store the smallest number seen so far
        int min = nums[0];

        // Store the maximum difference found so far
        // -1 means no valid increasing pair has been found yet
        int diff = -1;

        // Start from index 1 because nums[0] is already our initial min
        for(int i = 1; i < nums.length; i++){

            // If current number is greater than the smallest previous number,
            // we have a valid increasing pair
            if(nums[i] > min) {

                // Calculate the difference between current number and min
                int mdiff = nums[i] - min;

                // If this difference is the biggest so far, update diff
                if(mdiff > diff)
                    diff = mdiff;
            }

            // If current number is smaller than min,
            // make it the new smallest number
            if(nums[i] < min)
                min = nums[i];
        }

        // Return the maximum difference
        // Returns -1 if no increasing pair exists
        return diff;
    }
} 
