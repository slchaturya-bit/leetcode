class Solution {
    public int[] applyOperations(int[] nums) {
        
       

        for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] == nums[i + 1]) {
        nums[i] = nums[i] * 2;
        nums[i + 1] = 0;
    }
}

    int left = 0;

for (int right = 0; right < nums.length; right++) {
    if (nums[right] != 0) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
    }
   
}
        return nums ;
    }
}
