class Solution {
    public int singleNumber(int[] nums) {

        // Initialize answer to 0.
        // XOR with 0 gives the number itself (0 ^ x = x).
        int ans = 0;

        // Traverse each number in the array.
        for (int num : nums) {

            // XOR the current answer with the current number.
            // If the same number appears twice:
            // num ^ num = 0 (they cancel each other).
            // Only the number that appears once will remain.
            ans = ans ^ num;
        }

        // Return the single number that was not cancelled.
        return ans;
    }
}