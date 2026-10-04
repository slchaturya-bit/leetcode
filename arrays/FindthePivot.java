class Solution {
    public int pivotIndex(int[] nums) {
        int pivotIdx = 1;
        for(int i=0;i<nums.length;i++)
        {
            int leftSum = 0;
            int rightSum = 0;
            
            for(int j= 0 ;j<i;j++)
            leftSum+=nums[j];

            for(int j=i+1;j<nums.length;j++)
            {
                rightSum+=nums[j];
            }
            if(leftSum==rightSum)
            return  i;
        }
        return -1;
    }
}
// Take the current index i as the pivot position.
// Start j from 0 because we want to check elements from the beginning.
// Keep going while j is less than i.
// This means we include all elements BEFORE the pivot.
// Add each of those elements to leftSum.

// Start j from i + 1 because we want elements AFTER the pivot.
// Keep going while j is less than the array length.
// Add each of those elements to rightSum.

// Now compare leftSum and rightSum.
// If both sums are equal, the current i is a pivot index.