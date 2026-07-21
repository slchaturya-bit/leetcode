class Solution {
    public int[] runningSum(int[] nums) {
        int sum =0;
         int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            ans[i] = sum;

        }
        return ans;
    }
}
// in this code we are using a variable sum to keep track of the running sum of the elements in the input array nums.
//  We initialize sum to 0 and create a new array ans of the same length as nums to store the running sums.
//  We then iterate through each element in nums, adding it to sum and storing the current value of sum in the corresponding index of ans.
//  Finally, we return the ans array containing the running sums.
