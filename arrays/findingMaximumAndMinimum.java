class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0; int minIndex = 0;

for(int i=0;i<nums.length;i++){       
if(nums[i] > max) {
    max = nums[i];
    maxIndex = i;
}
if(nums[i] < min) {
    min = nums[i];
    minIndex = i;
}
  }
        int left = Math.min(maxIndex, minIndex);
         int right = Math.max(maxIndex, minIndex); 
         int fromFront = right + 1; 
        int fromBack = nums.length - left;
         int fromBoth = (left + 1) + (nums.length - right);
          return Math.min(fromFront, Math.min(fromBack, fromBoth));
       
    }
}