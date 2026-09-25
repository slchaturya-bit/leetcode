class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> mp1 = new HashMap<>();
        HashMap<String, Character> mp2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            // Check ch → word
            if (mp1.containsKey(ch)) {
                if (!mp1.get(ch).equals(word)) {
                    return false;
                }
            }

            // Check word → ch
            if (mp2.containsKey(word)) {
                if (mp2.get(word) != ch) {
                    return false;
                }
            }

            // Create mappings
            mp1.put(ch, word);
            mp2.put(word, ch);
        }

        return true;
    }
}