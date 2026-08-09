class Solution {
    public int removeElement(int[] nums, int val) {

        // right → used to scan through every element of the array
        int right = 0;

        // left → keeps track of the position where the next valid
        // (non-val) element should be placed
        int left = 0;

        // Keep scanning until right reaches the end of the array
        while (right < nums.length) {

            // If the current element is NOT equal to val,
            // it is a valid element that we want to keep
            if (nums[right] != val) {

                // Store nums[left] temporarily so we don't lose it
                int temp = nums[left];

                // Put the valid element found by right into
                // the position where left is pointing
                nums[left] = nums[right];

                // Put the old nums[left] value into right
                // (this completes the swap)
                nums[right] = temp;

                // We successfully placed one valid element,
                // so move left to the next position
                left++;
            }

            // Move right forward to check the next element
            right++;
        }

        // left represents the number of valid elements
        // (elements that are NOT equal to val)
        return left;
    }
}