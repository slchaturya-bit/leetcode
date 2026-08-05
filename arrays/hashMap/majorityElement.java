class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of every number
        for (int num : nums) {

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Find the majority element
        for (int key : map.keySet()) {

            if (map.get(key) > nums.length / 2) {
                return key;
            }
        }

        return -1; // This line is never reached because the problem guarantees a majority element.
    }
}