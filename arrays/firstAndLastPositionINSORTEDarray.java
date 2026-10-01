class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // -------- FIRST OCCURRENCE --------
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {

                ans[0] = mid;

                // Target found, but search LEFT for an earlier occurrence
                // LEFT → move high
                high = mid - 1;
            }
            else if (nums[mid] < target) {

                // Target is on the RIGHT
                // RIGHT → move low
                low = mid + 1;
            }
            else {

                // Target is on the LEFT
                // LEFT → move high
                high = mid - 1;
            }
        }


        // -------- LAST OCCURRENCE --------
        low = 0;
        high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {

                ans[1] = mid;

                // Target found, but search RIGHT for a later occurrence
                // RIGHT → move low
                low = mid + 1;
            }
            else if (nums[mid] < target) {

                // Target is on the RIGHT
                // RIGHT → move low
                low = mid + 1;
            }
            else {

                // Target is on the LEFT
                // LEFT → move high
                high = mid - 1;
            }
        }

        return ans;
    }
}