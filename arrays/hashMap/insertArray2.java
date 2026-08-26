import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        // Create a HashMap
        // Key   = number
        // Value = frequency (how many times the number occurs)
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse nums1 and count the frequency of each number
        for (int num : nums1) {

            // Get current frequency of num
            // If num is not present, getOrDefault returns 0
            // Then add 1 to the frequency
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Create an array to store the intersection
        // Maximum possible answer size is the size of the smaller array
        int[] result = new int[Math.min(nums1.length, nums2.length)];

        // count tells us the index where we should put
        // the next common element
        int count = 0;

        // Traverse nums2
        for (int num : nums2) {

            // Check two things:
            // 1. Does num exist in the map?
            // 2. Is its frequency greater than 0?
            if (map.containsKey(num) && map.get(num) > 0) {

                // num is common, so put it into result
                result[count] = num;

                // Move to the next position in result
                count++;

                // We used one occurrence of num,
                // so decrease its frequency by 1
                map.put(num, map.get(num) - 1);
            }
        }

        // Return only the part of result that actually contains elements
        return Arrays.copyOf(result, count);
    }
}