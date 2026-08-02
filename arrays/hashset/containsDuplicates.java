import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }
}

// the main purpose of using hash set is to know how many distinct elements are there in the array
// if the size of the hash set is less than the length of the array, it means there are duplicates in the array
