class Solution {
    public int firstUniqChar(String s) {

        // We will return -1 if there is no unique character
        int ans = -1;

        // Character = key, Integer = number of times it occurs
        HashMap<Character, Integer> mp = new HashMap<>();

        // FIRST LOOP:
        // Count how many times every character appears
        for (char ele : s.toCharArray()) {
            mp.put(ele, mp.getOrDefault(ele, 0) + 1);
        }

        // SECOND LOOP:
        // Go from left to right because we need the FIRST unique character
        for (int i = 0; i < s.length(); i++) {

            // Get the frequency of the current character
            // If frequency is 1, it occurs only once
            if (mp.get(s.charAt(i)) == 1) {

                // Return its index
                return i;
            }
        }

        // No character occurred exactly once
        return ans;
    }
}