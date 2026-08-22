class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        // Swap characters from both ends until pointers cross
        while (left <= right) {
            char temp = s[left];  // Store left character
            s[left] = s[right];   // Move right character to left
            s[right] = temp;      // Move left character to right

            left++;               // Move left pointer forward
            right--;              // Move right pointer backward
        }
    }
}