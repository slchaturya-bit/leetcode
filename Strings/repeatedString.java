
class Solution {
    public boolean repeatedSubstringPattern(String s) {

        // Step 1: Try different substring lengths
        // i starts at 1 because the substring must not be empty
        for (int i = 1; i < s.length(); i++) {

            // Step 2: Skip lengths that cannot divide
            // the original string length evenly
            if (s.length() % i != 0) {
                continue;
            }

            // Step 3: Extract the first i characters
            // Example: s = "abab", i = 2, part = "ab"
            String part = s.substring(0, i);

            // Step 4: Start with an empty string
            // We will build the repeated pattern here
            String repeated = "";

            // Step 5: Calculate how many copies are needed
            // Example: 4 / 2 = 2 copies
            for (int j = 0; j < s.length() / part.length(); j++) {

                // Add one copy of part each time
                repeated = repeated + part;
            }

            // Step 6: Compare the built string with s
            // If they match, we found a repeating pattern
            if (repeated.equals(s)) {
                return true;
            }
        }

        // Step 7: No substring length worked
        return false;
    }
}
