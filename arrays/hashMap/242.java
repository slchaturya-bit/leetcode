import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {

        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Map for storing character frequency of s
        HashMap<Character, Integer> map1 = new HashMap<>();

        // Map for storing character frequency of t
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Go through every character of s
        for (char ch : s.toCharArray()) {

            // Get current count of ch
            // If ch is not present, use 0
            // Then increase the count by 1
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        // Go through every character of t
        for (char ch : t.toCharArray()) {

            // Count how many times each character appears in t
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        // Compare both maps
        // If character frequencies are exactly the same → true
        // Otherwise → false
        return map1.equals(map2);
    }
}